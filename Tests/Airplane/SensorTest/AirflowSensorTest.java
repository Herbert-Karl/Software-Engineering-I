package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AirflowSensorTest {
    private AirflowSensor airflowSensor;

    @BeforeEach
    void setup() {
        airflowSensor = new AirflowSensor();
    }

    @Test
    void version() {
        assertEquals("AirflowSensor", airflowSensor.version());
    }

    @Test
    void measure() {
        assertEquals(airflowSensor.getAirPressure(), airflowSensor.measure("airFlow"));
    }

    @Test
    void alarm() {
        int threshold = 4;
        if (airflowSensor.getAirPressure() >= threshold) {
            airflowSensor.alarm(threshold);
            assertTrue(airflowSensor.isAlarm());
        }
        assertFalse(airflowSensor.isAlarm());
    }
}
