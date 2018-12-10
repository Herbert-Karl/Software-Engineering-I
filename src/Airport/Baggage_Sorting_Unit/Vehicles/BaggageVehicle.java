package Airport.Baggage_Sorting_Unit.Vehicles;

import Airport.Airport.Airport;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
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

  public BaggageVehicle(final String uuid, final String id) {
    this.uuid = uuid;
    this.id = id;
    type = null;//TODO set type to something useful
    speedInMPH = 0;
    isFlashingLightOn = false;
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
    container.addAll(b);
  }

  /**
   * setting internal container
   */
  @Override
  public void store(final Container container) {
    this.container = container;
  }

  @Override
  public void connect(final IContainerLifter containerLifter) {
    this.containerLifter = containerLifter;
  }

  @Override
  public void transferContainerToLifter() {
    containerLifter.setContainer(container);
  }

  /**
   *
   */
  @Override
  public void disconnect() {
    containerLifter = null;
  }

  /**
   *
   */
  @Override
  public void returnToBaggageSortingUnit() {
    setFlashingLightOn();
    move(20);
    stop();
    containerLifter.getBaggageSortingUnit().setBaggageVehicle(this);
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

  @Override
  public void move(final int speedInMPH) {
    this.speedInMPH = speedInMPH;
  }

  @Override
  public void stop() {
    speedInMPH = 0;
  }

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