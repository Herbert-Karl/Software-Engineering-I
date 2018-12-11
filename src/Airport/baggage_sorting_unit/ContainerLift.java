package Airport.baggage_sorting_unit;

import Airplane.Aircraft.Airplane;
import Airport.airport.Airport;
import Airport.airport.Gate;
import Airport.airport.GateID;
import Airport.base.Container;
import Airport.service_vehicle.Vehicle;

import java.util.ArrayList;

public class ContainerLift extends Vehicle implements IContainerLift {
    private boolean isDown;
    private Container container;
    private int numberOfContainerLoaded;
    private ArrayList<String> containerIDList;

    public ContainerLift(String uuid, String type, String id, int speedInMPH, boolean isFlashingLightOn, Gate gate, Airplane connectedAirplane, Airport airport, boolean isDown, Container container, int numberOfContainerLoaded, ArrayList<String> containerIDList) {
        super(uuid, type, id, speedInMPH, isFlashingLightOn, gate, connectedAirplane, airport);
        this.isDown = isDown;
        this.container = container;
        this.numberOfContainerLoaded = numberOfContainerLoaded;
        this.containerIDList = containerIDList;
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
    public void setGate(GateID gateID) {

    }

    @Override
    public void connectToAirplane() {

    }

    @Override
    public void disconnectFromAirplane() {

    }

    @Override
    public void setFlashingLightOff() {

    }

    @Override
    public void returnToAirportResourcePool() {

    }

    @Override
    public void notifyGroundOperation(ContainerLiftReceipt containerLiftReceipt) {

    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }

    @Override
    public void transferContainerToCargoSystem() {

    }

    public boolean isDown() {
        return isDown;
    }

    public void setDown(boolean down) {
        isDown = down;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public int getNumberOfContainerLoaded() {
        return numberOfContainerLoaded;
    }

    public void setNumberOfContainerLoaded(int numberOfContainerLoaded) {
        this.numberOfContainerLoaded = numberOfContainerLoaded;
    }

    public ArrayList<String> getContainerIDList() {
        return containerIDList;
    }

    public void setContainerIDList(ArrayList<String> containerIDList) {
        this.containerIDList = containerIDList;
    }
}
