package Airport.Baggage_Sorting_Unit.Vehicles;

import Airplane.Aircraft.Airplane;
import Airport.Airport.Airport;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Baggage_Sorting_Unit.Loading.LoadingStrategy;
import Airport.Baggage_Sorting_Unit.Receipts.ContainerLifterReceipt;
import Airport.Base.Container;

import java.util.ArrayList;
import java.util.UUID;

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

    private static int idCounter;

    public ContainerLifter(final String type) {
        this.uuid = UUID.randomUUID().toString();
        this.id = "" + idCounter++;
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

  //TODO remove strategy, get position from wherever
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
        Airport.getInstance().getGroundOperationsCenter().receive(containerLifterReceipt);
    }

    /**
     * Returns this instance to the pool
     */
    @Override
    public void returnToAirportResourcePool() {
        Airport.getInstance().getResourcePool().returnResource(this);
    }
    
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
        notifyGroundOperations(new ContainerLifterReceipt(this.id, gateID, numberOfContainerLoaded, containerIDList ));
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
    public void setGate(final GateID g) {
        gate = Airport.getInstance().getGatefromID(g);
    }

    @Override
    public void setFlashingLightOff() {
        isFlashingLightOn = false;
    }
}
