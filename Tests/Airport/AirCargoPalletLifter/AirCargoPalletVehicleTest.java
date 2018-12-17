package Airport.AirCargoPalletLifter;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Configuration;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Base.AirCargoPallet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirCargoPalletVehicleTest
{
    private AirCargoPalletVehicle airCargoPalletVehicle;
    private AirCargoPalletLifter airCargoPalletLifter;

    @BeforeEach
    void setup() {
        airCargoPalletLifter = new AirCargoPalletLifter("uuid", "id", "type", 0, false,
                new AirCargoPallet("uuid", "type", "id"), 10, null, new Gate(GateID.A01, null),
                new Airplane(new Configuration(4)));

        airCargoPalletVehicle = new AirCargoPalletVehicle("uuid", "id", "type", 0, false,
                new AirCargoPallet("uuid", "type", "id"), airCargoPalletLifter, new Gate(GateID.A01, null));
    }

    @Test
    void executeRequest()
    {
    }

    @Test
    void store()
    {
        AirCargoPallet airCargoPallet = new AirCargoPallet("uuid", "type", "id");
        airCargoPalletVehicle.store(airCargoPallet);
        assertEquals(airCargoPallet, airCargoPalletVehicle.getAirCargoPallet());
    }

    @Test
    void setFlashingLightOn()
    {
        airCargoPalletVehicle.setFlashingLightOn();
        assertTrue(airCargoPalletVehicle.isFlashingLightOn());
    }

    @Test
    void move()
    {
        airCargoPalletVehicle.move(10);
        assertEquals(10, airCargoPalletVehicle.getSpeedInMPH());
    }

    @Test
    void stop()
    {
        airCargoPalletVehicle.move(10);
        airCargoPalletVehicle.stop();
        assertEquals(0, airCargoPalletVehicle.getSpeedInMPH());
    }

    @Test
    void setGate()
    {
        airCargoPalletVehicle.setGate(GateID.A01);
    }

    @Test
    void connect()
    {
        airCargoPalletVehicle.setConnectedAirCargoPalletLifter(null);
        airCargoPalletVehicle.connect(airCargoPalletLifter);
        assertEquals(airCargoPalletLifter, airCargoPalletVehicle.getConnectedAirCargoPalletLifter());
    }

    @Test
    void transferPalletToLifter()
    {
    }

    @Test
    void disconnectFromLifter()
    {
        airCargoPalletVehicle.disconnectFromLifter();
        assertNull(airCargoPalletVehicle.getConnectedAirCargoPalletLifter());
    }

    @Test
    void returnToAirCargoPalletPackingUnit()
    {
    }

    @Test
    void setFlashingLightOff()
    {
        airCargoPalletVehicle.setFlashingLightOff();
        assertFalse(airCargoPalletVehicle.isFlashingLightOn());
    }

    @Test
    void returnToAirportResourcePool()
    {
    }
}