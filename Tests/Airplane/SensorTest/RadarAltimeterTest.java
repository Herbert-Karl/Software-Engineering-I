package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RadarAltimeterTest {
    private RadarAltimeter radarAltimeter;

    @BeforeEach
    void setup() {
        radarAltimeter = new RadarAltimeter("RadarAltimeterHersteller", "type01");
    }

    @Test
    void version() {
        assertEquals("RadarAltimeter", radarAltimeter.version());
    }

    @Test
    void on() {
        radarAltimeter.on();
        assertTrue(radarAltimeter.isOn());
    }

    @Test
    void send() {
        on();
        radarAltimeter.send("2500 GHz");
        off();
    }

    @Test
    void receive() {
        on();
        radarAltimeter.send("3000 GHz");
        radarAltimeter.measureAltitude();
        assertEquals(radarAltimeter.getAltitude(), radarAltimeter.receive("3000 GHz"));
        off();
    }

    @Test
    void measureAltitude() {
        assertEquals(radarAltimeter.getAltitude(), radarAltimeter.measureAltitude());
    }

    @Test
    void off() {
        radarAltimeter.off();
        assertFalse(radarAltimeter.isOn());
    }
}
