package Airport.fire_department;

import Airport.Airport.Position;
import Airport.Airport.Runway;
import Airport.Base.AlarmType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class FireDepartment implements IFireDepartment
{
    private ArrayList<Entrance> entranceList = new ArrayList<>();
    private FireDepartmentResourcePool resourcePool;
    private Position position;

    public FireDepartment(Position position)
    {
        initalizeEntrances();
        this.position = position;
        resourcePool = new FireDepartmentResourcePool(entranceList);
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
        return true;
    }

    public boolean closeEntrance(Entrance entrance)
    {
        entrance.close();
        return false;
    }

    @Override
    public FireAlertStrategy buildStrategy(final AlarmType alarmType)
    {
        ArrayList<FireFighter> fireFighters = new ArrayList<>();
        ArrayList<FireTruck> fireTrucks = new ArrayList<>();

        switch (alarmType)
        {
            case A:
                fireTrucks.add(
                    resourcePool.getFireTrucksList().stream().filter(fireTruck -> fireTruck.getFireTrucktype().equals(FireTruckType.FT01)).findFirst().get());
                fireTrucks.add(
                    resourcePool.getFireTrucksList().stream().filter(fireTruck -> fireTruck.getFireTrucktype().equals(FireTruckType.FT03)).findFirst()
                        .get());
                fireTrucks.add(
                    resourcePool.getFireTrucksList().stream().filter(fireTruck -> fireTruck.getFireTrucktype().equals(FireTruckType.FT04)).findFirst()
                        .get());
                break;
            case B:
                fireTrucks.add(
                    resourcePool.getFireTrucksList().stream().filter(fireTruck -> fireTruck.getFireTrucktype().equals(FireTruckType.FT01)).findFirst()
                        .get());
                fireTrucks.addAll(
                    resourcePool.getFireTrucksList().stream().filter(fireTruck -> fireTruck.getFireTrucktype().equals(FireTruckType.FT02))
                        .collect(Collectors.toList()));
                fireTrucks.add(
                    resourcePool.getFireTrucksList().stream().filter(fireTruck -> fireTruck.getFireTrucktype().equals(FireTruckType.FT03)).findFirst()
                        .get());
                fireTrucks.add(
                    resourcePool.getFireTrucksList().stream().filter(fireTruck -> fireTruck.getFireTrucktype().equals(FireTruckType.FT04)).findFirst()
                        .get());

                break;
            case C:
                fireTrucks=new ArrayList<>(resourcePool.getFireTrucksList());
                break;

        }
        int seats= fireTrucks.stream().mapToInt(FireTruck::getNumberOfSeat).sum();


        for(FireTruck fireTruck:fireTrucks){
            //TODO
        }

        return new FireAlertStrategy(alarmType, fireFighters, fireTrucks);
    }

    @Override
    public void execute(final Runway runway,
        final FireAlertStrategy strategy)
    {
        ArrayList<Entrance> openEntrances = new ArrayList<>();
        //openDoors
        final HashMap<Entrance, FireTruck> fireTruckEntranceHashMap = resourcePool.getFireTruckEntranceHashMap();
        strategy.getFireTruckList().stream().<BiConsumer<? super Entrance, ? super FireTruck>>map(truck -> (key, value) -> {
            if (truck.equals(value))
            {
                openEntrance(key);
                openEntrances.add(key);
            }
        }).forEach(fireTruckEntranceHashMap::forEach);
//sendOutFiretrucks
        strategy.getFireTruckList().forEach(fireTruck -> fireTruck.executeRequest(runway.getRunwayID()));
        //close doors
        openEntrances.forEach(this::closeEntrance);
        //restore Firefighters

    }

}
