package Airport.Service_Vehicle;

import Airplane.Tanks.INitrogenBottle;
import Airplane.Tanks.IOxygenBottle;
import Airport.Airport.Gate;
import Airport.Airport.GateID;

public class ServiceVehicleNitrogenOxygen implements IServiceVehicleNitrogenOxygen {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private boolean isElectricalGrounded;
    private int amountNitrogen;
    private int amountOxygen;
    private Gate gate;
    private Airplane connectedAirplane;

    public ServiceVehicleNitrogenOxygen(String uuid, String id, String type, int speedInMPH, boolean isFlashingLightOn, boolean isElectricalGrounded, Gate gate, Airplane connectedAirplane) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.isFlashingLightOn = isFlashingLightOn;
        this.isElectricalGrounded = isElectricalGrounded;
        this.amountNitrogen = 1000;
        this.amountOxygen = 1000;
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

    public boolean isElectricalGrounded() {
        return isElectricalGrounded;
    }

    public int getAmountNitrogen() {
        return amountNitrogen;
    }

    public int getAmountOxygen() {
        return amountOxygen;
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

    public void setElectricalGrounded(boolean electricalGrounded) {
        isElectricalGrounded = electricalGrounded;
    }

    public void setAmountNitrogen(int amountNitrogen) {
        this.amountNitrogen = amountNitrogen;
    }

    public void setAmountOxygen(int amountOxygen) {
        this.amountOxygen = amountOxygen;
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
    public void attachElectricalGrounding() {

    }

    @Override
    public void setGateID(GateID gateID) {

    }

    @Override
    public void connectToAirplane() {

    }

    @Override
    public void refill(INitrogenBottle nitrogenBottle) {

    }

    @Override
    public void refill(IOxygenBottle oxygenBottle) {

    }

    @Override
    public void disconnectFromAirplane() {

    }

    @Override
    public void detachElectricalGrounding() {

    }

    @Override
    public void setFlashingLightOff() {

    }

    @Override
    public void notifyGroundOperations(ServiceVehicleNitrogenOxygenReceipt serviceVehicleNitrogenOxygenReceipt) {

    }

    @Override
    public void returnToAirportResourcePool() {

    }
}
