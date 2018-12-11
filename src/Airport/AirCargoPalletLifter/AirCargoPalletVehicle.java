package Airport.AirCargoPalletLifter;

import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Base.AirCargoPallet;

public class AirCargoPalletVehicle {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private AirCargoPallet airCargoPallet;
    private IAirCargoPalletLifter connectedAirCargoPalletLifter;
    private Gate gate;

    public AirCargoPalletVehicle(String uuid, String id, String type, int speedInMPH, boolean isFlashingLightOn, AirCargoPallet airCargoPallet, IAirCargoPalletLifter connectedAirCargoPalletLifter, Gate gate) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.isFlashingLightOn = isFlashingLightOn;
        this.airCargoPallet = airCargoPallet;
        this.connectedAirCargoPalletLifter = connectedAirCargoPalletLifter;
        this.gate = gate;
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

    public AirCargoPallet getAirCargoPallet() {
        return airCargoPallet;
    }

    public IAirCargoPalletLifter getConnectedAirCargoPalletLifter() {
        return connectedAirCargoPalletLifter;
    }

    public Gate getGate() {
        return gate;
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

    public void setAirCargoPallet(AirCargoPallet airCargoPallet) {
        this.airCargoPallet = airCargoPallet;
    }

    public void setConnectedAirCargoPalletLifter(IAirCargoPalletLifter connectedAirCargoPalletLifter) {
        this.connectedAirCargoPalletLifter = connectedAirCargoPalletLifter;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void executeRequest(GateID gateID){}
    public void store(AirCargoPallet airCargoPallet){}
    public void setFlashingLightOn(){setFlashingLightOn(true);}
    public void move(int speedInMPH){setSpeedInMPH(speedInMPH);}
    public void stop(){setSpeedInMPH(0);}
    public void setGate(GateID gateID){setGate(gateID);}
    public void connect(IAirCargoPalletLifter airCargoPalletLifter){setConnectedAirCargoPalletLifter(airCargoPalletLifter);}
    public void transferPalletToLifter(){}
    public void disconnectFromLifter(){setConnectedAirCargoPalletLifter(null);}
    public void returnToAirCargoPalletPackingUnit(){}
    public void setFlashingLightOff(){setFlashingLightOn(false);}
    public void returnToAirportResourcePool(){}
}
