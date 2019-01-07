package Airport.fire_department;

import Airport.ApronControl.ApronControl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FireDepartmentResourcePoolTest {

    private FireDepartmentResourcePool fireDepartmentResourcePool = new FireDepartmentResourcePool();



    @Test
    void getFireTrucksList() {
        for (FireTruck fireTruck : <FireTruck>){
            testFireTruckList.add(new FireTruck(firetruck));
        }
        fireTrucklist = fireDepartmentResourcePool.getFireTrucksList();

            assertEquals(fireTrucksList,testFireTruckList);
    }
}
