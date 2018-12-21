package Airplane.FlightControlTest;

import Airplane.*;
import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Body;
import Airplane.Aircraft.Configuration;
import Airplane.Aircraft.Wing;
import Airplane.FlightControls.Enums.FlapType;
//import Airplane.FlightControls.FlightControlCollection;
import Airplane.FlightControls.FlightControlController;
import Airplane.FlightControls.Implementations.Flap;
import Airplane.FlightControls.Interfaces.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class FlightControlControllerTest {
    private FlightControlController flightControlController;
    private Configuration configuration;
    private Airplane airplane;
    //    private FlightControlCollection flightControlCollection;
    private Wing wing;
    private Body body;
    private ArrayList<IDroopNose> idroopNoseArrayList;
    private ArrayList<IElevator> iElevatorArrayList;
    //    private ArrayList<IFlap> iflapArrayList;
    private ArrayList<ISlat> islatArrayList;
    private ArrayList<ILeftAileron> ileftAileronArrayList;
    private ArrayList<IRightAileron> irightAileronArrayList;
    private ArrayList<IRudder> irudderArrayList;
    private ArrayList<ISpoiler> ispoilerArrayList;

    //    private DroopNose droopNose;
//    private Elevator elevator;
    private Flap flapA350TOInboard, flapA350TOOutboard, flapA350APP;
//    private Slat slat;
//    private LeftAileron leftAileron;
//    private RightAileron rightAileron;
//    private Rudder rudder;
//    private Spoiler spoiler;

    @BeforeEach
    void setup() {
        configuration = new Configuration(4, 18, 72, 480, 14);
        airplane = new Airplane(configuration);
        flightControlController = new FlightControlController(airplane);
        wing = new Wing(airplane);
        body = new Body(airplane);
        idroopNoseArrayList = wing.getDroopNoseArrayList();
        iElevatorArrayList = body.getElevatorArrayList();
//        iflapArrayList = wing.getFlapArrayList();
        islatArrayList = wing.getSlatArrayList();
        ileftAileronArrayList = wing.getLeftAileronArrayList();
        irightAileronArrayList = wing.getRightAileronArrayList();
        irudderArrayList = body.getRudderArrayList();
        ispoilerArrayList = wing.getSpoilerArrayList();
//        droopNose = new DroopNose("DroopNoseHersteller", "type01");
//        elevator = new Elevator("ElevatorHersteller", "type01");
        flapA350APP = new Flap("FlapHersteller", "type01", FlapType.A350APP);
        flapA350TOInboard = new Flap("FlapHersteller", "type02", FlapType.A350TOInboard);
        flapA350TOOutboard = new Flap("FlapHersteller", "type03", FlapType.A350TOOutboard);
//        leftAileron = new LeftAileron("AileronHersteller", "type01");
//        rightAileron = new RightAileron("AileronHersteller", "typpe01");
//        rudder = new Rudder("RudderHersteller", "type01");
//        spoiler = new Spoiler("SpoilerHersteller", "type01");
    }

    @Test
    void neutral() {

        for (IDroopNose iDroopNose : idroopNoseArrayList) {
            assertEquals(0, iDroopNose.neutral());
        }
        for (IElevator iElevator : iElevatorArrayList) {
            assertEquals(0, iElevator.neutral());
        }
        assertEquals(0, flapA350APP.neutral());
        assertEquals(0, flapA350TOOutboard.neutral());
        assertEquals(0, flapA350TOInboard.neutral());
        for (ISlat iSlat : islatArrayList) {
            assertEquals(0, iSlat.neutral());
        }
        for (ILeftAileron iLeftAileron : ileftAileronArrayList) {
            assertEquals(0, iLeftAileron.neutral());
        }
        for (IRightAileron iRightAileron : irightAileronArrayList) {
            assertEquals(0, iRightAileron.neutral());
        }
        for (IRudder iRudder : irudderArrayList) {
            assertEquals(0, iRudder.neutral());
        }
        for (ISpoiler iSpoiler : ispoilerArrayList) {
            assertEquals(0, iSpoiler.neutral());
        }

    }

    @Test
    void startup() {
        airplane.startup();
        for (IDroopNose iDroopNose : idroopNoseArrayList) {
            assertEquals(0, iDroopNose.neutral());
        }
        for (IElevator iElevator : iElevatorArrayList) {
            assertEquals(0, iElevator.neutral());
        }
//        assertEquals(0, droopNose.getDegree());
//        assertEquals(0, elevator.getDegree());
        assertEquals(0, flapA350APP.neutral());
        assertEquals(0, flapA350TOOutboard.neutral());
        assertEquals(0, flapA350TOInboard.neutral());
        for (ISlat iSlat : islatArrayList) {
            assertEquals(0, iSlat.neutral());
        }
        for (ILeftAileron iLeftAileron : ileftAileronArrayList) {
            assertEquals(0, iLeftAileron.neutral());
        }
        for (IRightAileron iRightAileron : irightAileronArrayList) {
            assertEquals(0, iRightAileron.neutral());
        }
        for (IRudder iRudder : irudderArrayList) {
            assertEquals(0, iRudder.neutral());
        }
        for (ISpoiler iSpoiler : ispoilerArrayList) {
            assertEquals(0, iSpoiler.neutral());
        }
//        assertEquals(0, slat.getDegree());
//        assertEquals(0, leftAileron.getDegree());
//        assertEquals(0, rightAileron.getDegree());
//        assertEquals(0, rudder.getDegree());
//        assertEquals(0, spoiler.getDegree());

    }

    @Test
    void taxi() {
        airplane.taxi();
        // ---Flight_Controls---
        //
        /*assertEquals(0, droopNose.getDegree());
        assertEquals(0, elevator.getDegree());
        assertEquals(0, flapA350APP.getDegree());
        assertEquals(0, flapA350TOOutboard.getDegree());
        assertEquals(0, flapA350TOInboard.getDegree());
        assertEquals(0, slat.getDegree());
        assertEquals(0, leftAileron.getDegree());
        assertEquals(0, rightAileron.getDegree());
        assertEquals(0, rudder.getDegree());
        assertEquals(0, spoiler.getDegree());*/

        for (IDroopNose iDroopNose : idroopNoseArrayList) {
            assertEquals(0, iDroopNose.neutral());
        }
        for (IElevator iElevator : iElevatorArrayList) {
            assertEquals(0, iElevator.neutral());
        }
//        assertEquals(0, droopNose.getDegree());
//        assertEquals(0, elevator.getDegree());
        assertEquals(0, flapA350APP.neutral());
        assertEquals(0, flapA350TOOutboard.neutral());
        assertEquals(0, flapA350TOInboard.neutral());
        for (ISlat iSlat : islatArrayList) {
            assertEquals(0, iSlat.neutral());
        }
        for (ILeftAileron iLeftAileron : ileftAileronArrayList) {
            assertEquals(0, iLeftAileron.neutral());
        }
        for (IRightAileron iRightAileron : irightAileronArrayList) {
            assertEquals(0, iRightAileron.neutral());
        }
        for (IRudder iRudder : irudderArrayList) {
            assertEquals(0, iRudder.neutral());
        }
        for (ISpoiler iSpoiler : ispoilerArrayList) {
            assertEquals(0, iSpoiler.neutral());
        }
    }

    @Test
    void takeOff() {
        airplane.takeOff();
        // ---Flight_Controls---
        /*assertEquals(-25, droopNose.getDegree());
        assertEquals(10, elevator.getDegree());
        assertEquals(9, flapA350APP.getDegree());
        assertEquals(6, flapA350TOInboard.getDegree());
        assertEquals(12, flapA350TOOutboard.getDegree());
        assertEquals(0, rightAileron.getDegree());
        assertEquals(0, leftAileron.getDegree());
        assertEquals(0, rudder.getDegree());
        assertEquals(-5, slat.getDegree());
        assertEquals(0, spoiler.getDegree());*/

        for (IDroopNose iDroopNose : idroopNoseArrayList) {
            assertEquals(-25, iDroopNose.down(25));
        }
        for (IElevator iElevator : iElevatorArrayList) {
            assertEquals(10, iElevator.up(10));
        }
//        assertEquals(0, droopNose.getDegree());
//        assertEquals(0, elevator.getDegree());
        assertEquals(9, flapA350APP.levelOne());
        assertEquals(6, flapA350TOOutboard.levelOne());
        assertEquals(12, flapA350TOInboard.levelOne());
        for (ISlat iSlat : islatArrayList) {
            assertEquals(-5, iSlat.down(5));
        }
        for (ILeftAileron iLeftAileron : ileftAileronArrayList) {
            assertEquals(0, iLeftAileron.neutral());
        }
        for (IRightAileron iRightAileron : irightAileronArrayList) {
            assertEquals(0, iRightAileron.neutral());
        }
        for (IRudder iRudder : irudderArrayList) {
            assertEquals(0, iRudder.neutral());
        }
        for (ISpoiler iSpoiler : ispoilerArrayList) {
            assertEquals(0, iSpoiler.neutral());
        }

    }

    @Test
    void climbing() {
        airplane.climbing();
                /*assertEquals(-22, droopNose.getDegree());
        assertEquals(10, elevator.getDegree());
        assertEquals(0, flapA350APP.getDegree());
        assertEquals(0, flapA350TOOutboard.getDegree());
        assertEquals(0, flapA350TOInboard.getDegree());
        assertEquals(0, slat.getDegree());
        assertEquals(0, leftAileron.getDegree());
        assertEquals(0, rightAileron.getDegree());
        assertEquals(0, rudder.getDegree());
        assertEquals(0, spoiler.getDegree());*/

        for (IDroopNose iDroopNose : idroopNoseArrayList) {
            assertEquals(-22, iDroopNose.down(22));
        }
        for (IElevator iElevator : iElevatorArrayList) {
            assertEquals(10, iElevator.up(10));
        }
//        assertEquals(0, droopNose.getDegree());
//        assertEquals(0, elevator.getDegree());
        assertEquals(0, flapA350APP.neutral());
        assertEquals(0, flapA350TOOutboard.neutral());
        assertEquals(0, flapA350TOInboard.neutral());
        for (ISlat iSlat : islatArrayList) {
            assertEquals(0, iSlat.neutral());
        }
        for (ILeftAileron iLeftAileron : ileftAileronArrayList) {
            assertEquals(0, iLeftAileron.neutral());
        }
        for (IRightAileron iRightAileron : irightAileronArrayList) {
            assertEquals(0, iRightAileron.neutral());
        }
        for (IRudder iRudder : irudderArrayList) {
            assertEquals(0, iRudder.neutral());
        }
        for (ISpoiler iSpoiler : ispoilerArrayList) {
            assertEquals(0, iSpoiler.neutral());
        }

    }

    @Test
    void leftTurn() {
        airplane.leftTurn();
        // ---Flight_Controls---
        /*assertEquals(0, droopNose.getDegree());
        assertEquals(0, elevator.getDegree());
        assertEquals(0, flapA350APP.getDegree());
        assertEquals(0, flapA350TOInboard.getDegree());
        assertEquals(0, flapA350TOOutboard.getDegree());
        assertEquals(-10, rightAileron.getDegree());
        assertEquals(10, leftAileron.getDegree());
        assertEquals(-15, rudder.getDegree());
        assertEquals(0, slat.getDegree());
        assertEquals(0, spoiler.getDegree());*/

        for (IDroopNose iDroopNose : idroopNoseArrayList) {
            assertEquals(0, iDroopNose.neutral());
        }
        for (IElevator iElevator : iElevatorArrayList) {
            assertEquals(0, iElevator.neutral());
        }
//        assertEquals(0, droopNose.getDegree());
//        assertEquals(0, elevator.getDegree());
        assertEquals(0, flapA350APP.neutral());
        assertEquals(0, flapA350TOOutboard.neutral());
        assertEquals(0, flapA350TOInboard.neutral());
        for (ISlat iSlat : islatArrayList) {
            assertEquals(0, iSlat.neutral());
        }
        for (ILeftAileron iLeftAileron : ileftAileronArrayList) {
            assertEquals(10, iLeftAileron.up(10));
        }
        for (IRightAileron iRightAileron : irightAileronArrayList) {
            assertEquals(-10, iRightAileron.down(10));
        }
        for (IRudder iRudder : irudderArrayList) {
            assertEquals(-15, iRudder.right(15));
        }
        for (ISpoiler iSpoiler : ispoilerArrayList) {
            assertEquals(0, iSpoiler.neutral());
        }

    }

    @Test
    void rightTurn() {
        airplane.rightTurn();
        // ---Flight_Controls---
        /*assertEquals(0, droopNose.getDegree());
        assertEquals(0, elevator.getDegree());
        assertEquals(0, flapA350APP.getDegree());
        assertEquals(0, flapA350TOInboard.getDegree());
        assertEquals(0, flapA350TOOutboard.getDegree());
        assertEquals(10, rightAileron.getDegree());
        assertEquals(-10, leftAileron.getDegree());
        assertEquals(15, rudder.getDegree());
        assertEquals(0, slat.getDegree());
        assertEquals(0, spoiler.getDegree());*/
        for (IDroopNose iDroopNose : idroopNoseArrayList) {
            assertEquals(0, iDroopNose.neutral());
        }
        for (IElevator iElevator : iElevatorArrayList) {
            assertEquals(0, iElevator.neutral());
        }
//        assertEquals(0, droopNose.getDegree());
//        assertEquals(0, elevator.getDegree());
        assertEquals(0, flapA350APP.neutral());
        assertEquals(0, flapA350TOOutboard.neutral());
        assertEquals(0, flapA350TOInboard.neutral());
        for (ISlat iSlat : islatArrayList) {
            assertEquals(0, iSlat.neutral());
        }
        for (ILeftAileron iLeftAileron : ileftAileronArrayList) {
            assertEquals(-10, iLeftAileron.down(10));
        }
        for (IRightAileron iRightAileron : irightAileronArrayList) {
            assertEquals(10, iRightAileron.up(10));
        }
        for (IRudder iRudder : irudderArrayList) {
            assertEquals(15, iRudder.left(15));
        }
        for (ISpoiler iSpoiler : ispoilerArrayList) {
            assertEquals(0, iSpoiler.neutral());
        }

    }

    @Test
    void landing() {

    }
}
