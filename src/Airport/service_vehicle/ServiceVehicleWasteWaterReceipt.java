package Airport.service_vehicle;

import Airport.airport.GateID;

public class ServiceVehicleWasteWaterReceipt {
    private String uuid;
    private String vehicleID;
    private GateID gateID;
    private int amountWasteWater;

    public ServiceVehicleWasteWaterReceipt(String uuid, String vehicleID, GateID gateID, int amountWasteWater) {
        this.uuid = uuid;
        this.vehicleID = vehicleID;
        this.gateID = gateID;
        this.amountWasteWater = amountWasteWater;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public GateID getGateID() {
        return gateID;
    }

    public void setGateID(GateID gateID) {
        this.gateID = gateID;
    }

    public int getAmountWasteWater() {
        return amountWasteWater;
    }

    public void setAmountWasteWater(int amountWasteWater) {
        this.amountWasteWater = amountWasteWater;
    }
}
