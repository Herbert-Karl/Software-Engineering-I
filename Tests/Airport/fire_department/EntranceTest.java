package Airport.fire_department;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import Airport.fire_department.Door;
import Airport.fire_department.Entrance;

class EntranceTest {

    private Door door = new Door();
    private Entrance entrance= new Entrance();

    @Test
    void open() {

        Entrance testEntrance = new Entrance();
        List<testDoor> getdoorList();
        for (Door door : doorList) {                        //Jede Tür in dem Eingang durchgehen
            door.open();                                    //Methode ausführen
            assertTrue(isOpen);                              //Hat die Methode die Attribute rich angepasst?
        }
    }

    @Test
    void close() {

        Entrance testEntrance = new Entrance();
        List<testDoor> getdoorList();
        for (Door door : doorList) {                        //Jede Tür in dem Eingang durchgehen
            door.close();                                    //Methode ausführen
            assertFalse(isOpen);                              //Hat die Methode die Attribute rich angepasst?
        }
    }
}
