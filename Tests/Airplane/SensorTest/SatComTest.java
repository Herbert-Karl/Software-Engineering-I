package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SatComTest {
    private SatCom satCom;

    @BeforeEach
    void setUp() {
        satCom = new SatCom();
    }

    @Test
    void version() {
        assertEquals("SatCom",satCom.version());
    }

    @Test
    void on() {
        satCom.on();
        assertTrue(satCom.isOn());
    }

    @Test
    void connect() {
        on();
        satCom.connect("", "");
        assertTrue(satCom.isConnected());
        off();
    }

    @Test
    void send() {
        on();
        satCom.connect("", "");
        assertTrue(satCom.isConnected());
        satCom.send("");
        off();
    }

    @Test
    void receive() {
        on();
        satCom.connect("", "");
        assertTrue(satCom.isConnected());
        satCom.send("");
        assertTrue(!satCom.receive().isEmpty());
        off();
    }

    @Test
    void off() {
        satCom.off();
        assertFalse(satCom.isOn());
    }
}
