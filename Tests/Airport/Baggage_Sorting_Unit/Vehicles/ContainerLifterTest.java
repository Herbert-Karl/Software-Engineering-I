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

    @Test
    void setGate() {
        Gate gate = new Gate(GateID.A01, null);
        containerLifter.setGate(gate);
        assertEquals(containerLifter.getGate(), gate);
    }

    @Test
    void connectToAirplane() {
        Airplane airplane = new Airplane(new Configuration(4));
        Gate gate = new Gate(GateID.A01, null);
        gate.setAirplane(airplane);
        containerLifter.connectToAirplane();
        assertEquals(containerLifter.getConnectedAirplane(), airplane);
    }

    @Test
    void up() {
        containerLifter.up();
        assertFalse(containerLifter.isDown());
    }

    @Test
    void transferContainerToCargoSystem() {
    }

    @Test
    void transferContainerToCargoSystem1() {
    }

    @Test
    void down() {
        containerLifter.down();
        assertTrue(containerLifter.isDown());
    }

    @Test
    void disconnectFromAirplane() {
        Airplane airplane = new Airplane(new Configuration(4));
        Gate gate = new Gate(GateID.A01, null);
        gate.setAirplane(airplane);
        containerLifter.connectToAirplane();
        assertEquals(containerLifter.getConnectedAirplane(), airplane);
        containerLifter.disconnectFromAirplane();
        assertNull(containerLifter.getConnectedAirplane());
    }

    @Test
    void notifyGroundOperations() {
    }

    @Test
    void returnToAirportResourcePool() {
    }

    @Test
    void executeRequest() {
    }

    @Test
    void setFlashingLightOn() {
        containerLifter.setFlashingLightOff();
        assertFalse(containerLifter.isFlashingLightOn());
        containerLifter.setFlashingLightOn();
        assertTrue(containerLifter.isFlashingLightOn());
    }

    @Test
    void move() {
        containerLifter.move(50);
        assertEquals(containerLifter.getSpeedInMPH(), 50);
    }

    @Test
    void stop() {
        containerLifter.stop();
        assertEquals(containerLifter.getSpeedInMPH(), 0);
    }

    @Test
    void setGate1() {
    }

    @Test
    void setFlashingLightOff() {
        containerLifter.setFlashingLightOn();
        assertTrue(containerLifter.isFlashingLightOn());
        containerLifter.setFlashingLightOff();
        assertFalse(containerLifter.isFlashingLightOn());
    }
}