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

    /**
     * TODO
     */
    @Test
    void executeRequest()
    {
        airCargoPalletLifter.executeRequest(GateID.A01);
    }

    /**
     * Done
     */
    @Test
    void move()
    {
        airCargoPalletLifter.move(10);
        assertEquals(10, airCargoPalletLifter.getSpeedInMPH());
    }

    /**
     * Done
     */
    @Test
    void stop()
    {
        airCargoPalletLifter.move(10);
        airCargoPalletLifter.stop();
        assertEquals(0, airCargoPalletLifter.getSpeedInMPH());
    }

    /**
     * TODO singleton Airport
     */
    @Test
    void setGate()
    {
        airCargoPalletLifter.setGate(GateID.A01);
    }

    /**
     * Done
     */
    @Test
    void connectToAirplane()
    {
        Airplane airplane = new Airplane(new Configuration(4));
        airCargoPalletLifter.getGate().setAirplane(airplane);
        airCargoPalletLifter.connectToAirplane();

        assertEquals(airplane, airCargoPalletLifter.getConnectToAirplane());
    }

    /**
     * Done
     */
    @Test
    void up()
    {
        airCargoPalletLifter.up();
        assertFalse(airCargoPalletLifter.isDown());
    }

    /**
     * TODO
     */
    @Test
    void transferAirCargoPalletToCargoSystem()
    {
    }

    /**
     * Done
     */
    @Test
    void disconnectFromAirplane()
    {
        airCargoPalletLifter.disconnectFromAirplane();
        assertNull(airCargoPalletLifter.getConnectToAirplane());
    }

    /**
     * Done
     */
    @Test
    void setFlashingLightOn()
    {
        airCargoPalletLifter.setFlashingLightOn();
        assertTrue(airCargoPalletLifter.isFlashingLightOn());
    }

    /**
     * Done
     */
    @Test
    void setFlashingLightOff()
    {
        airCargoPalletLifter.setFlashingLightOff();
        assertFalse(airCargoPalletLifter.isFlashingLightOn());
    }

    /**
     * TODO
     */
    @Test
    void returnToAirportResourcePool()
    {
    }

    /**
     * Done
     */
    @Test
    void down()
    {
        airCargoPalletLifter.down();
        assertTrue(airCargoPalletLifter.isDown());
    }

    /**
     * TODO
     */
    @Test
    void notifyGroundOperations()
    {
    }
}