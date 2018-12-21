package Airplane.Cockpit;

import java.util.ArrayList;

public class PrimaryFlightDisplay {
    private PrimaryFlightDisplayViewID currentView;
    private java.util.ArrayList<PrimaryFlightDisplayView> PrimaryFlightDisplayViewList;

    public void show() {
        //TODO
    }

    public void nextView() {
        currentView = currentView.next();
    }

    public void update(String primaryFlightDisplayViewEntryName, String value) {
        for(int i = 0; i<PrimaryFlightDisplayViewList.size(); i++){
            if(PrimaryFlightDisplayViewList.get(i).getId() == currentView){
                PrimaryFlightDisplayViewList.get(i).update(primaryFlightDisplayViewEntryName, value);
                break;
            }
        }
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
