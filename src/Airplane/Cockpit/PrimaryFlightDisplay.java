package Airplane.Cockpit;

import java.util.ArrayList;

public class PrimaryFlightDisplay {
    private PrimaryFlightDisplayViewID currentView;
    private java.util.ArrayList<PrimaryFlightDisplayView> PrimaryFlightDisplayViewList;

    public void show() {
        //TODO Display the flightdisplay, with the currrenID
    }

    public void nextView() {
        currentView = currentView.next();
    }

    public void update(String primaryFlightDisplayViewEntryName, String value) {
        //TODO redundant mit pfdv
    }

    public PrimaryFlightDisplay(PrimaryFlightDisplayViewID currentView) {
        this.currentView = currentView;
    }

    public PrimaryFlightDisplayViewID getCurrentView() {
        return currentView;
    }

    public void setCurrentView(PrimaryFlightDisplayViewID currentView) {
        this.currentView = currentView;
    }

    public ArrayList<PrimaryFlightDisplayView> getPrimaryFlightDisplayViewList() {
        return PrimaryFlightDisplayViewList;
    }

    public void setPrimaryFlightDisplayViewList(ArrayList<PrimaryFlightDisplayView> primaryFlightDisplayViewList) {
        PrimaryFlightDisplayViewList = primaryFlightDisplayViewList;
    }
}
