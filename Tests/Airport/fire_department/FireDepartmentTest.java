package Airport.fire_department;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FireDepartmentTest {

    private FireDepartment fireDepartment = new FireDepartment();

    @Test
    void alarm() {
        // keine abgeschlossene, testbare Methode
    }

    @Test
    void openEntrance() {
        assertTrue(fireDepartment.openEntrance());
        //open und close methode ist schon getestet
    }

    @Test
    void closeEntrance() {
        assertTrue(fireDepartment.openEntrance());
        //open und close methode ist schon getestet
    }

}
