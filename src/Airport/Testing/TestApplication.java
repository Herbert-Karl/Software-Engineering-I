package Airport.Testing;

import Airplane.Airplane;
import Airport.Airport.*;
import Airport.Base.*;
import Airport.Security_Check.SecurityMediator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.*;
import javax.print.attribute.standard.Destination;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestApplication {

    private TestAirplane testAirplane;
    private Airport testAirport;

    //
    // parameters for testAirport construction
    //

    // for passenger list
    Baggage b1 = new Baggage("b1uuid", "Koks, Bomben, Leichenteile", 47.11, BaggageSecurityStatus.Normal);
    Baggage b2 = new Baggage("b2uuid", "Weed, Waffen, chemische Kampfstoffe", 12.34, BaggageSecurityStatus.Normal);
    Baggage b3 = new Baggage("b3uuid", "Meth, Badesalz, Sexsklavin", 69.88, BaggageSecurityStatus.Normal);
    ArrayList<Baggage> testBaggageList = new ArrayList<Baggage>(Arrays.asList(b1, b2, b3));
    ArrayList<BaggageIdentificationType> testBaggageIdentificationTypeList;
    BoardingPass testBoardingPass = new BoardingPass("tBPuuid", Carrier.Emirates, "F666", p1,
            TicketClass.First, Source.MUC, Destination.FRA, "30.02.2019", GateID.A03, "25:61",
            "da vorne links", testBaggageIdentificationTypeList);
    Passport passP1 = new Passport("234", "123", "Foto eines Eisbaeren", p1);
    Passenger p1 = new Passenger("1234", "Lars, der kleine Eisbaer", "Eingeweide",
            "27.11.1456", Gender.Male, passP1, testBaggageList, "First", testBoardingPass,
            PassengerStatus.Arrested);
    ArrayList<Passenger> testPassengerList = new ArrayList<>(Arrays.asList(p1));

    // for resource pool
    AirportRecourcePool testAirportResourcePool = new AirportRecourcePool();

    // for gate list
    Flight testFlight = new Flight("17", Carrier.Emirates, Destination.KEF, GateID.A01);
    Gate testGate = new Gate(GateID.A01, testFlight);
    ArrayList<Gate> testGateList = new ArrayList<Gate>(Arrays.asList(testGate));

    // for apron
    ArrayList<TaxiCheckPoint> testTaxiCheckPointList = new ArrayList<TaxiCheckPoint>(Arrays.asList(TaxiCheckPoint.M4));
    TaxiWay testTaxiWay = new TaxiWay(TaxiCenterLine.blue, GateID.A02, RunwayID.R26L, testTaxiCheckPointList, RunwayCheckPointID.S1);
    ArrayList<TaxiWay> testTaxiWayList = new ArrayList<TaxiWay>();
    ApronControl testApronControl = new ApronControl(testAirport, testApron, testTaxiWayList);
    Apron testApron = new Apron(testAirport, testApronControl);

    // for igroundoperationscenter
    IGroundOperationsCenter testIGroundOperationscenter = new IGroundOperationsCenter();

    // for Check-In-Mediator
    CheckInMediator testCheckInMediator = new CheckInMediator();

    // for ibulkybaggagedesk
    IBulkyBaggageDesk testIBulkyBaggageDesk = new IBulkyBaggageDesk();

    // for Security Mediator
    SecurityMediator testSecurityMediator = new SecurityMediator();

    // for Tower
    ArrayList<Airplane> testAirplaneList = new ArrayList<Airplane>(Arrays.asList(testAirplane));
    ArrayList<RunwayCheckPointID> testRunwayCheckPointID = new ArrayList<RunwayCheckPointID>(RunwayCheckPointID.S1);
    WindDirectionSensor testWindDirectionSensor = new WindDirectionSensor();
    Runway testRunway = new Runway(RunwayID.R26L, Position.North, testRunwayCheckPointID, testWindDirectionSensor,
            true, false, testAirplane);
    ArrayList<Runway> testRunwayList = new ArrayList<Runway>(Arrays.asList(testRunway));
    IRunwayManagement testRunwayManagement = new RunwayManagement(testAirplaneList, testRunwayList);
    Tower testTower = new Tower(testAirport, testRunwayManagement, WindDirection.WestToEast);

    @BeforeAll
    public void setup(){
        testAirplane = new TestAirplane(1, "abc", false);
        testAirport = new Airport(testPassengerList, testAirportResourcePool, testGateList, testApron,
                testIGroundOperationscenter, testCheckInMediator, testIBulkyBaggageDesk, testSecurityMediator,
                testApronControl, testTower);
    }

    @Test
    public void testAirportAttributes(){

        //assertEquals(testAirplane.id, 3);
        assertEquals(testAirport.getPassengerList(), testPassengerList);
        assertEquals(testAirport.getResourcePool(), testResourcePool);
        assertEquals(testAirport.getGateList(), testGateList);
        assertEquals(testAirport.getApron(), testApron);
        assertEquals(testAirport.getGroundOperationsCenter(), testGroundOperationsCenter);
        assertEquals(testAirport.getCheckInMediator(), testCheckInMediator);
        assertEquals(testAirport.getBulkyBaggageDesk(), testBulkyBaggageDesk);
        assertEquals(testAirport.getSecurityMediator(), testSecurityMediator);
        assertEquals(testAirport.getApronControl(), testApronControl);
        assertEquals(testAirport.getTower(), testTower);

    }
}