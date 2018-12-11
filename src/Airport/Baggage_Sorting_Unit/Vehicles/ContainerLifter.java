package Airport.Baggage_Sorting_Unit.Vehicles;

import Airplane.Aircraft.Airplane;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Baggage_Sorting_Unit.BaggageSortingUnit;
import Airport.Baggage_Sorting_Unit.Loading.LoadingStrategy;
import Airport.Baggage_Sorting_Unit.Receipts.ContainerLifterReceipt;
import Airport.Baggage_Sorting_Unit.Storage.BaggageSortingUnitRoboter;
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

  public ContainerLifter(final String uuid, final String id, final String type) {
    this.uuid = uuid;
    this.id = id;
    this.type = type;
    speedInMPH = 0;
    isFlashingLightOn = false;
    numberOfContainerLoaded = 0;
    containerIDList = new ArrayList<>();
  }

  @Override
  public String toString() {
    String message = "UUID: " + uuid + "\nID: " + id + "\nType: " + type
        + "\nCurrent speed in MpH: " + speedInMPH + "\nCurrent status of lights: ";
    message += ((isFlashingLightOn) ? "on" : "off");
    message += "\nCurrent Gate: " + gate + "\nCurrent fork position: ";
    message += ((isDown) ? "down" : "up");
    message += "\nNumber of loaded containers: " + numberOfContainerLoaded
        + "\nConnected Airplane: " + connectedAirplane + "\nList of container ID'S: ";

    for (final String c : containerIDList) {
      message += c + ", ";
    }

    return message;
  }

  @Override
  public Gate getGate() {
    return gate;
  }

  @Override
  public void setGate(final Gate gate) {
    this.gate = gate;
  }

  public String getUuid() {
    return uuid;
  }

  public String getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  public int getSpeedInMPH() {
    return speedInMPH;
  }

  public boolean isFlashingLightOn() {
    return isFlashingLightOn;
  }

  public boolean isDown() {
    return isDown;
  }

  public Airplane getConnectedAirplane() {
    return connectedAirplane;
  }

  /**
   * sets container, adds its ID to the list and ups te number of containers loaded
   */
  @Override
  public void setContainer(final Container c) {
    container = c;
    containerIDList.add("42");//TODO Get actual container id (c.getID())
    numberOfContainerLoaded++;
  }

  /**
   * Sets the connected airplane to the instance at to the current gate
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
   * TODO: use strategy (probably for cargosystem and frontStowagePositionID
   */
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
    // Airport.getAirport().getGroundOperatiosn() TODO get correct operation
    // new GroundOperationsCenter().notify(containerLifterReceipt);//magically spawns Operation Center TODO call correct notify function
  }

  /**
   * Returns this instance to the pool
   */
  @Override
  public void returnToAirportResourcePool() {
    //Airport.getAirport().getResourcePool().returnResource(this); TODO get correct airport
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
    notifyGroundOperations(new ContainerLifterReceipt(uuid, id, type,
        new BaggageSortingUnit(null, null, null, null),/*TODO get correct baggaeSortingunit*/
        new BaggageSortingUnitRoboter(null, null, null,
            null).getSelectedBaggageList()));/*TODO get correct BaggageSortingRobot*/
    returnToAirportResourcePool();
  }

  @Override
  public void setFlashingLightOn() {
    isFlashingLightOn = true;
  }

  /**
   * sets speed
   */
  @Override
  public void move(final int speedInMPH) {
    this.speedInMPH = speedInMPH;
  }

  /**
   * sets speed to 0
   */
  @Override
  public void stop() {
    speedInMPH = 0;
  }

  /**
   * Sets the Gate to the instance with the corresponding id
   */
  @Override
  public void setGate(final GateID gate) {
/*
    for (final Gate g : Airport.getAirport().getGateList()) {
      if (g.getGateID() == gate) {
        this.gate = g;
        break;
      }
    }TODO get airport*/
  }

  @Override
  public void setFlashingLightOff() {
    isFlashingLightOn = false;
  }
}
