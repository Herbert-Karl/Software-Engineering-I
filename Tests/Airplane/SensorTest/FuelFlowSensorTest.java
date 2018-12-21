package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FuelFlowSensorTest {
    private FuelFlowSensor fuelFlowSensor;

    @BeforeEach
    void setup() {
        fuelFlowSensor = new FuelFlowSensor();
    }

    @Test
    void version() {
        assertEquals("FuelFlowSensor", fuelFlowSensor.version());
    }

    @Test
    void measure() {
        assertEquals(fuelFlowSensor.getFuelFlow(), fuelFlowSensor.measure());
    }
}
