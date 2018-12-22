package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShockSensorTest {
    private ShockSensor shockSensor;

    @BeforeEach
    void setup() {
        shockSensor = new ShockSensor("ShockSensorHersteller", "type01");
    }

    @Test
    void version() {
        assertEquals("ShockSensor", shockSensor.version());
    }

    @Test
    void calibrate() {
        shockSensor.calibrate();
        assertTrue(shockSensor.isCalibrated());
    }

    @Test
    void calibrateLevel() {
        shockSensor.calibrate(7.9);
        assertTrue(shockSensor.isCalibrated());
    }

    @Test
    void measure() {
        if (shockSensor.measure() > 300) {
            alarm();
        } else assertFalse(shockSensor.isAlarm());
    }

    @Test
    void alarm() {
        shockSensor.alarm();
        assertTrue(shockSensor.isAlarm());
    }
}
