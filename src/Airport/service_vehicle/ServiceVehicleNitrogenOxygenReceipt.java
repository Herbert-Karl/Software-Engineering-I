package Airport.service_vehicle;

import Airport.airport.GateID;

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

    public int getAmountNitrogen() {
        return amountNitrogen;
    }

    public void setAmountNitrogen(int amountNitrogen) {
        this.amountNitrogen = amountNitrogen;
    }

    public int getAmountOxygen() {
        return amountOxygen;
    }

    public void setAmountOxygen(int amountOxygen) {
        this.amountOxygen = amountOxygen;
    }
}
