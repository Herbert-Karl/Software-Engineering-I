package Airport.Security_Check;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoorTest {
    private Door door;

    @BeforeEach
    void setUp() {
        door = new Door();
    }

    @Test
    void close() {
        door.close();
        assertFalse(door.isOpen());
    }

    @Test
    void open() {
        door.open();
        assertTrue(door.isOpen());
    }
}