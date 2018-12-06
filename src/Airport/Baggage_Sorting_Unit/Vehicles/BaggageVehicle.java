package src.Airport.Baggage_Sorting_Unit.Vehicles;

import Airport.Airport.GateID;
import Airport.Base.Baggage;
import Airport.Base.Container;
import Airport.Airport.Gate;
import src.Airport.Baggage_Sorting_Unit.BaggageSortingUnit;

import java.util.Collection;

public class BaggageVehicle implements IBaggageVehicle {

  private String uuid;

  private String id;

  private String type;

  private int speedInMPH = 0;

  private boolean isFlashingLightOn;

  private Container container;

  private IContainerLifter containerLifter;

  private Gate gate;

  /**
   * adding baggages to internal container
   */
  @Override
  public void store(Collection<Baggage> b) {
    container.addAll(b);
  }

  /**
   * setting internal container
   */
  @Override
  public void store(Container container) {
    this.container = container;
  }

  @Override
  public void connect(IContainerLifter containerLifter) {
    this.containerLifter = containerLifter;
  }

  @Override
  public void transferContainerToLifter() {
    containerLifter.setContainer(container);
  }

  /**
   * TODO disconnects if same as connected
   */
  @Override
  public void disconnect(IContainerLifter containerLifter) {
    if (this.containerLifter.equals(containerLifter)) {
      this.containerLifter = null;
    }
  }

  /**
   * TODO routine überprüfen
   */
  @Override
  public void returnToBaggageSortingUnit() {
    setFlashingLightOn();
    move(20);
    stop();
    BaggageSortingUnit.setBaggageVehicle();//TODO: wo bekomme ich die unit her
    setFlashingLightOff();
  }

  /**
   * TODO: Routine implementieren
   */
  @Override
  public void executeRequest(GateID gateID) {

  }

  @Override
  public void setFlashingLightOn() {
    isFlashingLightOn = true;
  }

  @Override
  public void move(int speedInMPH) {
    this.speedInMPH = speedInMPH;
  }

  @Override
  public void stop() {
    speedInMPH = 0;
  }

  @Override
  public void setGate(GateID gate) {
    this.gate = gate;//TODO: cast gateID to gate
  }

  @Override
  public void setFlashingLightOff() {
isFlashingLightOn=false;
  }
}