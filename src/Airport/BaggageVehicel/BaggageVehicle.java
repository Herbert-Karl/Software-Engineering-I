package Airport.BaggageVehicel;

import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Base.Container;

public class BaggageVehicle {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private Container container;
    private IContainerLifter containerLifter;
    private Gate gate;

    public BaggageVehicle(String uuid, String id, String type, int speedInMPH, boolean isFlashingLightOn, Container container, IContainerLifter containerLifter, Gate gate) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.isFlashingLightOn = isFlashingLightOn;
        this.container = container;
        this.containerLifter = containerLifter;
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

    public Container getContainer() {
        return container;
    }

    public IContainerLifter getContainerLifter() {
        return containerLifter;
    }

    public Gate getGate() {
        return gate;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeedInMPH(int speedInMPH) {
        this.speedInMPH = speedInMPH;
    }

    public void setFlashingLightOn(boolean flashingLightOn) {
        isFlashingLightOn = flashingLightOn;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public void setContainerLifter(IContainerLifter containerLifter) {
        this.containerLifter = containerLifter;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void executeRequest(GateID gateID){}
    public void store(Container container){}
    public void setFlashingLightOn() {}
    public void move(int speedInMPH){}
    public void stop(){}
    public void setGate(GateID gateID){}
    public void connect(IContainerLifter containerLifter){}
    public void transferContainerToLifter(){}
    public void disconnect(IContainerLifter containerLifter){}
    public void returnToBaggageSortingUnit(){}
    public void setFlashingLightOff(){}


}
