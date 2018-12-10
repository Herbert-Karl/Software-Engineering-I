package Airport.fire_department;


import Airport.Airport.Runway;
import Airport.Base.AlarmType;

import java.util.ArrayList;

public class FireAlertStrategy {
    private Runway runway;
    private AlarmType alarmType;
    private ArrayList<FireFighter> fireFighterList;
    private ArrayList<FireTruck> fireTruckList;

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

    public Runway getRunway()
    {
        return runway;
    }
}
