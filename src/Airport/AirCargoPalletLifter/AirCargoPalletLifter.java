package Airport.AirCargoPalletLifter;

import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Base.AirCargoPallet;
import Airplane.Aircraft.Airplane;
import java.util.ArrayList;
import Airport.Airport.Airport;

public class AirCargoPalletLifter implements IAirCargoPalletLifter{
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
    @Override
    public void executeRequest(GateID gateID){}
    @Override
    public void move(int speedInMPH){ setSpeedInMPH(speedInMPH);}
    @Override
    public void stop(){setSpeedInMPH(0);}
    @Override
    public void setGate(GateID gateID){setGate(searchGateById(gateID));}
    @Override
    public void connectToAirplane(){setConnectToAirplane(airplane);}
    @Override
    public void up(){setDown(false);}
    @Override
    public void transferAirCargoPalletToCargoSystem(){}
    @Override
    public void disconnectFromAirplane(){setConnectToAirplane(null);}
    @Override
    public void setFlashingLightOn(){ setFlashingLightOn(true);}
    @Override
    public void setFlashingLightOff(){ setFlashingLightOn(false);}
    @Override
    public void returnToAirportResourcePool(){}
    @Override
    public void down(){setDown(true);}
    @Override
    public void notifyGroundOperations(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt){}
    @Override
    public Gate searchGateById(GateID gateID) {
    return airport.getGateList().stream().filter(gate -> gate.getGateID().equals(gateID)).findFirst().orElse(null);
}
}
