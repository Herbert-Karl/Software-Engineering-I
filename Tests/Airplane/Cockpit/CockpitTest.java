package Airplane.Cockpit;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Configuration;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CockpitTest extends TestCase {
    private PrimaryFlightDisplay primaryFlightDisplay;
    private Cockpit cockpit = new Cockpit(new PrimaryFlightDisplay(PrimaryFlightDisplayViewID.Cabin), Phase.Climbing);

    @Test
    void selectNextPhase() {
        cockpit.selectNextPhase();

        assertEquals(Phase.RightTurn, cockpit.getSelectedPhase());
    }

    @Test
    void selectNextPrimaryFlightDisplay() {
    }

    @Test
    void setPrimaryFlightDisplay() {
        primaryFlightDisplay = new PrimaryFlightDisplay(PrimaryFlightDisplayViewID.Cabin);
        cockpit.setPrimaryFlightDisplay(primaryFlightDisplay);
        assertEquals(primaryFlightDisplay, cockpit.getPrimaryFlightDisplay());
    }

    @Test
    void getPrimaryFlightDisplay() {
        assertEquals(primaryFlightDisplay, cockpit.getPrimaryFlightDisplay());
    }


}