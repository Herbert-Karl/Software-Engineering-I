package Airport.AirCargoPalletLifter;

import Airport.Airport.GateID;

import java.util.ArrayList;

public class AirCargoPalletLifterReceipt {
    private String uuid;
    private  String id;
    private GateID gateID;
    private int numberOfAirCargoPallet;
    private ArrayList airCargoPalletIDList;

    public AirCargoPalletLifterReceipt(String uuid, String id, GateID gateID, int numberOfAirCargoPallet, ArrayList airCargoPalletIDList) {
        this.uuid = uuid;
        this.id = id;
        this.gateID = gateID;
        this.numberOfAirCargoPallet = numberOfAirCargoPallet;
        this.airCargoPalletIDList = airCargoPalletIDList;
    }

    public String getUuid() {
        return uuid;
    }

    public String getId() {
        return id;
    }

    public GateID getGateID() {
        return gateID;
    }

    public int getNumberOfAirCargoPallet() {
        return numberOfAirCargoPallet;
    }

    public ArrayList getAirCargoPalletIDList() {
        return airCargoPalletIDList;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGateID(GateID gateID) {
        this.gateID = gateID;
    }

    public void setNumberOfAirCargoPallet(int numberOfAirCargoPallet) {
        this.numberOfAirCargoPallet = numberOfAirCargoPallet;
    }

    public void setAirCargoPalletIDList(ArrayList airCargoPalletIDList) {
        this.airCargoPalletIDList = airCargoPalletIDList;
    }
}
