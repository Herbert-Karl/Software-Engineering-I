package Airport.fire_department;

import Airport.airport.Position;
import Airport.airport.Runway;
import Airport.base.AlarmType;

import java.util.ArrayList;

public class FireDepartment implements IFireDepartment {
    private Position position;
    private FireDepartmentResourcePool resourcePool;
    private ArrayList<Entrance> entranceArrayList;

    public FireDepartment(Position position, FireDepartmentResourcePool resourcePool, ArrayList<Entrance> entranceArrayList) {
        this.position = position;
        this.resourcePool = resourcePool;
        this.entranceArrayList = entranceArrayList;
    }

    @Override
    public boolean openEntrance(Entrance entrance) {
        return false;
    }

    @Override
    public boolean closeEntrance(Entrance entrance) {
        return false;
    }

    @Override
    public void alarm(Runway runway, AlarmType alarmType) {

    }

    @Override
    public FireAlertStrategy buildStrategy(AlarmType alarmType) {
        return null;
    }

    @Override
    public void execute(Runway runway, FireAlertStrategy strategy) {

    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public FireDepartmentResourcePool getResourcePool() {
        return resourcePool;
    }

    public void setResourcePool(FireDepartmentResourcePool resourcePool) {
        this.resourcePool = resourcePool;
    }

    public ArrayList<Entrance> getEntranceArrayList() {
        return entranceArrayList;
    }

    public void setEntranceArrayList(ArrayList<Entrance> entranceArrayList) {
        this.entranceArrayList = entranceArrayList;
    }
}
