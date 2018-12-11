package Airport.fire_department;

import Airport.airport.Runway;
import Airport.base.AlarmType;

public interface IFireDepartment {
    boolean openEntrance(Entrance entrance);
    boolean closeEntrance(Entrance entrance);
    void alarm(Runway runway, AlarmType alarmType);
    FireAlertStrategy buildStrategy(AlarmType alarmType);
    void execute(Runway runway, FireAlertStrategy strategy);
}
