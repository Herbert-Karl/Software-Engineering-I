package Airport.Baggage_Sorting_Unit.Vehicles;

import Airplane.Aircraft.Airplane;
import Airplane.stowage_cargo.FrontStowagePositionID;
import Airport.Airport.Airport;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Baggage_Sorting_Unit.Receipts.ContainerLifterReceipt;
import Airport.Base.Container;

import java.util.ArrayList;
import java.util.Stack;
import java.util.UUID;

public class ContainerLifter implements IContainerLifter {

    private static int idCounter;
    private static Stack<FrontStowagePositionID> openPositions;
    private final String uuid;
    private final String id;
    private final String type;
    private final ArrayList<String> containerIDList;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private boolean isDown;
    private Container container;
    private Gate gate;
    private Airplane connectedAirplane;
    private int numberOfContainerLoaded;

    public ContainerLifter(final String type) {
        this.uuid = UUID.randomUUID().toString();
        this.id = "" + idCounter++;
        this.type = type;
        speedInMPH = 0;
        isFlashingLightOn = false;
        numberOfContainerLoaded = 0;
        containerIDList = new ArrayList<>();
        initOpenPositions();
    }

    /**
     * initializing stack with all positions in order
     */
    private void initOpenPositions() {
        openPositions = new Stack<>();
        openPositions.push(FrontStowagePositionID.SFR07);
        openPositions.push(FrontStowagePositionID.SFL07);
        openPositions.push(FrontStowagePositionID.SFR06);
        openPositions.push(FrontStowagePositionID.SFL06);
        openPositions.push(FrontStowagePositionID.SFR05);
        openPositions.push(FrontStowagePositionID.SFL05);
        openPositions.push(FrontStowagePositionID.SFR04);
        openPositions.push(FrontStowagePositionID.SFL04);
        openPositions.push(FrontStowagePositionID.SFR03);
        openPositions.push(FrontStowagePositionID.SFL03);
        openPositions.push(FrontStowagePositionID.SFR02);
        openPositions.push(FrontStowagePositionID.SFL02);
        openPositions.push(FrontStowagePositionID.SFR01);
        openPositions.push(FrontStowagePositionID.SFL01);
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

    public ArrayList<String> getContainerIDList() {
        return containerIDList;
    }

    public int getNumberOfContainerLoaded() {
        return numberOfContainerLoaded;
    }

    @Override
    public Gate getGate() {
        return gate;
    }

    @Override
    public void setGate(final Gate gate) {
        this.gate = gate;
    }

    /**
     * Sets the Gate to the instance with the corresponding id
     */
    @Override
    public void setGate(final GateID g) {
        gate = Airport.getInstance().getGatefromID(g);
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
        containerIDList.add(c.getId());
        numberOfContainerLoaded++;
    }

    /**
     * Sets the connected airplane to the instance at to the current gate
     */
    @Override
    public void connectToAirplane() {
        connectedAirplane = gate.getAirplane();
    }

    /**
     * updates isDown variable
     */
    @Override
    public void up() {
        isDown = false;
    }

    /**
     * loads container to next open position on connected airplane
     */
    @Override
    public void transferContainerToCargoSystem() {
        if (!isDown) {
            down();
        }
        up();
        connectedAirplane.getBody()
                .getCargoSystemArrayList()
                .get(0)
                .load(container, openPositions.pop());
        down();
        container = null;
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
     * requests ground operations from airport and calls receive with the receipt
     */
    @Override
    public void notifyGroundOperations(final ContainerLifterReceipt containerLifterReceipt) {
        Airport.getInstance().getGroundOperationsCenter().receive(containerLifterReceipt);
    }

    /**
     * Returns this instance to the pool
     */
    @Override
    public void returnToAirportResourcePool() {
        Airport.getInstance().getResourcePool().returnResource(this);
    }

    /**
     * moves to gate and connects to airplane
     *
     * @param gateID id for the gate to move to
     */
    @Override
    public void executeRequest(final GateID gateID) {
        setFlashingLightOn();
        move(15);
        setGate(gateID);
        stop();
        setFlashingLightOff();
        connectToAirplane();
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

    @Override
    public void setFlashingLightOff() {
        isFlashingLightOn = false;
    }
}
