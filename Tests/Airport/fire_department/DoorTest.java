package Airport.fire_department;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoorTest {

    @Test
    void open() {
        Door testDoor = new Door();
        open();                                         //Methode ausführen
        assertTrue(isOpen)                              //Hat die Methode die Attribute passend angepasst?
        testDoor = null;                                //testdoor wieder löschen
    }

    @Test
    void close() {
        Door testDoor = new Door();
        close();                                         //Methode ausführen
        assertFalse(isOpen)                              //Hat die Methode die Attribute passend angepasst?
        testDoor = null;                                 //testdoor wieder löschen
    }
}
