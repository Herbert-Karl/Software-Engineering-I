package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TurbulentAirFlowSensorTest {
    private TurbulentAirFlowSensor turbulentAirFlowSensor;

    @BeforeEach
    void setup() {
        turbulentAirFlowSensor = new TurbulentAirFlowSensor("TurbulentAirFlowSensorHersteller", "type01");
    }

    @Test
    void version(){
        assertEquals("TurbulentAirFlowSensor",turbulentAirFlowSensor.version());
    }

    @Test
    void measure(){
        if (turbulentAirFlowSensor.measure() > 50) {
            alarm();
        } else assertFalse(turbulentAirFlowSensor.isAlarm());
    }

    @Test
    void alarm(){
        turbulentAirFlowSensor.alarm();
        assertTrue(turbulentAirFlowSensor.isAlarm());
    }
}
