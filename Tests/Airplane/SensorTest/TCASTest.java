package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TCASTest {
    private TCAS tcas;

    @BeforeEach
    void setup() {
        tcas = new TCAS("TCASHersteller", "type01");
    }

    @Test
    void on() {
        tcas.on();
        assertTrue(tcas.isOn());
    }

    @Test
    void connect() {
        on();
        tcas.connect("103,2 MHz");
        assertTrue(tcas.isConnected());
        off();
    }

    @Test
    void scan() {
        on();
        tcas.connect("103,2 MHz");
        assertTrue(tcas.isConnected());
        assertTrue(tcas.scan("Air"));
        off();
    }

    @Test
    void alarm() {
        tcas.alarm();
        assertTrue(tcas.isAlarm());
    }

    @Test
    void determineAltitude() {
        on();
        tcas.determineAltitude("Air");
        off();
    }

    @Test
    void setAltitude() {
        on();
        int expected = 7;
        tcas.setAltitude(expected);
        assertEquals(expected, tcas.getAltitude());
        off();
    }

    @Test
    void off() {
        tcas.off();
        assertFalse(tcas.isOn());
    }
}
