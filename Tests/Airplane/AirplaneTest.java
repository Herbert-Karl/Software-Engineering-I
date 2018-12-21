package Airplane;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Body;
import Airplane.Aircraft.Configuration;
import Airplane.Aircraft.Wing;
import Airplane.FlightControls.Implementations.*;
import Airplane.Lights.*;
import Airplane.Management.CheckPoint;
import Airplane.Management.CostOptimizer;
import Airplane.Management.RouteManagement;
import Airplane.cabin.*;
import Airplane.door.*;
import Airplane.stowage_cargo.CargoSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AirplaneTest {
	private Configuration testConfiguration;
	private Airplane testAirplane;
	
	private Gear testGear;
	private TaxiLight testTaxiLight;
	private APU testAPU;
	private Engine testEngine;
	private AirConditioning testAirConditioning;
	private Kitchen testKitchen;
	private Lavatory testLavatory;
	
	// ---Doors---
	private BulkCargoDoor testBulkCargoDoor;
	private CrewDoor testCrewDoor;
	private EmergencyExitDoor testEmergencyExitDoor;
	private GearDoor testGearDoor
	
	// ---Lights---
	private AntiCollisionLight testAntiCollisionLight;
	private CargoCompartmentLight testCargoCompartmentLight;
	private LogoLight testLogoLight;
	private LeftNavigationLight testLeftNavigationLight;
	private RightNavigationLight testRightNavigationLight;
	private TailNavigationLight testTailNavigationLight;
	
	private IceDetectorProbe testIceDetectorProbe;
	private RadarAltimeter testRadarAltimeter;
	private TCAS testTCAS;
	private Camera testCamera;
	private GPS testGPS;
	private Radar testRadar;
	private SatCom testSatCom;
	private VHF testVHF;
	
	// ---Management---
	private CargoSystem testCargoSystem;
	private ArrayList<CheckPoint> testCheckPointList;
	private CostOptimizer testCostOptimizer;
	private RouteManagement testRouteManagement;
	
	private DroopNose testDroopNose;
	private Elevator testElevator;
	private Slat testSlat;
	private Flat testFlat;
	
	// ---Systems---
	private WasteSystem testWasteSystem;
	private WaterSystem testWaterSystem;
	
	private FireDetector testFireDetector;
	
	// ---Ailerons and Rudder---
	private LeftAileron testLeftAileron;
	private RightAileron testRightAileron;
	private Rudder testRudder;
	
	@BeforeEach
	public void setup() {
		testConfiguration = new Configuration(4, 18, 72, 480, 14);
		testAirplane = new Airplane(testConfiguration);	
		testGear = new Gear();
		testTaxiLight = new TaxiLight("TaxiLightHersteller01", "type01", "TL01", false);
		testAPU = new APU();
		testEngine = new Engine();
		testAirConditioning = new AirConditioning("AC01", "type01", "AirConditioningHersteller");
		testKitchen = new Kitchen("K01", KitchenType.FIRST);
		testLavatory = new Lavatory();
		
		// ---Doors---
		testBulkCargoDoor = new BulkCargoDoor("bcd01", "bcd");
		testCrewDoor = new CrewDoor("cd01","cd");
		testEmergencyExitDoor = new EmergencyExitDoor("eed01", "eed");
		testGearDoor = new GearDoor("gd01", GearDoorType.gear);
		
		// ---Lights---
		testAntiCollisionLight = new AntiCollisionLight("AntiCollisionLightHersteller", "type01", "ACL01", false);
		testCargoCompartmentLight = new CargoCompartmentLight("CargoCompartmentLightHerrsteller", "type01", "CCL01", false);
		testLogoLight = new LogoLight("LogoLightHersteller", "type01", "LL01", false);
		testLeftNavigationLight = new LeftNavigationLight("NavigationLightHersteller", LightType.green, "LNL01", Position.port, false);
		testRightNavigationLight = new RightNavigationLight("NavigationLightHersteller", LightType.green, "RNL01", Position.port, false);
		testTailNavigationLight = new TailNavigationLight("NavigationLightHersteller", "type01", "TNL01", false);
		
		testIceDetectorProbe = new IceDetectorProbe();
		testRadarAltimeter = new RadarAltimerter();
		testTCAS = new TCAS();
		testCamera = new Camera();
		testGPS = new GPS();
		testRadar = new Radar();
		testSatCom = new SatCom();
		testVHF = new VHF();
		
		// ---Management---
		testCargoSystem = new CargoSystem("CargoSystemHersteller", "type01", "CS01");
		
		testCheckPointList = new ArrayList<CheckPoint>();
		testCostOptimizer = new CostOptimizer("CostOptimizerHersteller", "type01", "CO01", false, testCheckPointList, 2);
		testRouteManagement = new RouteManagement("RouteManagementHersteller", "type01", "RM01", false, testCheckPointList, 1.5);
		
		testDroopNose = new DroopNose("DroopNoseHersteller", "type01");
		testElevator = new Elevator("ElevatorHersteller", "type01");
		testSlat = new Slat("SlatHersteller", "type01");
		testFlat = new Flat();
		
		// ---Systems---
		testWasteSystem = new WasteSystem();
		testWaterSystem = new WaterSystem();
		
		testFireDetector = new FireDetector();
		
		// ---Ailerons and Rudder---
		testLeftAileron = new LeftAileron();
		testRightAileron = new RightAileron();
		testRudder = new Rudder();
	}
	
	@Test
	public void testStartUp() {

		testAirplane.startup();

		assertTrue(testAPU.isOn());
		assertTrue(testEngine.isOn());
		assertTrue(testAirConditioning.getIsOn());
		assertTrue(testKitchen.getLocked());
		assertTrue(testLavatory.getLocked());
		
		// ---Doors---
		assertTrue(testBulkCargoDoor.getLocked());
		assertTrue(testBulkCargoDoor.getLocked());
		assertTrue(testEmergencyExitDoor.getLocked());
		assertTrue(testGearDoor.getLocked());
		
		// ---Lights---
		assertTrue(testAntiCollisionLight.getIsOn());
		assertTrue(!testCargoCompartmentLight.getIsOn() && testCargoCompartmentLight.getBrightnessLevel() == 0);
		assertTrue(testLogoLight.getIsOn());
		assertTrue(testLeftNavigationLight.getIsOn());
		assertTrue(testRightNavigationLight.getIsOn());
		assertTrue(testTailNavigationLight.getIsOn());

		assertTrue(testIceDetectorProbe.isOn());
		assertTrue(testRadarAltimeter.getIsOn();
		assertTrue(testTCAS.getIsOn());
		assertTrue(testCamera.isOn()));
		assertTrue(testGPS.getIsOn());
		assertTrue(testRadar.getIsOn());
		assertTrue(testSatCom.getIsOn());
		assertTrue(testVHF.getIsOn());
		
		
		// ---Management---
		assertTrue(testCargoSystem.getIsLocked());
		assertTrue(testCostOptimizer.isOn());
		assertTrue(testRouteManagement.isOn());
	}

	@Test
	public void testAirplaneAttributes(){

		Body body = new Body(testAirplane);
		Wing leftWing = new Wing(testAirplane);
		Wing rightWing = new Wing(testAirplane);

		assertEquals(testAirplane.getBody(), body);
		assertEquals(testAirplane.getLeftWing(), leftWing);
		assertEquals(testAirplane.getRightWing(), rightWing);
	}

	@Test
	public void testClimbing() {
		testAirplane.climbing();

		// when travelling altitude and velocity reached:
		assertTrue(testDroopNose.getIsNeutral());
		assertTrue(testElevator.getIsNeutral());
		assertTrue(testSlat.getIsNeutral());
		assertTrue(testFlat.getIsNeutral());
		assertEquals(testEngine.getThrust(), 3100);
		assertTrue(testGear.isUp());

		assertFalse(testKitchen.getIsLocked()); 
		assertFalse(testLavatory.getIsLocked());
		assertTrue(testWasteSystem.getIsOn());
		assertTrue(testWaterSystem.getIsOn());
	}
	
	@Test
	public void testTaxi() {
		testAirplane.taxi();

		assertFalse(testGear.getBrakeSet());
		assertTrue(testTaxiLight.getIsOn());
		assertEquals(testAPU.getRPM(), 250);
	}
	
	@Test
	public void testTakeOffEngineNormal() {

		// if engine is not on fire
		testEngine.setFire(false);
		testAirplane.takeOff();
		assertEquals(testEngine.getThrust(), 2050);
	}

	@Test
	public void testTakeOffEngineOnFire(){

		// if engine is on fire
		testEngine.setFire(true);
		testAirplane.takeOff();
		assertFalse(testEngine.isOn());
	}
	
	@Test
	public void testRightTurn() {
		testAirplane.rightTurn();

		// How do we test this without comparing the orientation of testAirplane?
		
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
