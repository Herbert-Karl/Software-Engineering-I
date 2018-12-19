package Airport.Airport;

import Airplane.Aircraft.Airplane;
import Airport.ApronControl.Apron;
import Airport.ApronControl.ApronControl;
import Airport.Base.*;
import Airport.Bulky_Baggage_Desk.BulkyBaggageDesk;
import Airport.Bulky_Baggage_Desk.IBulkyBaggageDesk;
import Airport.Checkin_Desk.CheckInMediator;
import Airport.Ground_Operations.GroundOperationsCenter;
import Airport.Ground_Operations.IGroundOperationsCenter;
import Airport.Security_Check.SecurityMediator;
import Airport.Testing.TestAirplane;
import org.junit.jupiter.api.*;
import javax.print.attribute.standard.Destination;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AirportTest {

    private TestAirplane testAirplane;
    private Airport testAirport;

    //
    // parameters for testAirport construction
    //

    // declare passengers and passenger list
    private Passenger p1;
    private Passenger p2;
    private Passenger p3;
    private ArrayList<Passenger> testPassengerList;

    /*Baggage b1 = new Baggage("b1uuid", "Koks, Bomben, Leichenteile", 47.11, BaggageSecurityStatus.clean);
    Baggage b2 = new Baggage("b2uuid", "Weed, Waffen, chemische Kampfstoffe", 12.34, BaggageSecurityStatus.unclean);
    Baggage b3 = new Baggage("b3uuid", "Meth, Badesalz, Sexsklavin", 66.6, BaggageSecurityStatus.dangerous);
    ArrayList<Baggage> testBaggageList = new ArrayList<Baggage>(Arrays.asList(b1, b2, b3));
    ArrayList<BaggageIdentificationType> testBaggageIdentificationTypeList;
    BoardingPass testBoardingPass = new BoardingPass("tBPuuid", Carrier.Emirates, "F666", p1,
            TicketClass.First, Source.MUC, Destination.FRA, "30.02.2019", GateID.A03, "25:61",
            "da vorne links", testBaggageIdentificationTypeList);
    Passport passP1 = new Passport("234", "123", "Foto eines Eisbaeren", p1);
    Passenger p1 = new Passenger("1234", "Lars, der kleine Eisbaer", "Eingeweide",
            "27.11.1456", Gender.Male, passP1, testBaggageList, "First", testBoardingPass,
            PassengerStatus.Arrested);
    ArrayList<Passenger> testPassengerList = new ArrayList<>(Arrays.asList(p1));*/

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

    // for Tower
    /*ArrayList<Airplane> testAirplaneList = new ArrayList<Airplane>(Arrays.asList(testAirplane));
    ArrayList<RunwayCheckPointID> testRunwayCheckPointID = new ArrayList<RunwayCheckPointID>(RunwayCheckPointID.S1);
    WindDirectionSensor testWindDirectionSensor = new WindDirectionSensor();
    Runway testRunway = new Runway(RunwayID.R26L, Position.North, testRunwayCheckPointID, testWindDirectionSensor,
            true, false, testAirplane);
    ArrayList<Runway> testRunwayList = new ArrayList<Runway>(Arrays.asList(testRunway));
    IRunwayManagement testRunwayManagement = new RunwayManagement(testAirplaneList, testRunwayList);
    Tower testTower = new Tower(testAirport, testRunwayManagement, WindDirection.WestToEast);*/

    @BeforeEach
    public void setup(){

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
}