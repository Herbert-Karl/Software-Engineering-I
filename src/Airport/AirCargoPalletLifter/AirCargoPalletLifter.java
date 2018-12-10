package Airport.AirCargoPalletLifter;

import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Base.AirCargoPallet;

import java.util.ArrayList;

public class AirCargoPalletLifter {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private boolean isDown;
    private AirCargoPallet airCargoPallet;
    private int numberOfAirCargoPalletLoaded;
    private ArrayList airCargoPalletIDList;
    private Gate gate;
    private Airplane connectedAirplane;

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

    public boolean isDown() {
        return isDown;
    }

    public AirCargoPallet getAirCargoPallet() {
        return airCargoPallet;
    }

    public int getNumberOfAirCargoPalletLoaded() {
        return numberOfAirCargoPalletLoaded;
    }

    public ArrayList getAirCargoPalletIDList() {
        return airCargoPalletIDList;
    }

    public Gate getGate() {
        return gate;
    }

    public Airplane getConnectToAirplane() {
        return connectedAirplane;
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

    public void setDown(boolean down) {
        isDown = down;
    }

    public void setAirCargoPallet(AirCargoPallet airCargoPallet) {
        this.airCargoPallet = airCargoPallet;
    }

    public void setNumberOfAirCargoPalletLoaded(int numberOfAirCargoPalletLoaded) {
        this.numberOfAirCargoPalletLoaded = numberOfAirCargoPalletLoaded;
    }

    public void setAirCargoPalletIDList(ArrayList airCargoPalletIDList) {
        this.airCargoPalletIDList = airCargoPalletIDList;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void setConnectToAirplane(Airplane connectToAirplane) {
        this.connectedAirplane = connectToAirplane;
    }

    public AirCargoPalletLifter(String uuid, String id, String type, int speedInMPH, boolean isFlashingLightOn, AirCargoPallet airCargoPallet, int numberOfAirCargoPalletLoaded, ArrayList airCargoPalletIDList, Gate gate, Airplane connectedAirplane) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.isFlashingLightOn = isFlashingLightOn;
        this.airCargoPallet = airCargoPallet;
        this.numberOfAirCargoPalletLoaded = numberOfAirCargoPalletLoaded;
        this.airCargoPalletIDList = airCargoPalletIDList;
        this.gate = gate;
        this.connectedAirplane = connectedAirplane;
        this.isDown = true;
    }
    public void executeRequest(GateID gateID){}
    public void move(int speedInMPH){ setSpeedInMPH(speedInMPH);}
    public void stop(){setSpeedInMPH(0);}
    public void setGate(GateID gateID){setGate(gateID);}
    public void connectToAirplane(){setConnectToAirplane(airplane);}
    public void up(){setDown(false);}
    public void transferAirCargoPalletToCargoSystem(){}
    public void disconnectFromAirplane(){setConnectToAirplane(null);}
    public void setFlashingLightOn(){ setFlashingLightOn(true);}
    public void setFlashingLightOff(){ setFlashingLightOn(false);}
    public void returnToAirportResourcePool(){}
    public void down(){setDown(true);}
    public void notifyGroundOperations(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt){}
}
