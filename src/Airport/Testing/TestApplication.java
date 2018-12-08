package Airport.Testing;

import Airport.Airport.Airport;
import Airport.Airport.AirportRecourcePool;
import org.junit.jupiter.api.*;
import org.junit.jupiter.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestApplication {

    private TestAirplane testAirplane;
    private Airport testAirport;


    @BeforeAll
    public void setup(){
        testAirplane = new TestAirplane(1, "abc", false);
        testAirport = new Airport();
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