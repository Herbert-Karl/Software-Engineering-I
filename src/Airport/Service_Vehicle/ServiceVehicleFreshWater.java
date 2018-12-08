package Airport.Service_Vehicle;

import Airplane.Airplane;
import Airplane.Tanks.IPortableWaterTank;
import Airport.Airport.Gate;
import Airport.Airport.GateID;

public class ServiceVehicleFreshWater implements IServiceVehicleFreshWater {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private int amountFreshWater;
    private Gate gate;
    private Airplane connectedAirplane;

    public ServiceVehicleFreshWater(String uuid, String id, String type, int speedInMPH, boolean isFlashingLightOn, Gate gate, Airplane connectedAirplane) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.isFlashingLightOn = isFlashingLightOn;
        this.amountFreshWater = 10000;
        this.gate = gate;
        this.connectedAirplane = connectedAirplane;
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

    public int getAmountFreshWater() {
        return amountFreshWater;
    }

    public Gate getGate() {
        return gate;
    }

    public Airplane getConnectedAirplane() {
        return connectedAirplane;
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

    public void setAmountFreshWater(int amountFreshWater) {
        this.amountFreshWater = amountFreshWater;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void setConnectedAirplane(Airplane connectedAirplane) {
        this.connectedAirplane = connectedAirplane;
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
    public void setGateID(GateID gateID) {

    }

    @Override
    public void connectToAirplane(Airplane airplane) {

    }

    @Override
    public void refill(IPortableWaterTank portableWaterTank) {

    }

    @Override
    public void disconnectFromAirplane() {

    }

    @Override
    public void setFlashingLightOff() {

    }

    @Override
    public void notifyGroundOperations(ServiceVehicleFreshWaterReceipt serviceVehicleFreshWaterReceipt) {

    }

    @Override
    public void returnToAirportResourcePool() {

    }
}
