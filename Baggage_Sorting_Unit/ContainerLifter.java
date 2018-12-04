package Baggage_Sorting_Unit;

import java.util.ArrayList;

public class ContainerLifter implements IContainerLifter {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private boolean isDown;
    private Container container;
    private int numberOfContainerLoaded;
    private ArrayList<String> containerIDList;
    private Gate gate;
    private Airplane connectedAirplane;


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
