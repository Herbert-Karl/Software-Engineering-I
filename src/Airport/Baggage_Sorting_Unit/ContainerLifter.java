package src.Airport.Baggage_Sorting_Unit;

import Airport.Airport.GateID;

public class ContainerLifter implements IContainerLifter {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private boolean isDown;
    private Airport.Base.Container container;
    private int numberOfContainerLoaded;

    @Override
    public void connectToAirplane() {

    }

    @Override
    public void up() {

    }

    @Override
    public void transferCargoSystem() {

    }

    @Override
    public void down() {

    }

    @Override
    public void disconnectFromAirplane() {

    }

    @Override
    public void notifyGroundOperations(ContainerLifterReceipt containerLifterReceipt) {

    }

    @Override
    public void returnToAirportResourcePool() {

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
