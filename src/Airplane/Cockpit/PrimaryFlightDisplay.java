package Airplane.Cockpit;

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
}
