package Airport.air_cargo_pallet_lifter;

import Airport.airport.GateID;

import java.util.ArrayList;

public class AirCargoPalletLifterReceipt {
    private String uuid;
    private String lifterID;
    private GateID gateID;
    private int numberOfAirCargoPallet;
    private ArrayList<String> airCargoPalletIDList;

    public AirCargoPalletLifterReceipt(String uuid, String lifterID, GateID gateID, int numberOfAirCargoPallet, ArrayList<String> airCargoPalletIDList) {
        this.uuid = uuid;
        this.lifterID = lifterID;
        this.gateID = gateID;
        this.numberOfAirCargoPallet = numberOfAirCargoPallet;
        this.airCargoPalletIDList = airCargoPalletIDList;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getLifterID() {
        return lifterID;
    }

    public void setLifterID(String lifterID) {
        this.lifterID = lifterID;
    }

    public GateID getGateID() {
        return gateID;
    }

    public void setGateID(GateID gateID) {
        this.gateID = gateID;
    }

    public int getNumberOfAirCargoPallet() {
        return numberOfAirCargoPallet;
    }

    public void setNumberOfAirCargoPallet(int numberOfAirCargoPallet) {
        this.numberOfAirCargoPallet = numberOfAirCargoPallet;
    }

    public ArrayList<String> getAirCargoPalletIDList() {
        return airCargoPalletIDList;
    }

    public void setAirCargoPalletIDList(ArrayList<String> airCargoPalletIDList) {
        this.airCargoPalletIDList = airCargoPalletIDList;
    }
}
