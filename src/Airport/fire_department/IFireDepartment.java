package Airport.fire_department;


import Airport.Airport.Runway;
import Airport.Base.AlarmType;

public interface IFireDepartment
{
    void alarm(Runway runway,
               AlarmType alarmtype);

    boolean openEntrance(Entrance entrance);

    boolean closeEntrance(Entrance entrance);

    FireAlertStrategy buildStrategy(AlarmType alarmType);

    void execute(Runway runway,FireAlertStrategy strategy);
}
