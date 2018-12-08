package Airport.Service_Vehicle;

import Airport.Airport.GateID;

public class ServiceVehicleFreshWaterReceipt {
    private String uuid;
    private String vehicleID;
    private GateID gateID;
    private int amountFreshWater;

    public ServiceVehicleFreshWaterReceipt(String uuid, String vehicleID, GateID gateID, int amountFreshWater) {
        this.uuid = uuid;
        this.vehicleID = vehicleID;
        this.gateID = gateID;
        this.amountFreshWater = amountFreshWater;
    }

    public String getUuid() {
        return uuid;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public GateID getGateID() {
        return gateID;
    }

    public int getAmountFreshWater() {
        return amountFreshWater;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public void setGateID(GateID gateID) {
        this.gateID = gateID;
    }

    public void setAmountFreshWater(int amountFreshWater) {
        this.amountFreshWater = amountFreshWater;
    }
}
