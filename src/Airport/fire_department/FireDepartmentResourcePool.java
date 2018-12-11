package Airport.fire_department;

import java.util.ArrayList;

public class FireDepartmentResourcePool {
    private ArrayList<FireFighter> fireFighterArrayList;
    private ArrayList<IFireTruck> fireTruckArrayList;

    public FireDepartmentResourcePool(ArrayList<FireFighter> fireFighterArrayList, ArrayList<IFireTruck> fireTruckArrayList) {
        this.fireFighterArrayList = fireFighterArrayList;
        this.fireTruckArrayList = fireTruckArrayList;
    }

    public ArrayList<FireFighter> getFireFighterArrayList() {
        return fireFighterArrayList;
    }

    public void setFireFighterArrayList(ArrayList<FireFighter> fireFighterArrayList) {
        this.fireFighterArrayList = fireFighterArrayList;
    }

    public ArrayList<IFireTruck> getFireTruckArrayList() {
        return fireTruckArrayList;
    }

    public void setFireTruckArrayList(ArrayList<IFireTruck> fireTruckArrayList) {
        this.fireTruckArrayList = fireTruckArrayList;
    }
}
