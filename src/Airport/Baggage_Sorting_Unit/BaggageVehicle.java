package src.Airport.Baggage_Sorting_Unit;

import Airport.Airport.GateID;
import Airport.Base.Container;

public class BaggageVehicle implements IBaggageVehicle {

    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private Container container;
    private IContainerLifter containerLifter;
    private Airport.Airport.Gate gate;

    @Override
    public void store(Container container) {

    }

    @Override
    public void connect(IContainerLifter containerLifter) {

    }

    @Override
    public void transferContainerToLifter() {

    }

    @Override
    public void disconnect(IContainerLifter containerLifter) {

    }

    @Override
    public void returnToBaggageSortingUnit() {

    }

    @Override
    public void executeRequest(GateID gateID) {

    }

    @Override
    public void setFlashingLightOn() {

    }

    @Override
    public void move(int speedInMPH) {

    }

    @Override
    public void stop() {

    }

    @Override
    public void setGate(GateID gate) {

    }

    @Override
    public void setFlashingLightOff() {

    }
}