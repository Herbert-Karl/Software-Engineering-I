package Airplane.Cockpit;

import Airplane.Aircraft.Airplane;

public class Cockpit implements ICockpit {
    private PrimaryFlightDisplay primaryFlightDisplay;
    private Phase selectedPhase;

    public void selectNextPhase() {
        selectedPhase = selectedPhase.next();
    }

    public void executeSelectedPhase(Airplane airplane) {
        switch(selectedPhase){
            case Startup:
                airplane.startup();
                break;
            case Taxi:
                airplane.taxi();
                break;
            case TakeOff:
                airplane.takeOff();
                break;
            case Climbing:
                airplane.climbing();
                break;
            case LeftTurn:
                airplane.leftTurn();
            case RightTurn:
                airplane.rightTurn();
                break;
        }
    }

    public void selectNextPrimaryFlightDisplay() {
        primaryFlightDisplay.nextView();
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
