package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StallingSensorTest {
    private StallingSensor stallingSensor;

    @BeforeEach
    void setup() {
        stallingSensor = new StallingSensor("StallingSensorHersteller", "type01");
    }

    @Test
    void version() {
        assertEquals("StallingSensor", stallingSensor.version());
    }

    @Test
    void measure() {
        if (stallingSensor.measure("Airflow") > 6) {
            alarm();
        } else assertFalse(stallingSensor.isAlarm());
    }

    @Test
    void alarm() {
        stallingSensor.alarm();
        assertTrue(stallingSensor.isAlarm());
    }
}
