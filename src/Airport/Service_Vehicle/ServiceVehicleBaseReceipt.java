package Airport.Service_Vehicle;

import Airport.Airport.GateID;

public class ServiceVehicleBaseReceipt {
    private String uuid;
    private String vehicleID;
    private GateID gateID;
    private int amountAPUOil;
    private int amountEngineOil;
    private int amountFireExtinguisher;
    private int amountDeIcingSystem;

    public ServiceVehicleBaseReceipt(String uuid, String vehicleID, GateID gateID, int amountAPUOil, int amountEngineOil, int amountFireExtinguisher, int amountDeIcingSystem) {
        this.uuid = uuid;
        this.vehicleID = vehicleID;
        this.gateID = gateID;
        this.amountAPUOil = amountAPUOil;
        this.amountEngineOil = amountEngineOil;
        this.amountFireExtinguisher = amountFireExtinguisher;
        this.amountDeIcingSystem = amountDeIcingSystem;
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

    public int getAmountAPUOil() {
        return amountAPUOil;
    }

    public int getAmountEngineOil() {
        return amountEngineOil;
    }

    public int getAmountFireExtinguisher() {
        return amountFireExtinguisher;
    }

    public int getAmountDeIcingSystem() {
        return amountDeIcingSystem;
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

    public void setAmountAPUOil(int amountAPUOil) {
        this.amountAPUOil = amountAPUOil;
    }

    public void setAmountEngineOil(int amountEngineOil) {
        this.amountEngineOil = amountEngineOil;
    }

    public void setAmountFireExtinguisher(int amountFireExtinguisher) {
        this.amountFireExtinguisher = amountFireExtinguisher;
    }

    public void setAmountDeIcingSystem(int amountDeIcingSystem) {
        this.amountDeIcingSystem = amountDeIcingSystem;
    }
}
