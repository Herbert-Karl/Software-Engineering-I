package Airport.Testing;

import Airport.Airport.Airport;
import Airport.Airport.AirportRecourcePool;
import Airport.Airport.GateID;
import Airport.Base.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.*;

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
    ArrayList<Baggage> testBaggageList = new ArrayList<>(Arrays.asList(b1, b2, b3));
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

    @BeforeAll
    public void setup(){
        testAirplane = new TestAirplane(1, "abc", false);
        testAirport = new Airport(testPassengerList, testAirportResourcePool, );
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