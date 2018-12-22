package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GPSTest {
    private GPS gps;

    @BeforeEach
    void setup() {
        gps = new GPS();
    }

    @Test
    void version() {
        assertEquals("GPS", gps.version());
    }

    @Test
    void on() {
        gps.on();
        assertTrue(gps.isOn());
    }

    @Test
    void connect() {
        on();
        gps.connect(" ");
        assertTrue(gps.isConnected());
        off();
    }

    @Test
    void send() {
        on();
        gps.connect(" ");
        assertTrue(gps.isConnected());
        gps.send(" ");
        off();
    }

    @Test
    void receive() {
        on();
//        connect();
        gps.connect(" ");
        assertTrue(gps.isConnected());
        gps.send(" ");
        gps.receive();
        assertTrue(!gps.receive().isEmpty());
        off();

    }

    @Test
    void off() {
        gps.off();
        assertFalse(gps.isOn());
    }
}
