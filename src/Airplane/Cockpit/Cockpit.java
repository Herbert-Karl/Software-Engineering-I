package Airplane.Cockpit;

public class Cockpit implements ICockpit {
    private PrimaryFlightDisplay primaryFlightDisplay;
    private Phase selectedPhase;

    public void selectNextPhase() {
        selectedPhase = selectedPhase.next();
    }

    public void executeSelectedPhase() {
        //TODO
    }

    public void selectNextPrimaryFlightDisplay() {
        //TODO
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

    public Cockpit(PrimaryFlightDisplay primaryFlightDisplay) {
        this.primaryFlightDisplay = primaryFlightDisplay;
    }
}
