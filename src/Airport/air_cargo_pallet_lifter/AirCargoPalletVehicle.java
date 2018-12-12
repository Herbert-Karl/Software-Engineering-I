package Airport.air_cargo_pallet_lifter;

import Airport.airport.Gate;
import Airport.airport.GateID;
import Airport.base.AirCargoPallet;

public class AirCargoPalletVehicle implements IAirCargoPalletVehicle {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private AirCargoPallet airCargoPallet;
    private AirCargoPalletLifter connectedAirCargoPalletLifter;
    private Gate gate;

    public AirCargoPalletVehicle(String uuid, String id, String type, int speedInMPH, boolean isFlashingLightOn, AirCargoPallet airCargoPallet, AirCargoPalletLifter connectedAirCargoPalletLifter, Gate gate) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.isFlashingLightOn = isFlashingLightOn;
        this.airCargoPallet = airCargoPallet;
        this.connectedAirCargoPalletLifter = connectedAirCargoPalletLifter;
        this.gate = gate;
    }

    @Override
    public void executeRequest(GateID gateID) {

    }

    @Override
    public void store(AirCargoPallet airCargoPallet) {

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
    public void connect(IAirCargoPalletLifter airCargoPalletLifter) {

    }

    @Override
    public void transferPalletToLifter() {

    }

    @Override
    public void disconnectFromLifter() {

    }

    @Override
    public void returnToAirCargoPalletPackingUnit() {

    }

    @Override
    public void setFlashingLightOff() {

    }

    @Override
    public void returnToAirportResourcePool() {

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

    public AirCargoPallet getAirCargoPallet() {
        return airCargoPallet;
    }

    public void setAirCargoPallet(AirCargoPallet airCargoPallet) {
        this.airCargoPallet = airCargoPallet;
    }

    public AirCargoPalletLifter getConnectedAirCargoPalletLifter() {
        return connectedAirCargoPalletLifter;
    }

    public void setConnectedAirCargoPalletLifter(AirCargoPalletLifter connectedAirCargoPalletLifter) {
        this.connectedAirCargoPalletLifter = connectedAirCargoPalletLifter;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }
}
