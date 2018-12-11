package Airport.pushback_vehicle;

import Airport.airport.GateID;

public class PushBackVehicleReceipt {
    private String uuid;
    private String pushBackVehicleID;
    private GateID gateID;

    public PushBackVehicleReceipt(String uuid, String pushBackVehicleID, GateID gateID) {
        this.uuid = uuid;
        this.pushBackVehicleID = pushBackVehicleID;
        this.gateID = gateID;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPushBackVehicleID() {
        return pushBackVehicleID;
    }

    public void setPushBackVehicleID(String pushBackVehicleID) {
        this.pushBackVehicleID = pushBackVehicleID;
    }

    public GateID getGateID() {
        return gateID;
    }

    public void setGateID(GateID gateID) {
        this.gateID = gateID;
    }
}
