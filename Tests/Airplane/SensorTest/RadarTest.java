package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RadarTest {
    private Radar radar;

    @BeforeEach
    void setRadar() {
        radar = new Radar();
    }

    @Test
    void version() {
        assertEquals("Radar", radar.version());
    }

    @Test
    void on() {
        radar.on();
        assertTrue(radar.isOn());
    }

    @Test
    void scan() {
        on();
        assertTrue(radar.scan("Air"));
        off();
    }

    @Test
    void off() {
        radar.off();
        assertFalse(radar.isOn());
    }
}
