package Airport.fire_department;


import Airport.Airport.Runway;
import Airport.Base.AlarmType;

import java.util.ArrayList;

public class FireAlertStrategy {

    private AlarmType alarmType;
    private ArrayList<FireFighter> fireFighterList;
    private ArrayList<FireTruck> fireTruckList;

    public FireAlertStrategy(final AlarmType alarmType,
        final ArrayList<FireFighter> fireFighters,
        final ArrayList<FireTruck> fireTrucks)
    {

    }

    public ArrayList<FireTruck> getFireTruckList()
    {
        return fireTruckList;
    }

    public ArrayList<FireFighter> getFireFighterList()
    {
        return fireFighterList;
    }

    public AlarmType getAlarmType()
    {
        return alarmType;
    }

}
