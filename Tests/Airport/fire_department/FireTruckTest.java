package Airport.fire_department;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FireTruckTest {

    private FireTruck fireTruck = new FireTruck();

    @Test
    void move() {
        assertEquals(33, fireTruck.move(33));
    }

    @Test
    void stop() {
        assertEquals(0,fireTruck.stop());
    }

}
