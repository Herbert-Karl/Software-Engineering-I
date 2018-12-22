package Airport.fire_department;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FireDepartmentResourcePoolTest {

    @Test
    void getFireTrucksList() {
        for (FireTruck fireTruck : <FireTruck>){
            testFireTruckList.add(new FireTruck(firetruck));
        }
        fireTrucklist = getFireTrucksList();

            assertEquals(fireTrucksList,testFireTruckList);
    }
}
