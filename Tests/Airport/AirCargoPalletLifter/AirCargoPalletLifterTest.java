package Airport.AirCargoPalletLifter;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Configuration;
import Airplane.stowage_cargo.CargoSystem;
import Airplane.stowage_cargo.RearStowagePositionID;
import Airport.Airport.Airport;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Baggage_Sorting_Unit.Receipts.ContainerLifterReceipt;
import Airport.Base.AirCargoPallet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AirCargoPalletLifterTest
{
    private AirCargoPalletLifter airCargoPalletLifter;
    private Airplane airplane;
    private AirCargoPallet airCargoPallet;

    @BeforeEach
    void setup() {
        Airport airport = Airport.getInstance();
        airport = null;
        airport = Airport.getInstance();
        airport.init(airport);

        airCargoPallet = new AirCargoPallet("uuid", "type", "id");
        airplane = new Airplane(new Configuration(4, 50, 50, 50, 10));
        airCargoPalletLifter = new AirCargoPalletLifter("uuid", "id", "type", 0, false,
                new AirCargoPallet("uuid", "type", "id"), 10, null, new Gate(GateID.A01, null), airplane);
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
    void connectToAirplane()
    {
        Airplane airplane = new Airplane(new Configuration(4, 50, 50, 50, 10));
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
     * Done
     */
    @Test
    void transferAirCargoPalletToCargoSystem()
    {
        CargoSystem cargoSystem = airplane.getBody().getCargoSystemArrayList().get(0);
        cargoSystem.load(new AirCargoPallet("uuid", "type", "id"), RearStowagePositionID.SR01);

        airCargoPalletLifter.transferAirCargoPalletToCargoSystem();
        assertEquals(airCargoPallet, cargoSystem.unloadAirCargoPallet());
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
     * Done
     */
    @Test
    void returnToAirportResourcePool()
    {
        airCargoPalletLifter.returnToAirportResourcePool();
        assertTrue(Airport.getInstance().getResourcePool().getAirCargoPalletLifterList().contains(airCargoPalletLifter));
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
     * Done
     */
    @Test
    void notifyGroundOperations()
    {
        AirCargoPalletLifterReceipt airCargoPalletLifterReceipt = new AirCargoPalletLifterReceipt("uuid", "id", GateID.A01, 10, new ArrayList<String>());
        airCargoPalletLifter.notifyGroundOperations(airCargoPalletLifterReceipt);
        assertTrue(Airport.getInstance().getGroundOperationsCenter().getAirCargoPalletLifterReceiptList().contains(airCargoPalletLifterReceipt));
    }
}