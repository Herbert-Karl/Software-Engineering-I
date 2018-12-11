package Airport.sky_tanking_vehicle;

import Airport.airport.Gate;

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

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSkyTankingVehicleID() {
        return skyTankingVehicleID;
    }

    public void setSkyTankingVehicleID(String skyTankingVehicleID) {
        this.skyTankingVehicleID = skyTankingVehicleID;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
