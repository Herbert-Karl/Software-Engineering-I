package Airport.fire_department;

import java.util.ArrayList;
import java.util.HashMap;

class FireDepartmentResourcePool {
    private ArrayList<FireFighter> fireFightersList;
    private ArrayList<FireTruck> fireTrucksList;
    private HashMap<Entrance,FireTruck> fireTruckEntranceHashMap;

    public HashMap<Entrance, FireTruck> getFireTruckEntranceHashMap()
    {
        return fireTruckEntranceHashMap;
    }

    ArrayList<FireTruck> getFireTrucksList() {
        return fireTrucksList;
    }


}
