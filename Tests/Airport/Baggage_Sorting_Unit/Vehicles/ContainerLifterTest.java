package Airport.Baggage_Sorting_Unit.Vehicles;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Configuration;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Base.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerLifterTest {
    private ContainerLifter containerLifter;

    @BeforeEach
    void createContainerLifter() {
        containerLifter = new ContainerLifter("uuid", "id", "type");
    }

    /**
     * Done
     */
    @Test
    void setGate() {
        Gate gate = new Gate(GateID.A01, null);
        containerLifter.setGate(gate);
        assertEquals(containerLifter.getGate(), gate);
    }

    /**
     * Done
     */
    @Test
    void connectToAirplane() {
        Airplane airplane = new Airplane(new Configuration(4, 50, 50, 50, 10));
        Gate gate = new Gate(GateID.A01, null);
        gate.setAirplane(airplane);
        containerLifter.connectToAirplane();
        assertEquals(containerLifter.getConnectedAirplane(), airplane);
    }

    /**
     * Done
     */
    @Test
    void up() {
        containerLifter.up();
        assertFalse(containerLifter.isDown());
    }

    /**
     * TODO
     */
    @Test
    void transferContainerToCargoSystem() {
    }

    /**
     * TODO
     */
    @Test
    void transferContainerToCargoSystem1() {
    }

    /**
     * Done
     */
    @Test
    void down() {
        containerLifter.down();
        assertTrue(containerLifter.isDown());
    }

    /**
     * Done
     */
    @Test
    void disconnectFromAirplane() {
        Airplane airplane = new Airplane(new Configuration(4, 50, 50, 50, 10));
        Gate gate = new Gate(GateID.A01, null);
        gate.setAirplane(airplane);
        containerLifter.connectToAirplane();
        assertEquals(containerLifter.getConnectedAirplane(), airplane);

        containerLifter.disconnectFromAirplane();
        assertNull(containerLifter.getConnectedAirplane());
    }

    /**
     * TODO
     */
    @Test
    void notifyGroundOperations() {
    }

    /**
     * TODO
     */
    @Test
    void returnToAirportResourcePool() {
    }

    /**
     * TODO
     */
    @Test
    void executeRequest() {
    }

    /**
     * Done
     */
    @Test
    void setFlashingLightOn() {
        containerLifter.setFlashingLightOff();
        assertFalse(containerLifter.isFlashingLightOn());
        containerLifter.setFlashingLightOn();
        assertTrue(containerLifter.isFlashingLightOn());
    }

    /**
     * Done
     */
    @Test
    void move() {
        containerLifter.move(50);
        assertEquals(containerLifter.getSpeedInMPH(), 50);
    }

    /**
     * Done
     */
    @Test
    void stop() {
        containerLifter.stop();
        assertEquals(containerLifter.getSpeedInMPH(), 0);
    }

    /**
     * Done
     */
    @Test
    void setFlashingLightOff() {
        containerLifter.setFlashingLightOn();
        assertTrue(containerLifter.isFlashingLightOn());
        containerLifter.setFlashingLightOff();
        assertFalse(containerLifter.isFlashingLightOn());
    }
}