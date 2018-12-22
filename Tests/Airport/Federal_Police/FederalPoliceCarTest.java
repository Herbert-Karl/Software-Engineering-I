package Airport.Federal_Police;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FederalPoliceCarTest {
    private FederalPoliceCar federalPoliceCar;

    @BeforeEach
    void setUp() {
        federalPoliceCar = new FederalPoliceCar();
    }

    @Test
    void forward() {
        federalPoliceCar.forward(20);
        assertEquals(20,federalPoliceCar.getSpeedInMPH());
    }

    @Test
    void backward() {
        federalPoliceCar.backward(20);
        assertEquals(20,federalPoliceCar.getSpeedInMPH());
    }

    @Test
    void stop() {
        federalPoliceCar.stop();
        assertEquals(0,federalPoliceCar.getSpeedInMPH());
    }

    @Test
    void setFlashLightOn() {
        federalPoliceCar.setFlashLightOn();
        assertTrue(federalPoliceCar.isFlashingLightOn());
    }

    @Test
    void setFlashLightOff() {
        federalPoliceCar.setFlashLightOff();
        assertFalse(federalPoliceCar.isFlashingLightOn());
    }
}