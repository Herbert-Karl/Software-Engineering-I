package Airport.Airport;

import Airplane.Aircraft.Airplane;
import Airplane.Tanks.FuelTank;
import Airport.ApronControl.Apron;
import Airport.ApronControl.ApronControl;
import Airport.Baggage_Sorting_Unit.BaggageSortingUnit;
import Airport.Base.*;
import Airport.Bulky_Baggage_Desk.BulkyBaggageDesk;
import Airport.Bulky_Baggage_Desk.IBulkyBaggageDesk;
import Airport.Checkin_Desk.CheckInMediator;
import Airport.Federal_Police.FederalPolice;
import Airport.Ground_Operations.GroundOperationsCenter;
import Airport.Ground_Operations.IGroundOperationsCenter;
import Airport.Scanner.BaggageScanner;
import Airport.Security_Check.SecurityMediator;
import org.junit.jupiter.api.*;
import javax.print.attribute.standard.Destination;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {

    // airplanes and airport for testing
    private Airplane testAirplaneA;
    private Airplane testAirplaneB;
    private Airport testAirport;

    //
    // parameters for testAirport construction
    //

    // declare passengers and passenger list
    private Passenger p1;
    private Passenger p2;
    private Passenger p3;
    private ArrayList<Passenger> testPassengerList;

    // declare resource pool
    private AirportResourcePool testAirportResourcePool;

    // declare gates and gate list
    private Gate g1;
    private Gate g2;
    private Gate g3;
    private ArrayList<Gate> testGateList;

    // declare apron
    private Apron testApron;

    // declare ground operations centre
    private GroundOperationsCenter testGroundOperationsCentre;

    // declare check-in-mediator
    private CheckInMediator testCheckInMediator;

    // declare bulky baggage desk
    private BulkyBaggageDesk testBulkyBaggageDesk;

    // declare security mediator
    private SecurityMediator testSecurityMediator;

    // declare apron control
    private ApronControl testApronControl;

    // declare tower
    private Tower testTower;

    @BeforeEach
    public void setup(){

        // re-init airplanes
        testAirplaneA = new Airplane();
        testAirplaneB = new Airplane();

        // re-init passenger list
        p1 = new Passenger();
        p2 = new Passenger();
        p3 = new Passenger();
        testPassengerList = new ArrayList<Passenger>(Arrays.asList(p1, p2, p3));

        // re-init resource pool
        testAirportResourcePool = new AirportResourcePool();

        // re-init gate list
        g1 = new Gate();
        g2 = new Gate();
        g3 = new Gate();
        testGateList = new ArrayList<Gate>(Arrays.asList(g1, g2, g3));

        // re-init apron
        testApron = new Apron();

        // re-init ground operations centre
        testGroundOperationsCentre = new GroundOperationsCenter();

        // re-init check-in-mediator
        testCheckInMediator = new CheckInMediator();

        // re-init bulky baggage desk
        testBulkyBaggageDesk = new BulkyBaggageDesk();

        // re-init security mediator
        testSecurityMediator = new SecurityMediator();

        // re-init apron control
        testApronControl = new ApronControl();

        // re-init tower
        testTower = new Tower();

        // RE-INIT AIRPORT
        testAirport = new Airport(
                testPassengerList,
                testAirportResourcePool,
                testGateList,
                testApron,
                testGroundOperationsCentre,
                testCheckInMediator,
                testBulkyBaggageDesk,
                testSecurityMediator,
                testApronControl,
                testTower
        );
    }

    @Test
    public void testAirportAttributes(){

        assertEquals(testAirport.getPassengerList(), testPassengerList);
        assertEquals(testAirport.getResourcePool(), testAirportResourcePool);
        assertEquals(testAirport.getGateList(), testGateList);
        assertEquals(testAirport.getApron(), testApron);
        assertEquals(testAirport.getGroundOperationsCenter(), testGroundOperationsCentre);
        assertEquals(testAirport.getCheckInMediator(), testCheckInMediator);
        assertEquals(testAirport.getBulkyBaggageDesk(), testBulkyBaggageDesk);
        assertEquals(testAirport.getSecurityMediator(), testSecurityMediator);
        assertEquals(testAirport.getApronControl(), testApronControl);
        assertEquals(testAirport.getTower(), testTower);
    }

    @Test
    public void testAirportInit(){

        testAirport.init(testAirport);

        PassengerBaggageDatabase testPassengerBaggageDatabase = new PassengerBaggageDatabase();
        assertEquals(testAirport.getPassengerList(), testPassengerBaggageDatabase);

        AirportResourcePool referenceResourcePool = new AirportResourcePool(50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, testAirport);
        assertEquals(testAirport.getResourcePool(), referenceResourcePool);

        ArrayList<Gate> referenceGateList = new ArrayList<Gate>(10);
        referenceGateList.add(new Gate(GateID.A01, null));
        referenceGateList.add(new Gate(GateID.A02, null));
        referenceGateList.add(new Gate(GateID.A03, null));
        referenceGateList.add(new Gate(GateID.A04, null));
        referenceGateList.add(new Gate(GateID.A05, null));
        referenceGateList.add(new Gate(GateID.B01, null));
        referenceGateList.add(new Gate(GateID.B02, null));
        referenceGateList.add(new Gate(GateID.B03, null));
        referenceGateList.add(new Gate(GateID.B04, null));
        referenceGateList.add(new Gate(GateID.B05, null));
        assertEquals(testAirport.getGateList(), referenceGateList);

        // APRON?

        // ground operations centre
        GroundOperationsCenter referenceGroundOperationsCentre = new GroundOperationsCenter(testAirport, 100);
        assertEquals(testAirport.getGroundOperationsCenter(), referenceGroundOperationsCentre);

        // bulky baggage desk
        BulkyBaggageDesk referenceBulkyBaggageDesk = new BulkyBaggageDesk(testAirport);
        assertEquals(testAirport.getBulkyBaggageDesk(), referenceBulkyBaggageDesk);

        // check-in mediator
        CheckInMediator referenceCheckInMediator = new CheckInMediator(testBulkyBaggageDesk);
        assertEquals(testAirport.getCheckInMediator(), referenceCheckInMediator);

        // federal police
        FederalPolice police = new FederalPolice();
        SecurityMediator referenceSecurityMediator = new SecurityMediator(testAirport, police);
        assertEquals(testAirport.getSecurityMediator(), referenceSecurityMediator);

        // tower
        WindDirectionSensor windDirectionSensor = new WindDirectionSensor();
        WindDirection windDirection = windDirectionSensor.measure();
        Tower referenceTower = new Tower(testAirport, null, windDirection);
        assertEquals(testAirport.getTower(), referenceTower);

        // runway list
        ArrayList<RunwayCheckPointID> runwayCheckpointIDR1 = new ArrayList<RunwayCheckPointID>();
        runwayCheckpointIDR1.add(RunwayCheckPointID.S1);
        runwayCheckpointIDR1.add(RunwayCheckPointID.S2);
        ArrayList<RunwayCheckPointID> runwayCheckpointIDR2 = new ArrayList<RunwayCheckPointID>();
        runwayCheckpointIDR2.add(RunwayCheckPointID.S3);
        runwayCheckpointIDR2.add(RunwayCheckPointID.S4);

        ArrayList<Runway> testRunwayListWtE = new ArrayList<Runway>();
        ArrayList<Runway> testRunwayListEtW = new ArrayList<Runway>();
        testRunwayListWtE.add(new Runway(RunwayID.R08L, Position.North, runwayCheckpointIDR1, windDirectionSensor, false, false, null));
        testRunwayListWtE.add(new Runway(RunwayID.R08R, Position.North, runwayCheckpointIDR2, windDirectionSensor, false, false, null));
        testRunwayListEtW.add(new Runway(RunwayID.R26R, Position.North, runwayCheckpointIDR1, windDirectionSensor, false, false, null));
        testRunwayListEtW.add(new Runway(RunwayID.R26L, Position.North, runwayCheckpointIDR2, windDirectionSensor, false, false, null));
        ArrayList<Runway> testRunwayListActual = (windDirection == WindDirection.WestToEast) ? testRunwayListWtE : testRunwayListEtW;
        assertEquals(testAirport.getRunwayList(), testRunwayListActual);

        // runway management and tower
        IRunwayManagement runwayManagement = new RunwayManagement(null, testRunwayListActual, referenceTower);
        referenceTower.setRunwayManagement(runwayManagement);
        assertEquals(testAirport.getTower(), referenceTower);

        // taxi ways

        // fuel tank
        AirportFuelTank referenceFuelTank = new AirportFuelTank();
        assertEquals(testAirport.getFuelTank(), referenceFuelTank);

        // baggage sorting unit
        BaggageScanner baggageScanner = new BaggageScanner(null, null);
        BaggageSortingUnit referenceBaggageSortingUnit = new BaggageSortingUnit(testAirportResourcePool.takeResource("Employee"), baggageScanner, null, customs);
        assertEquals(testAirport.getBaggageSortingUnit(), referenceBaggageSortingUnit);
    }

    @Test
    public void testLoadPassengerBaggageData(){

        // TO DO
    }

    @Test
    public void testConnectAirplane(){

        assertTrue(testAirport.connectAirplane(testAirplaneA, g1));
        assertEquals(g1.getAirplane(), testAirplaneA);

        assertFalse(testAirport.connectAirplane(testAirplaneB, g1));
    }

    @Test
    public void testDisconnectAirplane(){

        testAirport.connectAirplane(testAirplaneA, g1);
        testAirport.connectAirplane(testAirplaneB, g2);

        // disconnect from wrong gate or wrong airplane
        assertFalse(testAirport.disconnectAirplane(testAirplaneA, g2));

        // disconnect correctly
        assertTrue(testAirport.disconnectAirplane(testAirplaneA, g1));

        // disconnect disconnected airplane from empty gate
        assertFalse(testAirport.disconnectAirplane(testAirplaneA, g1));

        // disconnect wrong connected airplane from empty gate
        assertFalse(testAirport.disconnectAirplane(testAirplaneB, g1));

        // disconnect disconnected airplane from wrong connected gate
        assertFalse(testAirport.disconnectAirplane(testAirplaneA, g2));

        assertNull(g1.getAirplane());
        assertEquals(g2.getAirplane(), testAirplaneB);
    }

    @Test
    public void testExecuteServiceWasteWater(){

        g1.setGateID(GateID.A01);
        assertTrue(testAirport.executeServiceWasteWater(g1));
    }

    @Test
    public void testExecuteCheckIn(){

        Flight testFlight = new Flight();
        assertTrue(testAirport.executeCheckIn(testFlight));
        assertEquals(testCheckInMediator.getFlight(), testFlight); // or something similar, waiting for implementation TO DO
    }

    @Test
    public void testExecuteSecurity(){

        assertTrue(testAirport.executeSecurity());
    }

    @Test
    public void testExecuteCustoms(){

        assertTrue(testAirport.executeCustoms());

    }

    @Test
    public void testExecuteAirCargo(){

        g1.setGateID(GateID.A01);
        assertTrue(testAirport.executeAirCargo(g1.getGateID()));

    }

    @Test
    public void testExecuteBaggageSortingUnit(){

        g1.setGateID(GateID.A01);
        assertTrue(testAirport.executeBaggageSortingUnit(g1.getGateID()));

    }

    @Test
    public void testExecuteServiceBase(){

        g1.setGateID(GateID.A01);
        assertTrue(testAirport.executeServiceBase(g1.getGateID()));

    }

    @Test
    public void testExecuteServiceFreshWater(){

        g1.setGateID(GateID.A01);
        assertTrue(testAirport.executeServiceFreshWater(g1.getGateID()));

    }

    @Test
    public void testExecuteServiceNitrogenOxygen(){

        g1.setGateID(GateID.A01);
        assertTrue(testAirport.executeServiceNitrogenOxygen(g1.getGateID()));

    }

    @Test
    public void testExecuteSkyTanking(){

        g1.setGateID(GateID.A01);
        assertTrue(testAirport.executeSkyTanking(g1.getGateID()));

    }

    @Test
    public void testExecuteBoardingControl(){

        g1.setGateID(GateID.A01);
        assertTrue(testAirport.executeBoardingControl(g1));

    }

    @Test
    public void testExecutePushback(){

        g1.setGateID(GateID.A01);
        assertTrue(testAirport.executePushback(g1));

    }

    @Test
    public void testExecuteGroundOperationsLogging(){

        assertTrue(testAirport.executeGroundOperationsLogging());

    }

    @Test
    public void testExecuteBulkyBaggage(){

        assertTrue(testAirport.executeBulkyBaggage());

    }

    @Test
    public void testExecutePassportControl(){

        assertTrue(testAirport.executePassportControl);

    }
}