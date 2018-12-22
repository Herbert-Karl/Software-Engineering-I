package Airport.AirCargoPalletLifter;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Configuration;
import Airport.Airport.Airport;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Base.AirCargoPallet;
import Airport.Scanner.ItemScanner;
import Airport.Scanner.StringSearchAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AirCargoPalletVehicleTest
{
    private AirCargoPalletVehicle airCargoPalletVehicle;
    private AirCargoPalletLifter airCargoPalletLifter;
    private AirCargoPallet airCargoPallet;
    private AirCargoPalletPackingUnit airCargoPalletPackingUnit;

    @BeforeEach
    void setup() {
        Airport airport = Airport.getInstance();
        airport = null;
        airport = Airport.getInstance();
        airport.build();

        airCargoPallet = new AirCargoPallet("uuid", "type", "id");

        airCargoPalletLifter = new AirCargoPalletLifter("uuid", "id", "type", 0, false,
                null, 10, null, new Gate(GateID.A01, null),
                new Airplane(new Configuration(4, 50, 50, 50, 10)));

        airCargoPalletPackingUnit = new AirCargoPalletPackingUnit(new ArrayList<AirCargoPallet>(), null,
                new ItemScanner("id", "type", StringSearchAlgorithm.BITAP), new ArrayList<AirCargoPallet>(), null, null);

        airCargoPalletVehicle = new AirCargoPalletVehicle("uuid", "id", "type", 0, false,
                airCargoPallet, airCargoPalletLifter, new Gate(GateID.A01, null));
    }

    /**
     * Done
     */
    @Test
    void executeRequest()
    {
        AirCargoPallet airCargoPallet = new AirCargoPallet("uuid", "type", "id");
        airCargoPalletVehicle.store(airCargoPallet);
        AirCargoPalletLifter airCargoPalletLifter = new AirCargoPalletLifter("uuid", "id", "type", 0, false,
                null, 0, null, null, null);
        airCargoPalletVehicle.connect(airCargoPalletLifter);

        airCargoPalletVehicle.executeRequest(GateID.A01);
        assertEquals(Airport.getInstance().getGatefromID(GateID.A01), airCargoPalletVehicle.getGate());
        assertEquals(0, airCargoPalletVehicle.getSpeedInMPH());
        assertFalse(airCargoPalletVehicle.isFlashingLightOn());
        assertEquals(airCargoPallet, airCargoPalletLifter.getAirCargoPallet());
        assertNull(airCargoPalletVehicle.getConnectedAirCargoPalletLifter());
        assertEquals(airCargoPalletVehicle, airCargoPalletPackingUnit.getAirCargoPalletVehicel());
    }

    /**
     * Done
     */
    @Test
    void store()
    {
        AirCargoPallet airCargoPallet = new AirCargoPallet("uuid", "type", "id");
        airCargoPalletVehicle.store(airCargoPallet);
        assertEquals(airCargoPallet, airCargoPalletVehicle.getAirCargoPallet());
    }

    /**
     * Done
     */
    @Test
    void setFlashingLightOn()
    {
        airCargoPalletVehicle.setFlashingLightOn();
        assertTrue(airCargoPalletVehicle.isFlashingLightOn());
    }

    /**
     * Done
     */
    @Test
    void move()
    {
        airCargoPalletVehicle.move(10);
        assertEquals(10, airCargoPalletVehicle.getSpeedInMPH());
    }

    /**
     * Done
     */
    @Test
    void stop()
    {
        airCargoPalletVehicle.move(10);
        airCargoPalletVehicle.stop();
        assertEquals(0, airCargoPalletVehicle.getSpeedInMPH());
    }

    /**
     * Done
     */
    @Test
    void setGate()
    {
        airCargoPalletLifter.setGate(GateID.A01);
        assertEquals(Airport.getInstance().getGatefromID(GateID.A01), airCargoPalletLifter.getGate());
    }

    /**
     * Done
     */
    @Test
    void connect()
    {
        airCargoPalletVehicle.setConnectedAirCargoPalletLifter(null);
        airCargoPalletVehicle.connect(airCargoPalletLifter);
        assertEquals(airCargoPalletLifter, airCargoPalletVehicle.getConnectedAirCargoPalletLifter());
    }

    /**
     * Done
     */
    @Test
    void transferPalletToLifter()
    {
        airCargoPalletVehicle.transferPalletToLifter();
        assertNull(airCargoPalletVehicle.getAirCargoPallet());
        assertEquals(airCargoPallet, airCargoPalletLifter.getAirCargoPallet());
    }

    /**
     * Done
     */
    @Test
    void disconnectFromLifter()
    {
        airCargoPalletVehicle.disconnectFromLifter();
        assertNull(airCargoPalletVehicle.getConnectedAirCargoPalletLifter());
    }

    /**
     * Done
     */
    @Test
    void returnToAirCargoPalletPackingUnit()
    {
        airCargoPalletVehicle.returnToAirCargoPalletPackingUnit();
        assertEquals(airCargoPalletVehicle, airCargoPalletPackingUnit.getAirCargoPalletVehicel());
    }

    /**
     * Done
     */
    @Test
    void setFlashingLightOff()
    {
        airCargoPalletVehicle.setFlashingLightOff();
        assertFalse(airCargoPalletVehicle.isFlashingLightOn());
    }

    /**
     * Done
     */
    @Test
    void returnToAirportResourcePool()
    {
        airCargoPalletVehicle.returnToAirportResourcePool();
        assertTrue(Airport.getInstance().getResourcePool().getAirCargoPalletVehicleList().contains(airCargoPalletVehicle));
    }
}