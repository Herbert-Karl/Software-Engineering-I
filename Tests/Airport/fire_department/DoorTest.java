package Airport.fire_department;

import org.junit.jupiter.api.Test;
import Airport.fire_department.Door;

import static org.junit.jupiter.api.Assertions.*;

class DoorTest {



    private Door door = new Door();

    @Test
    void open() {
        door.open();                                     //Methode ausführen
        assertTrue(door.getIsOpen());                    //Wurde isOpen gesetzt? Gettermethode nicht implementiert
    }

    @Test
    void close() {
        door.close();                                         //Methode ausführen
        assertFalse(door.getIsOpen());                        //Wurde isOpen gesetzt? Gettermethode nicht implementiert
    }
}
