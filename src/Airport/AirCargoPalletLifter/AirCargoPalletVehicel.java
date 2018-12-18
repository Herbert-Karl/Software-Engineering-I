package Airport.AirCargoPalletLifter;

import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Base.AirCargoPallet;

public class AirCargoPalletVehicel implements IAirCargoPalletVehicel{
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private AirCargoPallet airCargoPallet;
    private IAirCargoPalletLifter connectedAirCargoPalletLifter;
    private Gate gate;

    public AirCargoPalletVehicel(String uuid, String id, String type, int speedInMPH, boolean isFlashingLightOn, AirCargoPallet airCargoPallet, IAirCargoPalletLifter connectedAirCargoPalletLifter, Gate gate) {
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
    @Override
    public void setGate(Gate gate) {
        this.gate = gate;
    }
    @Override
    public void executeRequest(GateID gateID){}
    @Override
    public void store(AirCargoPallet airCargoPallet){}
    @Override
    public void setFlashingLightOn(){setFlashingLightOn(true);}
    @Override
    public void move(int speedInMPH){setSpeedInMPH(speedInMPH);}
    @Override
    public void stop(){setSpeedInMPH(0);}
    @Override
    public void setGate(GateID gateID){ ;}
    @Override
    public void connect(IAirCargoPalletLifter airCargoPalletLifter){setConnectedAirCargoPalletLifter(airCargoPalletLifter); }
    @Override
    public void transferPalletToLifter(){}
    @Override
    public void disconnectFromLifter(){setConnectedAirCargoPalletLifter(null);}
    @Override
    public void returnToAirCargoPalletPackingUnit(){}
    @Override
    public void setFlashingLightOff(){setFlashingLightOn(false);}
    @Override
    public void returnToAirportResourcePool(){}
}
