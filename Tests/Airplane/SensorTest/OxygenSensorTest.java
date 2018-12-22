package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OxygenSensorTest {
    private OxygenSensor oxygenSensor;

    @BeforeEach
    void setup() {
        oxygenSensor = new OxygenSensor("OxygenSensorHersteller", "type01");
    }

    @Test
    void version() {
        assertEquals("OxygenSensor", oxygenSensor.version());
    }

    @Test
    void measure() {
        if (oxygenSensor.measure() > 300) {
            alarm();
        } else assertFalse(oxygenSensor.isAlarm());
    }

    @Test
    void alarm() {
        oxygenSensor.alarm();
        assertTrue(oxygenSensor.isAlarm());
    }
}
