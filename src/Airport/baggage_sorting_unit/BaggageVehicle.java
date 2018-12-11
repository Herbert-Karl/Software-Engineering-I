package Airport.baggage_sorting_unit;

import Airport.airport.Gate;
import Airport.airport.GateID;
import Airport.base.Container;

public class BaggageVehicle implements IBaggageVehicle {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private Container container;
    private IContainerLift containerLift;
    private Gate gate;

    public BaggageVehicle(String uuid, String id, String type, int speedInMPH, boolean isFlashingLightOn, Container container, IContainerLift containerLift, Gate gate) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.isFlashingLightOn = isFlashingLightOn;
        this.container = container;
        this.containerLift = containerLift;
        this.gate = gate;
    }

    @Override
    public void executeRequest(GateID gateID) {

    }

    @Override
    public void store(Container container) {

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
    public void connect(IContainerLift containerLift) {

    }

    @Override
    public void transferContainerToLift() {

    }

    @Override
    public void disconnect(IContainerLift containerLift) {

    }

    @Override
    public void returnToBaggageSortingUnit() {

    }

    @Override
    public void setFlashingLightOff() {

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeedInMPH() {
        return speedInMPH;
    }

    public void setSpeedInMPH(int speedInMPH) {
        this.speedInMPH = speedInMPH;
    }

    public boolean isFlashingLightOn() {
        return isFlashingLightOn;
    }

    public void setFlashingLightOn(boolean flashingLightOn) {
        isFlashingLightOn = flashingLightOn;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public IContainerLift getContainerLift() {
        return containerLift;
    }

    public void setContainerLift(IContainerLift containerLift) {
        this.containerLift = containerLift;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }
}
