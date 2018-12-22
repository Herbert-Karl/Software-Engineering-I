package Airplane.FlightControlTest;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Body;
import Airplane.Aircraft.Configuration;
import Airplane.Aircraft.Wing;
import Airplane.FlightControls.AbstractClasses.VerticalRotable;
import Airplane.FlightControls.Interfaces.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class VerticalRotableTest {
    private Configuration configuration;
    private Airplane airplane;
    private Wing wingLeft, wingRight;
    private Body body;
    private ArrayList<IDroopNose> droopNoseLeft, droopNoseRight;
    private ArrayList<IElevator> elevators;
    private ArrayList<ISlat> slatsLeft, slatsRight;
    private ArrayList<ISpoiler> spoilersLeft, spoilersRight;
    private ArrayList<ILeftAileron> leftAileronsLeft, leftAileronsRight;
    private ArrayList<IRightAileron> rightAileronsLeft, rightAileronsRight;

    private

    @BeforeEach
    void setUp() {
        configuration = new Configuration(4, 18, 72, 480, 14);
        airplane = new Airplane(configuration);
        wingLeft = new Wing(airplane);
        wingRight = new Wing(airplane);
        body = new Body(airplane);
        droopNoseLeft = airplane.getLeftWing().getDroopNoseArrayList();
        droopNoseRight = airplane.getRightWing().getDroopNoseArrayList();
        elevators = airplane.getBody().getElevatorArrayList();
        slatsLeft = airplane.getLeftWing().getSlatArrayList();
        slatsRight = airplane.getRightWing().getSlatArrayList();
        spoilersLeft = airplane.getLeftWing().getSpoilerArrayList();
        spoilersRight = airplane.getRightWing().getSpoilerArrayList();
        leftAileronsLeft = airplane.getLeftWing().getLeftAileronArrayList();
        leftAileronsRight = airplane.getRightWing().getLeftAileronArrayList();
        rightAileronsLeft = airplane.getLeftWing().getRightAileronArrayList();
        rightAileronsRight = airplane.getRightWing().getRightAileronArrayList();
    }

    @Test
    void up() {
        for (IDroopNose iDroopNose : droopNoseLeft) {
            assertEquals(4, iDroopNose.up(4));
        }
        for (IDroopNose iDroopNose : droopNoseRight) {
            assertEquals(4, iDroopNose.up(4));
        }
        for (IElevator elevator : elevators) {
            assertEquals(4, elevator.up(4));
        }
        for (ISlat iSlat : slatsLeft) {
            assertEquals(4, iSlat.up(4));
        }
        for (ISlat iSlat : slatsRight) {
            assertEquals(4, iSlat.up(4));
        }
        for (ISpoiler iSpoiler : spoilersLeft) {
            assertEquals(4, iSpoiler.up(4));
        }
        for (ISpoiler iSpoiler : spoilersRight) {
            assertEquals(4, iSpoiler.up(4));
        }
        for (ILeftAileron iLeftAileron : leftAileronsLeft) {
            assertEquals(4, iLeftAileron.up(4));
        }
        for (ILeftAileron iLeftAileron : leftAileronsRight) {
            assertEquals(4, iLeftAileron.up(4));
        }
        for (IRightAileron iRightAileron : rightAileronsLeft) {
            assertEquals(4, iRightAileron.up(4));
        }
        for (IRightAileron iRightAileron : rightAileronsLeft) {
            assertEquals(4, iRightAileron.up(4));
        }
    }

    @Test
    void down() {
        for (IDroopNose iDroopNose : droopNoseLeft) {
            assertEquals(-4, iDroopNose.down(4));
        }
        for (IDroopNose iDroopNose : droopNoseRight) {
            assertEquals(-4, iDroopNose.down(4));
        }
        for (IElevator elevator : elevators) {
            assertEquals(-4, elevator.down(4));
        }
        for (ISlat iSlat : slatsLeft) {
            assertEquals(-4, iSlat.down(4));
        }
        for (ISlat iSlat : slatsRight) {
            assertEquals(-4, iSlat.down(4));
        }
        for (ISpoiler iSpoiler : spoilersLeft) {
            assertEquals(-4, iSpoiler.down(4));
        }
        for (ISpoiler iSpoiler : spoilersRight) {
            assertEquals(-4, iSpoiler.down(4));
        }
        for (ILeftAileron iLeftAileron : leftAileronsLeft) {
            assertEquals(-4, iLeftAileron.down(4));
        }
        for (ILeftAileron iLeftAileron : leftAileronsRight) {
            assertEquals(-4, iLeftAileron.down(4));
        }
        for (IRightAileron iRightAileron : rightAileronsLeft) {
            assertEquals(-4, iRightAileron.down(4));
        }
        for (IRightAileron iRightAileron : rightAileronsLeft) {
            assertEquals(-4, iRightAileron.down(4));
        }

    }

    @Test
    void fullUp() {
        for (IDroopNose iDroopNose : droopNoseLeft) {
            assertEquals(45, iDroopNose.fullUp());
        }
        for (IDroopNose iDroopNose : droopNoseRight) {
            assertEquals(45, iDroopNose.fullUp());
        }
        for (IElevator elevator : elevators) {
            assertEquals(45, elevator.fullUp());
        }
        for (ISlat iSlat : slatsLeft) {
            assertEquals(45, iSlat.fullUp());
        }
        for (ISlat iSlat : slatsRight) {
            assertEquals(45, iSlat.fullUp());
        }
        for (ISpoiler iSpoiler : spoilersLeft) assertEquals(45, iSpoiler.fullUp());

        for (ISpoiler iSpoiler : spoilersRight) {
            assertEquals(45, iSpoiler.fullUp());
        }
        for (ILeftAileron iLeftAileron : leftAileronsLeft) {
            assertEquals(45, iLeftAileron.fullUp());
        }
        for (ILeftAileron iLeftAileron : leftAileronsRight) {
            assertEquals(45, iLeftAileron.fullUp());
        }
        for (IRightAileron iRightAileron : rightAileronsLeft) {
            assertEquals(45, iRightAileron.fullUp());
        }
        for (IRightAileron iRightAileron : rightAileronsLeft) {
            assertEquals(45, iRightAileron.fullUp());
        }

    }

    @Test
    void fullDown() {
        for (IDroopNose iDroopNose : droopNoseLeft) {
            assertEquals(-45, iDroopNose.fullDown());
        }
        for (IDroopNose iDroopNose : droopNoseRight) {
            assertEquals(-45, iDroopNose.fullDown());
        }
        for (IElevator elevator : elevators) {
            assertEquals(-45, elevator.fullDown());
        }
        for (ISlat iSlat : slatsLeft) {
            assertEquals(-45, iSlat.fullDown());
        }
        for (ISlat iSlat : slatsRight) {
            assertEquals(-45, iSlat.fullDown());
        }
        for (ISpoiler iSpoiler : spoilersLeft) assertEquals(-45, iSpoiler.fullDown());

        for (ISpoiler iSpoiler : spoilersRight) {
            assertEquals(-45, iSpoiler.fullDown());
        }
        for (ILeftAileron iLeftAileron : leftAileronsLeft) {
            assertEquals(-45, iLeftAileron.fullDown());
        }
        for (ILeftAileron iLeftAileron : leftAileronsRight) {
            assertEquals(-45, iLeftAileron.fullDown());
        }
        for (IRightAileron iRightAileron : rightAileronsLeft) {
            assertEquals(-45, iRightAileron.fullDown());
        }
        for (IRightAileron iRightAileron : rightAileronsLeft) {
            assertEquals(-45, iRightAileron.fullDown());
        }

    }
}
