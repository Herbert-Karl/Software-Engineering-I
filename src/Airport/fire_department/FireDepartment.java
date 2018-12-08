package Airport.fire_department;


import Airport.Airport.Position;
import Airport.Airport.Runway;
import Airport.Base.AlarmType;

import java.util.ArrayList;

public class FireDepartment implements IFireDepartment {
    private ArrayList<Entrance> entranceList=new ArrayList<>();
    private FireDepartmentResourcePool resourcePool;
    private Position position;

    public FireDepartment(Position position) {
        initalizeEntrances();
        this.position=position;
    }

    private void initalizeEntrances() {
        for (EntranceID entranceID:
             EntranceID.values()) {
            entranceList.add(new Entrance(entranceID));
        }
    }

    public void alarm(Runway runway, AlarmType alarmtype) {

    }

    public boolean openEntrance(Entrance entrance) {
        return false;
    }

    public boolean closeEntrance(Entrance entrance) {
        return false;
    }

    public int assignFireFighter(FireTruck fireTruck) {
        return 0;
    }

}
