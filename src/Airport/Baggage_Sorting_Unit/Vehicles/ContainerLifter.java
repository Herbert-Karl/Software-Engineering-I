package Airport.Baggage_Sorting_Unit.Vehicles;

import Airplane.Aircraft.Airplane;
import Airport.Airport.Airport;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Baggage_Sorting_Unit.Loading.LoadingStrategy;
import Airport.Baggage_Sorting_Unit.Receipts.ContainerLifterReceipt;
import Airport.Base.Container;

import java.util.ArrayList;

public class ContainerLifter implements IContainerLifter {

  private final String uuid;

  private final String id;

  private final String type;

  private int speedInMPH;

  private boolean isFlashingLightOn;

  private boolean isDown;

  private Container container;

  private final ArrayList<String> containerIDList;

  private Gate gate;

  private Airplane connectedAirplane;

  private int numberOfContainerLoaded;

  public ContainerLifter(final String uuid, final String id) {
    this.uuid = uuid;
    this.id = id;
    type = null;//TODO set type to something useful
    speedInMPH = 0;
    isFlashingLightOn = false;
    numberOfContainerLoaded = 0;
    containerIDList = new ArrayList<>();
  }

  @Override
  public void setContainer(final Container c) {
    container = c;
    containerIDList.add(c.getID());
    numberOfContainerLoaded++;
  }

  /**
   * Sets the connected airplane to the instance which is connected to the current gate
   */
  @Override
  public void connectToAirplane() {
    connectedAirplane = gate.getAirplane();
  }

  @Override
  public void up() {
    isDown = false;
  }

  /**
   * TODO check if this header is correct
   */
  @Override
  public void transferContainerToCargoSystem() {

  }

  /**
   * TODO: use strategy
   */
  @Override
  public void transferContainerToCargoSystem(final LoadingStrategy strategy) {
    if (!isDown) {
      down();
    }
    up();
    connectedAirplane.getBody()
        .getCargoSystemArrayList()
        .get(0)
        .load(container,
            null);//TODO: get the correct cargosystem from the list | get correct frontStowagePositionID
    down();
  }

  /**
   * Sets attribute isDown
   */
  @Override
  public void down() {
    isDown = true;
  }

  /**
   * resets connectedAirplane
   */
  @Override
  public void disconnectFromAirplane() {
    connectedAirplane = null;
  }

  /**
   * requests ground operations from airport and calls notify with the receipt
   */
  @Override
  public void notifyGroundOperations(final ContainerLifterReceipt containerLifterReceipt) {
    Airport.getAirport().getGroundOperatiosn.notify(
        containerLifterReceipt);//TODO needs airport get GroundOps
  }

  /**
   * Returns this instance to the pool
   */
  @Override
  public void returnToAirportResourcePool() {
    Airport.getAirport().getResourcePool().returnResource(this);
  }

  /**
   * TODO check
   */
  @Override
  public void executeRequest(final GateID gateID) {
    setFlashingLightOn();
    move(15);
    setGate(gateID);
    stop();
    setFlashingLightOff();
    connectToAirplane();
    transferContainerToCargoSystem();
    disconnectFromAirplane();
    notifyGroundOperations(new ContainerLifterReceipt(uuid, id, type, getBaggageSortingUnit(),
        roboter.getSelectedBaggage()));//TODO add correct values for receipt
    returnToAirportResourcePool();
  }

  @Override
  public void setFlashingLightOn() {
    isFlashingLightOn = true;
  }

  @Override
  public void move(final int speedInMPH) {
    this.speedInMPH = speedInMPH;
  }

  @Override
  public void stop() {
    speedInMPH = 0;
  }

  /**
   * Sets the Gate to the instance with the corresponding id
   */
  @Override
  public void setGate(final GateID gate) {

    for (final Gate g : Airport.getAirport().getGateList()) {
      if (g.getGateID() == gate) {
        this.gate = g;
        break;
      }
    }
  }

  @Override
  public void setFlashingLightOff() {
    isFlashingLightOn = false;
  }
}
