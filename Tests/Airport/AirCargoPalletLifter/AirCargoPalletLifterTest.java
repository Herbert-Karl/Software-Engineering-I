package Airport.AirCargoPalletLifter;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Configuration;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Base.AirCargoPallet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirCargoPalletLifterTest
{
    private AirCargoPalletLifter airCargoPalletLifter;

    @BeforeEach
    void setup() {
        airCargoPalletLifter = new AirCargoPalletLifter("uuid", "id", "type", 0, false,
                new AirCargoPallet("uuid", "type", "id"), 10, null, new Gate(GateID.A01, null),
                new Airplane(new Configuration(4)));
    }

    @Test
    void executeRequest()
    {
        airCargoPalletLifter.executeRequest(GateID.A01);
    }

    @Test
    void move()
    {
        airCargoPalletLifter.move(10);
        assertEquals(10, airCargoPalletLifter.getSpeedInMPH());
    }

    @Test
    void stop()
    {
        airCargoPalletLifter.move(10);
        airCargoPalletLifter.stop();
        assertEquals(0, airCargoPalletLifter.getSpeedInMPH());
    }

    @Test
    void setGate()
    {
        airCargoPalletLifter.setGate(GateID.A01);
    }

    @Test
    void connectToAirplane()
    {
        Airplane airplane = new Airplane(new Configuration(4));
        airCargoPalletLifter.getGate().setAirplane(airplane);
        airCargoPalletLifter.connectToAirplane();

        assertEquals(airplane, airCargoPalletLifter.getConnectToAirplane());
    }

    @Test
    void up()
    {
        airCargoPalletLifter.up();
        assertFalse(airCargoPalletLifter.isDown());
    }

    @Test
    void transferAirCargoPalletToCargoSystem()
    {
    }

    @Test
    void disconnectFromAirplane()
    {
        airCargoPalletLifter.disconnectFromAirplane();
        assertNull(airCargoPalletLifter.getConnectToAirplane());
    }

    @Test
    void setFlashingLightOn()
    {
        airCargoPalletLifter.setFlashingLightOn();
        assertTrue(airCargoPalletLifter.isFlashingLightOn());
    }

    @Test
    void setFlashingLightOff()
    {
        airCargoPalletLifter.setFlashingLightOff();
        assertFalse(airCargoPalletLifter.isFlashingLightOn());
    }

    @Test
    void returnToAirportResourcePool()
    {
    }

    @Test
    void down()
    {
        airCargoPalletLifter.down();
        assertTrue(airCargoPalletLifter.isDown());
    }

    @Test
    void notifyGroundOperations()
    {
    }
}