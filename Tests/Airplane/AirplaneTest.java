package Airplane;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Configuration;
import Airplane.Aircraft.Wing;
import Airplane.Aircraft.Body;
import Airplane.FlightControls.Enums.FlapType;
import Airplane.FlightControls.FlightControlCollection;
import Airplane.FlightControls.FlightControlController;
import Airplane.FlightControls.Implementations.DroopNose;
import Airplane.FlightControls.Implementations.Flap;
import Airplane.FlightControls.Interfaces.*;
import Airplane.Lights.*;
import Airplane.Management.CheckPoint;
import Airplane.Management.CostOptimizer;
import Airplane.Management.RouteManagement;
import Airplane.cabin.AirConditioning;
import Airplane.stowage_cargo.CargoSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AirplaneTest {
    private Configuration testConfiguration;
    private Airplane testAirplane;

    //private Gear testGear;
    private TaxiLight testTaxiLight;
    //private APU testAPU;
    //private Engine testEngine;
    private AirConditioning testAirConditioning;
    //private Kitchen testKitchen;
    //private Lavatory testLavatory;

    // ---Doors---
    //private BulkCargoDoor testBulkCargoDoor;
    //private CrewDoor testCrewDoor;
    //private EmergencyExitDoor testEmergencyExitDoor;
    //private GearDoor testGearDoor

    // ---Lights---
    private AntiCollisionLight testAntiCollisionLight;
    private CargoCompartmentLight testCargoCompartmentLight;
    private LogoLight testLogoLight;
    private LeftNavigationLight testLeftNavigationLight;
    private RightNavigationLight testRightNavigationLight;
    private TailNavigationLight testTailNavigationLight;

    //private IceDetectorProbe testIceDetectorProbe;
    //private RadarAltimeter testRadarAltimeter;
    //private TCAS testTCAS;
    //private Camera camera;
    //private GPS testGPS;
    //private Radar testRadar;
    //private SatCom testSatCom;
    //private VHF testVHF;

    // ---Management---
    private CargoSystem testCargoSystem;
    private ArrayList<CheckPoint> testCheckPointList;
    private CostOptimizer testCostOptimizer;
    private RouteManagement testRouteManagement;

//	private DroopNose testDroopNose;
    //private Elevator testElevator;
    //private Slat testSlat;
    //private Flat testFlat;

    // ---Systems---
    //private WasteSystem testWasteSystem;
    //private WaterSystem testWaterSystem;

    //private FireDetector testFireDetector;

    // ---Ailerons and Rudder---
    //private LeftAileron testLeftAileron;
    //private RightAileron testRightAileron;
    //private Rudder testRudder;

    // ---Flight_Controls---
    private FlightControlCollection flightControlCollection;
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

    // ---Sensors---
    private ExhaustGasTemperatureSensor exhaustGasTemperatureSensor;
    private FuelFlowSensor fuelFlowSensor;
    private FuelSensor fuelSensor;
    private IceDetectorProbe iceDetectorProbe;
    private FireDetector fireDetector;
    private OxygenSensor oxygenSensor;
    private ShockSensor shockSensor;
    private StallingSensor stallingSensor;
    private TemperatureSensor temperatureSensor;
    private AirflowSensor airflowSensor;
    private PitotTube pitotTube;
    private RadarAltimeter radarAltimeter;
    //    private TCAS tcas;
    private TurbulentAirFlowSensor turbulentAirFlowSensor;


    @BeforeEach
    public void setup() {
        testConfiguration = new Configuration(4, 18, 72, 480, 14);
        testAirplane = new Airplane(testConfiguration);

        //testGear = new Gear();
        testTaxiLight = new TaxiLight("TaxiLightHersteller01", "type01", "TL01", false);
        //testAPU = new APU();
        //testEngine = new Engine();
        testAirConditioning = new AirConditioning("AC01", "type01", "AirConditioningHersteller");
        //testKitchen = new Kitchen("K01", KitchenType.FIRST);
        //testLavatory = new Lavatory();

        // ---Doors---
        //testBulkCargoDoor = new BulkCargoDoor();
        //testCrewDoor = new CrewDoor();
        //testEmergencyExitDoor = new EmergencyExitDoor();
        //testGearDoor = new GearDoor();

        // ---Lights---
        testAntiCollisionLight = new AntiCollisionLight("AntiCollisionLightHersteller", "type01", "ACL01", false);
        testCargoCompartmentLight = new CargoCompartmentLight("CargoCompartmentLightHerrsteller", "type01", "CCL01", false);
        testLogoLight = new LogoLight("LogoLightHersteller", "type01", "LL01", false);
        testLeftNavigationLight = new LeftNavigationLight("NavigationLightHersteller", LightType.green, "LNL01", Position.port, false);
        testRightNavigationLight = new RightNavigationLight("NavigationLightHersteller", LightType.green, "RNL01", Position.port, false);
        testTailNavigationLight = new TailNavigationLight("NavigationLightHersteller", "type01", "TNL01", false);

        //testIceDetectorProbe = new IceDetectorProbe();
        //testRadarAltimeter = new RadarAltimerter();
        //testTCAS = new TCAS();
        //testCamera = new Camera();
        //testGPS = new GPS();
        //testRadar = new Radar();
        //testSatCom = new SatCom();
        //testVHF = new VHF();

        // ---Management---
        testCargoSystem = new CargoSystem("CargoSystemHersteller", "type01", "CS01");

        testCheckPointList = new ArrayList<CheckPoint>();
        testCostOptimizer = new CostOptimizer("CostOptimizerHersteller", "type01", "CO01", false, testCheckPointList, 2);
        testRouteManagement = new RouteManagement("RouteManagementHersteller", "type01", "RM01", false, testCheckPointList, 1.5);

//		testDroopNose = new DroopNose("DroopNoseHersteller", "type01");
        //testElevator = new Elevator("ElevatorHersteller", "type01");
        //testSlat = new Slat("SlatHersteller", "type01");
        //testFlat = new Flat();

        // ---Systems---
        //testWasteSystem = new WasteSystem();
        //testWaterSystem = new WaterSystem();

        //testFireDetector = new FireDetector();

        // ---Ailerons and Rudder---
        //testLeftAileron = new LeftAileron();
        //testRightAileron = new RightAileron();
        //testRudder = new Rudder();

        // ---Flight_Controls---
        wing = new Wing(testAirplane);
        body = new Body(testAirplane);
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

        // ---Sensors---
        exhaustGasTemperatureSensor = new ExhaustGasTemperatureSensor();
        fuelFlowSensor = new FuelFlowSensor();
        fuelSensor = new FuelSensor();
        iceDetectorProbe = new IceDetectorProbe();
        fireDetector = new FireDetector();
        oxygenSensor = new OxygenSensor();
        shockSensor = new ShockSensor();
        stallingSensor = new StallingSensor();
        temperatureSensor = new TemperatureSensor();
        airflowSensor = new AirflowSensor();
        pitotTube = new PitotTube();
        radarAltimeter = new RadarAltimeter();
//        tcas = new TCAS();
        turbulentAirFlowSensor = new TurbulentAirFlowSensor();

    }

    @Test
    public void testStartUp() {
        testAirplane.startup();

        //Klasse APU ben�tigt (Methode start() ben�tigt)
        //Klasse Engine ben�tigt (Methode start() ben�tigt)

        assertTrue(testAirConditioning.getIsOn());

        //Klasse Kitchen vorhanden (Methode lock() ben�tigt)
        assertTrue(testKitchen.getLocked());

        //Klasse Lavatory ben�tigt (Methode lock() ben�tigt) UND Klasse KitchenLavatory ben�tigt
        assertTrue(testLavatory.getLocked();


        // ---Doors---
        //Klasse BulkCargoDoor ben�tigt (Methode lock() ben�tigt)
        assertTrue(testBulkCargoDoor.getLocked());

        //Klasse CrewDoor ben�tigt (Methode lock() ben�tigt)
        assertTrue(testBulkCargoDoor.getLocked());

        //Klasse EmergencyExitDoor ben�tigt (Methode lock() ben�tigt)
        assertTrue(testEmergencyExitDoor.getLocked());

        //Klasse GearDoor ben�tigt (Methode lock() ben�tigt)
        assertTrue(testGearDoor.getLocked());

        // ---Lights---
        assertTrue(testAntiCollisionLight.getIsOn());
        assertTrue(testCargoCompartmentLight.getIsOn() == false && testCargoCompartmentLight.getBrightnessLevel() == 0);
        assertTrue(testLogoLight.getIsOn());
        assertTrue(testLeftNavigationLight.getIsOn());
        assertTrue(testRightNavigationLight.getIsOn());
        assertTrue(testTailNavigationLight.getIsOn());

        //Klasse IceDetectorProbe ben�tigt (Methode activate() ben�tigt)

        //Klasse RadarAltimeter ben�tigt (Methode on() ben�tigt)
        assertTrue(testRadarAltimeter.getIsOn();

        //Klasse TCAS ben�tigt (Methode on() ben�tigt)
        assertTrue(testTCAS.getIsOn());

        //Klasse Camera ben�tigt (Methode on() ben�tigt)

        //Klasse GPS ben�tigt (Methode on() ben�tigt)
        assertTrue(testGPS.getIsOn());

        //Klasse Radar ben�tigt (Methode on() ben�tigt)
        assertTrue(testRadar.getIsOn());

        //Klasse SatCom ben�tigt (Methode on() ben�tigt)
        assertTrue(testSatCom.getIsOn());

        //Klasse VHF ben�tigt (Methode on() ben�tigt)
        assertTrue(testVHF.getIsOn());


        // ---Management---
        //Klasse CargoSystem vorhanden (Methode getIsLocked() ben�tigt)
        assertTrue(testCargoSystem.getIsLocked());

        //Methode isOn() zu getIsOn() �ndern...
        assertTrue(testCostOptimizer.isOn());

        //Methode isOn() zu getIsOn() �ndern...
        assertTrue(testRouteManagement.isOn());

        // ---Flight_Controls---
        //
        for (IDroopNose iDroopNose : idroopNoseArrayList) {
            assertEquals(0, iDroopNose.getDegree());
        }
        for (IElevator iElevator : iElevatorArrayList) {
            assertEquals(0, iElevator.getDegree());
        }
//        assertEquals(0, droopNose.getDegree());
//        assertEquals(0, elevator.getDegree());
        assertEquals(0, flapA350APP.getDegree());
        assertEquals(0, flapA350TOOutboard.getDegree());
        assertEquals(0, flapA350TOInboard.getDegree());
        for (ISlat iSlat : islatArrayList) {
            assertEquals(0, iSlat.getDegree());
        }
        for (ILeftAileron iLeftAileron : ileftAileronArrayList) {
            assertEquals(0, ileftAileronArrayList.getDegree());
        }
        for (IRightAileron iRightAileron : irightAileronArrayList) {
            assertEquals(0, irightAileronArrayList.getDegree());
        }
        for (IRudder iRudder : irudderArrayList) {
            assertEquals(0, irudderArrayList.getDegree());
        }
        for (ISpoiler iSpoiler : ispoilerArrayList) {
            assertEquals(0, ispoilerArrayList.getDegree());
        }
//        assertEquals(0, slat.getDegree());
//        assertEquals(0, leftAileron.getDegree());
//        assertEquals(0, rightAileron.getDegree());
//        assertEquals(0, rudder.getDegree());
//        assertEquals(0, spoiler.getDegree());

        // ---Sensors---
        assertTrue(!exhaustGasTemperatureSensor.version().isEmpty());
        // measure()
        assertEquals(100, exhaustGasTemperatureSensor.getTemperature());
        // alarmMajor()
        assertFalse(exhaustGasTemperatureSensor.isAlarmMajor());
        // alarmCritical()
        assertFalse(exhaustGasTemperatureSensor.isAlarmCritical());

        // version():String
        assertTrue(!fuelFlowSensor.version().isEmpty());
        // measure()
        assertEquals(3.78, fuelFlowSensor.getFuelFlow());

        // version():String
        assertTrue(!fuelSensor.version().isEmpty());
        // alarmReserve()
        assertFalse(fuelSensor.isAlarmReserve());
        // alarmMajor()
        assertFalse(fuelSensor.isAlarmMajor());
        // alarmCritical()
        assertFalse(fuelSensor.isCritical());

        // activate()
        assertTrue(iceDetectorProbe.isActivated());
        assertFalse(iceDetectorProbe.isIceDetected());

        // version():String
        assertTrue(!fireDetector.version().isEmpty());
        String[] air = {"cockpit", "hold", "passenger_compartment"};
        for (String string : air) {
            assertFalse(fireDetector.scan(string));
        }
        assertFalse(fireDetector.isAlarm());

        // version():String
        assertTrue(!oxygenSensor.version().isEmpty());
        assertFalse(oxygenSensor.isAlarm());
        //measure(airFlow:string):int

        // version():String
        assertTrue(!oxygenSensor.version().isEmpty());
        assertTrue(shockSensor.isCalibrated());
        assertFalse(shockSensor.isShockDetected());

    }

    @Test
    public void testClimbing() {
        testAirplane.climbing();

        //Klasse DroopNose ben�tigt (Methode fullDown() ben�tigt)
        //Klasse Elevator ben�tigt (Methode fullDown() ben�tigt)
        //Klasse Slat ben�tigt (Methode fullDown() ben�tigt)
        //Klasse Flat ben�tigt (Methode levelOne() ben�tigt) -> Wahrscheinlich Klasse Flap gemeint

        assertFalse(testKitchen.getIsLocked());
        assertFalse(testLavatory.getIsLocked());

        //Klasse WasteSystem ben�tigt (Methode on() ben�tigt)
        assertTrue(testWasteSystem.getIsOn());

        //Klasse WaterSystem ben�tigt (Methode on() ben�tigt)
        assertTrue(testWaterSystem.getIsOn());

        // ---Flight_Controls---

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
            assertEquals(-22, iDroopNose.getDegree());
        }
        for (IElevator iElevator : iElevatorArrayList) {
            assertEquals(10, iElevator.getDegree());
        }
//        assertEquals(0, droopNose.getDegree());
//        assertEquals(0, elevator.getDegree());
        assertEquals(0, flapA350APP.getDegree());
        assertEquals(0, flapA350TOOutboard.getDegree());
        assertEquals(0, flapA350TOInboard.getDegree());
        for (ISlat iSlat : islatArrayList) {
            assertEquals(0, iSlat.getDegree());
        }
        for (ILeftAileron iLeftAileron : ileftAileronArrayList) {
            assertEquals(0, ileftAileronArrayList.getDegree());
        }
        for (IRightAileron iRightAileron : irightAileronArrayList) {
            assertEquals(0, irightAileronArrayList.getDegree());
        }
        for (IRudder iRudder : irudderArrayList) {
            assertEquals(0, irudderArrayList.getDegree());
        }
        for (ISpoiler iSpoiler : ispoilerArrayList) {
            assertEquals(0, ispoilerArrayList.getDegree());
        }
    }

    @Test
    public void testTaxi() {
        testAirplane.taxi();

        //Klasse Gear ben�tigt (Methode: releaseBrake())
        assertTrue(testTaxiLight.getIsOn());
        //Klasse APU ben�tigt (Methode: increaseRPM(250))

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
            assertEquals(0, iDroopNose.getDegree());
        }
        for (IElevator iElevator : iElevatorArrayList) {
            assertEquals(0, iElevator.getDegree());
        }
//        assertEquals(0, droopNose.getDegree());
//        assertEquals(0, elevator.getDegree());
        assertEquals(0, flapA350APP.getDegree());
        assertEquals(0, flapA350TOOutboard.getDegree());
        assertEquals(0, flapA350TOInboard.getDegree());
        for (ISlat iSlat : islatArrayList) {
            assertEquals(0, iSlat.getDegree());
        }
        for (ILeftAileron iLeftAileron : ileftAileronArrayList) {
            assertEquals(0, ileftAileronArrayList.getDegree());
        }
        for (IRightAileron iRightAileron : irightAileronArrayList) {
            assertEquals(0, irightAileronArrayList.getDegree());
        }
        for (IRudder iRudder : irudderArrayList) {
            assertEquals(0, irudderArrayList.getDegree());
        }
        for (ISpoiler iSpoiler : ispoilerArrayList) {
            assertEquals(0, ispoilerArrayList.getDegree());
        }
    }

    @Test
    public void testTakeOff() {
        testAirplane.takeOff();

        //Klasse Engine ben�tigt (Methoden increase(), decrease(), getIsAlarm() und shutdown() ben�tigt)
        //Klasse FireDetector ben�tigt (Methode scan() ben�tigt)

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
            assertEquals(-25, iDroopNose.getDegree());
        }
        for (IElevator iElevator : iElevatorArrayList) {
            assertEquals(10, iElevator.getDegree());
        }
//        assertEquals(0, droopNose.getDegree());
//        assertEquals(0, elevator.getDegree());
        assertEquals(9, flapA350APP.getDegree());
        assertEquals(6, flapA350TOOutboard.getDegree());
        assertEquals(12, flapA350TOInboard.getDegree());
        for (ISlat iSlat : islatArrayList) {
            assertEquals(-5, iSlat.getDegree());
        }
        for (ILeftAileron iLeftAileron : ileftAileronArrayList) {
            assertEquals(0, ileftAileronArrayList.getDegree());
        }
        for (IRightAileron iRightAileron : irightAileronArrayList) {
            assertEquals(0, irightAileronArrayList.getDegree());
        }
        for (IRudder iRudder : irudderArrayList) {
            assertEquals(0, irudderArrayList.getDegree());
        }
        for (ISpoiler iSpoiler : ispoilerArrayList) {
            assertEquals(0, ispoilerArrayList.getDegree());
        }
    }

    @Test
    public void testRightTurn() {
        testAirplane.rightTurn();

        //Klasse RightAileron ben�tigt (Methoden up() und neutral() ben�tigt)
        //Klasse LeftAileron ben�tigt (Methoden down() und neutral() ben�tigt)
        //Klasse Rudder ben�tigt (Methoden fullRight() und neutral() ben�tigt)

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
            assertEquals(0, iDroopNose.getDegree());
        }
        for (IElevator iElevator : iElevatorArrayList) {
            assertEquals(0, iElevator.getDegree());
        }
