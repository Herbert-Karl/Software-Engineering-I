package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemperatureSensorTest {
    private TemperatureSensor temperatureSensor;

    @BeforeEach
    void setup() {
        temperatureSensor = new TemperatureSensor();
    }

    @Test
    void version() {
        assertEquals("TemperatureSensor", temperatureSensor.version());
    }

    @Test
    void measure() {
        assertEquals(temperatureSensor.getTemperature(), temperatureSensor.measure());
    }

    @Test
    void alarm() {
        int threshold = 700;
        if (temperatureSensor.getTemperature() >= threshold) {
            assertTrue(temperatureSensor.isAlarm);
            temperatureSensor.alarm(threshold);
        }
    }
}
