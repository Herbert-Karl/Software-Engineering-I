package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PitotTubeTest {
    private PitotTube pitotTube;

    @BeforeEach
    void setup() {
        pitotTube = new PitotTube("PitotTubeHersteller", "type01");
    }

    @Test
    void measureStaticPressure() {
        // kein Vergleichswert
    }

    @Test
    void measureTotalPressure() {
        // kein Vergleichswert
    }

    @Test
    void measureVelocity() {
        assertEquals(pitotTube.getVelocity, pitotTube.measureVelocity());
    }

    @Test
    void clean() {
        pitotTube.clean();
        assertTrue(pitotTube.isCleaned());
    }
}
