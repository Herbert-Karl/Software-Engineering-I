package Airport.fire_department;

import Airport.Airport.Position;
import Airport.Airport.Runway;
import Airport.Base.AlarmType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FireDepartment implements IFireDepartment
{
    private ArrayList<Entrance> entranceList = new ArrayList<>();
    private FireDepartmentResourcePool resourcePool;
    private Position position;

    public FireDepartment(Position position)
    {
        initalizeEntrances();
        this.position = position;
    }

    private void initalizeEntrances()
    {
        for (EntranceID entranceID :
            EntranceID.values())
        {
            entranceList.add(new Entrance(entranceID));
        }
    }

    public void alarm(Runway runway,
        AlarmType alarmtype)
    {
        if (runway.getPosition().equals(position))
        {
            FireAlertStrategy alertStrategy = buildStrategy(alarmtype);
            execute(runway, alertStrategy);
        }
    }

    public boolean openEntrance(Entrance entrance)
    {
        entrance.open();
        return false;
    }

    public boolean closeEntrance(Entrance entrance)
    {
        entrance.close();
        return false;
    }

    @Override
    public FireAlertStrategy buildStrategy(final AlarmType alarmType)
    {

        return null;
    }

    @Override
    public void execute(final Runway runway,
        final FireAlertStrategy strategy)
    {
        ArrayList<Entrance> openEntrances = new ArrayList<>();
        //openDoors
        final HashMap<Entrance, FireTruck> fireTruckEntranceHashMap = resourcePool.getFireTruckEntranceHashMap();
        for (FireTruck fireTruck :
            strategy.getFireTruckList())
        {
            for (Map.Entry<Entrance, FireTruck> entry : fireTruckEntranceHashMap.entrySet()
            )
            {
                if (fireTruck.equals(entry.getValue()))
                {
                    openEntrance(entry.getKey());
                    openEntrances.add(entry.getKey());
                }

            }

        }
//sendOutFiretrucks
        for (FireTruck fireTruck :
            strategy.getFireTruckList())
        {
            fireTruck.executeRequest(runway.getRunwayID());
        }
        //close doors
        for (Entrance entrance :
            openEntrances)
        {
            closeEntrance(entrance);
        }
        //restore Firefighters

    }

    public int assignFireFighter(FireTruck fireTruck)
    {
        return 0;
    }

}
