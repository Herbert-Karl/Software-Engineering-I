package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FireDetectorTest {
    private FireDetector fireDetector;

    @BeforeEach
    void setup() {
        fireDetector = new FireDetector("FireDetectorHersteller", "type01");
    }

    @Test
    void scan() {
        String[] air = {"cockpit", "hold", "passenger_compartment"};
        for (String string : air) {
            if (fireDetector.scan(string)) alarm();
            else assertFalse(fireDetector.isAlarm());
        }
    }

    @Test
    void alarm() {
        fireDetector.alarm();
        assertTrue(fireDetector.isAlarm());
    }
}
