package Airport.Service_Vehicle;

import Airport.Airport.GateID;

public class ServiceVehicleNitrogenOxygenReceipt {
    private String uuid;
    private String vehicleID;
    private GateID gateID;
    private int amountNitrogen;
    private int amountOxygen;

    public ServiceVehicleNitrogenOxygenReceipt(String uuid, String vehicleID, GateID gateID, int amountNitrogen, int amountOxygen) {
        this.uuid = uuid;
        this.vehicleID = vehicleID;
        this.gateID = gateID;
        this.amountNitrogen = amountNitrogen;
        this.amountOxygen = amountOxygen;
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

    public int getAmountNitrogen() {
        return amountNitrogen;
    }

    public int getAmountOxygen() {
        return amountOxygen;
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

    public void setAmountNitrogen(int amountNitrogen) {
        this.amountNitrogen = amountNitrogen;
    }

    public void setAmountOxygen(int amountOxygen) {
        this.amountOxygen = amountOxygen;
    }
}
