package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FuelSensorTest {
    private FuelSensor fuelSensor;

    @BeforeEach
    void setup() {
        fuelSensor = new FuelSensor("FuelSensorHersteller", "type01");
    }

    @Test
    void version() {
        assertEquals("FuelSensor", fuelSensor.version());
    }

    @Test
    void measure() {
        // keine Möglichkeit zu testen
    }

    @Test
    void alarmReserve() {
        assertTrue(fuelSensor.isAlarmReserve());
    }

    @Test
    void alarmMajor() {
        assertTrue(fuelSensor.isAlarmMajor());
    }

    @Test
    void alarmCritical() {
        assertTrue(fuelSensor.isAlarmCritical());

    }
}
