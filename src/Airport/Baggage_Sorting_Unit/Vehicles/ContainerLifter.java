package Airport.Baggage_Sorting_Unit.Vehicles;

import Airplane.Aircraft.Airplane;
import Airport.Airport.Airport;
import Airport.Airport.AirportRecourcePool;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Baggage_Sorting_Unit.IBaggageSortingUnit;
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

  private final int numberOfContainerLoaded;

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
  public IBaggageSortingUnit getBaggageSortingUnit() {
    return null;
  }

  @Override
  public void setContainer(final Container c) {
    container = c;
  }

  /**
   * TODO: Wo wird airplane implementiert
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
   * TODO: was ruft man im cargo system auf
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
   * TODO groundoperations?
   */
  @Override
  public void notifyGroundOperations(final ContainerLifterReceipt containerLifterReceipt) {

  }

  /**
   *
   */
  @Override
  public void returnToAirportResourcePool() {
    AirportRecourcePool
  }

  /**
   * TODO wie sieht die routine aus
   */
  @Override
  public void executeRequest(final GateID gateID) {

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
   * wie komme ich von gateID auf gate
   * Gatelist aus Airport Holen
   * Wo bekomme ich die instanz von airport her oder soll das ganze statisch, singleton sein?
   */
  @Override
  public void setGate(final GateID gate) {

    Airport.getGateList();
    this.gate = gate;
  }

  @Override
  public void setFlashingLightOff() {
    isFlashingLightOn = false;
  }
}