//        assertEquals(0, droopNose.getDegree());
//        assertEquals(0, elevator.getDegree());
        assertEquals(0, flapA350APP.getDegree());
        assertEquals(0, flapA350TOOutboard.getDegree());
        assertEquals(0, flapA350TOInboard.getDegree());
        for (ISlat iSlat : islatArrayList) {
            assertEquals(0, iSlat.getDegree());
        }
        for (ILeftAileron iLeftAileron : ileftAileronArrayList) {
            assertEquals(-10, ileftAileronArrayList.getDegree());
        }
        for (IRightAileron iRightAileron : irightAileronArrayList) {
            assertEquals(10, irightAileronArrayList.getDegree());
        }
        for (IRudder iRudder : irudderArrayList) {
            assertEquals(15, irudderArrayList.getDegree());
        }
        for (ISpoiler iSpoiler : ispoilerArrayList) {
            assertEquals(0, ispoilerArrayList.getDegree());
        }

    }

    @Test
    public void testLeftTurn() {
        testAirplane.leftTurn();

        //Klasse RightAileron ben�tigt (Methoden down() und neutral() ben�tigt)
        //Klasse LeftAileron ben�tigt (Methoden up() und neutral() ben�tigt)
        //Klasse Rudder ben�tigt (Methoden fullLeft() und neutral() ben�tigt)

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
            assertEquals(0, iDroopNose.getDegree());
        }
        for (IElevator iElevator : iElevatorArrayList) {
            assertEquals(0, iElevator.getDegree());
        }
//        assertEquals(0, droopNose.getDegree());
//        assertEquals(0, elevator.getDegree());
        assertEquals(0, flapA350APP.getDegree());
        assertEquals(0, flapA350TOOutboard.getDegree());
        assertEquals(0, flapA350TOInboard.getDegree());
        for (ISlat iSlat : islatArrayList) {
            assertEquals(0, iSlat.getDegree());
        }
        for (ILeftAileron iLeftAileron : ileftAileronArrayList) {
            assertEquals(10, ileftAileronArrayList.getDegree());
        }
        for (IRightAileron iRightAileron : irightAileronArrayList) {
            assertEquals(-10, irightAileronArrayList.getDegree());
        }
        for (IRudder iRudder : irudderArrayList) {
            assertEquals(-15, irudderArrayList.getDegree());
        }
        for (ISpoiler iSpoiler : ispoilerArrayList) {
            assertEquals(0, ispoilerArrayList.getDegree());
        }
    }

}
