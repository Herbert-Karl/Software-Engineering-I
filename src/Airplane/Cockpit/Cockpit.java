package Airplane.Cockpit;

public class Cockpit implements ICockpit {
    private PrimaryFlightDisplay primaryFlightDisplay;
    private Phase selectedPhase;

    public void selectNextPhase() {
        selectedPhase = selectedPhase.next();
    }

    public void executeSelectedPhase() {
        // TODO calls the function from airplane based on the selcted phase
    }

    public void selectNextPrimaryFlightDisplay() {
        //TODO  in wie fern ist das versch von nextView() aus PFD.java???
    }

    public PrimaryFlightDisplay getPrimaryFlightDisplay() {
        return primaryFlightDisplay;
    }

    public void setPrimaryFlightDisplay(PrimaryFlightDisplay primaryFlightDisplay) {
        this.primaryFlightDisplay = primaryFlightDisplay;
    }

    public Cockpit(PrimaryFlightDisplay primaryFlightDisplay, Phase selectedPhase) {
        this.primaryFlightDisplay = primaryFlightDisplay;
        this.selectedPhase = selectedPhase;
    }
}
