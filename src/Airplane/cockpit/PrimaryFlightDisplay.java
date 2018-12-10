package Airplane.cockpit;

import java.util.ArrayList;

public class PrimaryFlightDisplay {
    private PrimaryFlightDisplayViewID currentViewID;
    private ArrayList<PrimaryFlightDisplayView> primaryFlightDisplayViewList;

    public PrimaryFlightDisplay(PrimaryFlightDisplayViewID currentViewID, ArrayList<PrimaryFlightDisplayView> primaryFlightDisplayViewList) {
        this.currentViewID = currentViewID;
        this.primaryFlightDisplayViewList = primaryFlightDisplayViewList;
    }

    public PrimaryFlightDisplayViewID getCurrentViewID() {
        return currentViewID;
    }

    public void setCurrentViewID(PrimaryFlightDisplayViewID currentViewID) {
        this.currentViewID = currentViewID;
    }

    public ArrayList<PrimaryFlightDisplayView> getPrimaryFlightDisplayViewList() {
        return primaryFlightDisplayViewList;
    }

    public void setPrimaryFlightDisplayViewList(ArrayList<PrimaryFlightDisplayView> primaryFlightDisplayViewList) {
        this.primaryFlightDisplayViewList = primaryFlightDisplayViewList;
    }

    public void update(String primaryFlightDisplayViewEntryName, String value){

    }

    public void nextView() {

    }

    public void show() {

    }
}
