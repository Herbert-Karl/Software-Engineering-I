package Airplane.cockpit;

public class Cockpit implements ICockpit {
    PrimaryFlightDisplay primaryFlightDisplay;
    Phase selectedPhase;

    public Cockpit(PrimaryFlightDisplay primaryFlightDisplay, Phase selectedPhase) {
        this.primaryFlightDisplay = primaryFlightDisplay;
        this.selectedPhase = selectedPhase;
    }

    public PrimaryFlightDisplay getPrimaryFlightDisplay() {
        return primaryFlightDisplay;
    }

    public void setPrimaryFlightDisplay(PrimaryFlightDisplay primaryFlightDisplay) {
        this.primaryFlightDisplay = primaryFlightDisplay;
    }

    public Phase getSelectedPhase() {
        return selectedPhase;
    }

    public void setSelectedPhase(Phase selectedPhase) {
        this.selectedPhase = selectedPhase;
    }

    @Override
    public void selectNextPrimaryFlightDisplayView() {

    }

    @Override
    public void selectNextPhase() {

    }

    @Override
    public void executeSelectedPhase() {

    }
}
