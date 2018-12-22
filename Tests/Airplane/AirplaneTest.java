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
/*

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
    private TurbulentAirFlowSensor turbulentAirFlowSensor;*/


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

/*
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
        turbulentAirFlowSensor = new TurbulentAirFlowSensor();*/

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


/*        // ---Sensors---
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
        assertTrue(!shockSensor.version().isEmpty());
        assertTrue(shockSensor.isCalibrated());
        assertFalse(shockSensor.isShockDetected());
        // measure():int
        // calibrate()
        // calibrate(level:double)

        assertTrue(!stallingSensor.version().isEmpty());*/



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

    }

    @Test
    public void testTaxi() {
        testAirplane.taxi();

        //Klasse Gear ben�tigt (Methode: releaseBrake())
        assertTrue(testTaxiLight.getIsOn());
        //Klasse APU ben�tigt (Methode: increaseRPM(250))

    }

    @Test
    public void testTakeOff() {
        testAirplane.takeOff();

        //Klasse Engine ben�tigt (Methoden increase(), decrease(), getIsAlarm() und shutdown() ben�tigt)
        //Klasse FireDetector ben�tigt (Methode scan() ben�tigt)

    }

    @Test
    public void testRightTurn() {
        testAirplane.rightTurn();

        //Klasse RightAileron ben�tigt (Methoden up() und neutral() ben�tigt)
        //Klasse LeftAileron ben�tigt (Methoden down() und neutral() ben�tigt)
        //Klasse Rudder ben�tigt (Methoden fullRight() und neutral() ben�tigt)



    }

    @Test
    public void testLeftTurn() {
        testAirplane.leftTurn();

        //Klasse RightAileron ben�tigt (Methoden down() und neutral() ben�tigt)
        //Klasse LeftAileron ben�tigt (Methoden up() und neutral() ben�tigt)
        //Klasse Rudder ben�tigt (Methoden fullLeft() und neutral() ben�tigt)


    }

}
