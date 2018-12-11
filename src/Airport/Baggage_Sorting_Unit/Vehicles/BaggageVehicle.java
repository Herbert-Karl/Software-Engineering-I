package Airport.Baggage_Sorting_Unit.Vehicles;

import Airport.Airport.Airport;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Baggage_Sorting_Unit.BaggageSortingUnit;
import Airport.Base.Baggage;
import Airport.Base.Container;

import java.util.Collection;

public class BaggageVehicle implements IBaggageVehicle {

  private final String uuid;

  private final String id;

  private final String type;

  private int speedInMPH;

  private boolean isFlashingLightOn;

  private Container container;

  private IContainerLifter containerLifter;

  private Gate gate;

  private BaggageSortingUnit unit;

  public BaggageVehicle(final String uuid, final String id, final String type,
      BaggageSortingUnit unit) {
    this.uuid = uuid;
    this.id = id;
    this.type = type;
    speedInMPH = 0;
    isFlashingLightOn = false;
    this.unit = unit;
  }

  @Override
  public String toString() {
    String message = "UUID: " + uuid + "\nID: " + id + "\nType: " + type
        + "\nCurrent speed in MpH: " + speedInMPH + "\nCurrent status of lights: ";
    message += ((isFlashingLightOn) ? "on" : "off");
    message += "\nCurrent Gate: " + gate + "\nAssigned container lifter" + containerLifter;

    return message;
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

  public Gate getGate() {
    return gate;
  }

  @Override
  public IContainerLifter getContainerLifter() {
    return containerLifter;
  }

  /**
   * adding baggages to internal container
   */
  @Override
  public void store(final Collection<Baggage> b) {
    //TODO add collection to container
    //container.addAll(b);
  }

  /**
   * setting internal container
   * TODO check functionality
   */
  @Override
  public void store(final Container container) {
    this.container = container;
  }

  /**
   * sets internal containerLifter
   */
  @Override
  public void connect(final IContainerLifter containerLifter) {
    this.containerLifter = containerLifter;
  }

  /**
   * sets container on lifter an removes it locally
   */
  @Override
  public void transferContainerToLifter() {
    containerLifter.setContainer(container);
    container = null;
  }

  /**
   * removes local dependency for containerLifter
   */
  @Override
  public void disconnect() {
    containerLifter = null;
  }

  /**
   * moves and sets baggageVehicle to this instance for baggageSortingUnit
   */
  @Override
  public void returnToBaggageSortingUnit() {
    setFlashingLightOn();
    move(20);
    stop();
    unit.setBaggageVehicle(this);
    setFlashingLightOff();
  }

  /**
   * TODO: Routine implementieren
   */
  @Override
  public void executeRequest(final GateID gateID) {

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
   * finds gate for the given id and stores it
   */
  @Override
  public void setGate(final GateID id) {
    for (final Gate g : Airport.getAirport().getGateList()) {
      if (g.getGateID() == id) {
        gate = g;
        break;
      }
    }
  }

  @Override
  public void setFlashingLightOff() {
    isFlashingLightOn = false;
  }
}