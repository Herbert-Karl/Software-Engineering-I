package Airport.Sky_Tanking_Vehicle;

import Airport.Airport.Gate;

public class FuelReceipt {
    private String uuid;
    private String skyTankingVehicleID;
    private Gate gate;
    private int totalAmount;

    public FuelReceipt(String uuid, String skyTankingVehicleID, Gate gate, int totalAmount) {
        this.uuid = uuid;
        this.skyTankingVehicleID = skyTankingVehicleID;
        this.gate = gate;
        this.totalAmount = totalAmount;
    }

    public String getUuid() {
        return uuid;
    }

    public String getSkyTankingVehicleID() {
        return skyTankingVehicleID;
    }

    public Gate getGate() {
        return gate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setSkyTankingVehicleID(String skyTankingVehicleID) {
        this.skyTankingVehicleID = skyTankingVehicleID;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
