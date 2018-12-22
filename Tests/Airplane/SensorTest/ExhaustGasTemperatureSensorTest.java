package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExhaustGasTemperatureSensorTest {
    private ExhaustGasTemperatureSensor exhaustGasTemperatureSensor;

    @BeforeEach
    void setup() {
        exhaustGasTemperatureSensor = new ExhaustGasTemperatureSensor("ExhaustGasTemperatureSensorHersteller", "type01");
    }

    @Test
    void version() {
        assertEquals("ExhaustGasTemperatureSensor", exhaustGasTemperatureSensor.version());
    }

    @Test
    void measure() {
//        assertEquals(exhaustGasTemperatureSensor.getTemperature(), exhaustGasTemperatureSensor.measure());
    }

    @Test
    void alarmMajor() {
        int threshold = 4;
        exhaustGasTemperatureSensor.measure();
        if (exhaustGasTemperatureSensor.getTemperature() >= threshold) {
            exhaustGasTemperatureSensor.alarmMajor(threshold);
            assertTrue(exhaustGasTemperatureSensor.isAlarmMajor());
        }
        assertFalse(exhaustGasTemperatureSensor.isAlarmMajor());
    }

    @Test
    void alarmCritical() {
        int threshold = 4;
        exhaustGasTemperatureSensor.measure();
        if (exhaustGasTemperatureSensor.getTemperature() >= threshold) {
            exhaustGasTemperatureSensor.alarmCritical(threshold);
            assertTrue(exhaustGasTemperatureSensor.isAlarmCritical());
        }
        assertFalse(exhaustGasTemperatureSensor.isAlarmCritical());
    }
}
