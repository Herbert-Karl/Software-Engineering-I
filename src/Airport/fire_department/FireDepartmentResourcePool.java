package Airport.fire_department;

import Airport.Base.Gender;
import Airport.Base.IDCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

class FireDepartmentResourcePool
{
    private ArrayList<FireFighter> fireFightersList = new ArrayList<>();
    private ArrayList<FireTruck> fireTrucksList = new ArrayList<>();
    private HashMap<Entrance, FireTruck> fireTruckEntranceHashMap = new HashMap<>();

    private ArrayList<String> randomnames = new ArrayList<>(Arrays.asList("Martinez", "Dresdner", "Lange", "Gloeckner"));

    public HashMap<Entrance, FireTruck> getFireTruckEntranceHashMap()
    {
        return fireTruckEntranceHashMap;
    }

    ArrayList<FireTruck> getFireTrucksList()
    {
        return fireTrucksList;
    }

    public FireDepartmentResourcePool(final ArrayList<Entrance> entranceList)
    {

        fireTrucksList.add(new FireTruck("FT1", FireTruckType.FT01));
        fireTrucksList.add(new FireTruck("FT2", FireTruckType.FT01));
        fireTrucksList.add(new FireTruck("FT3", FireTruckType.FT02));
        fireTrucksList.add(new FireTruck("FT4", FireTruckType.FT02));
        fireTrucksList.add(new FireTruck("FT5", FireTruckType.FT03));
        fireTrucksList.add(new FireTruck("FT6", FireTruckType.FT03));
        fireTrucksList.add(new FireTruck("FT7", FireTruckType.FT04));
        fireTrucksList.add(new FireTruck("FT8", FireTruckType.FT04));

        IntStream.range(0, 28).forEach(i -> fireFightersList.add(createRandomFirefighter(i)));

        entranceList.forEach(entrance -> {
            FireTruck truck = fireTrucksList.get((int) (fireFightersList.size() * Math.random()));
            fireTruckEntranceHashMap.put(entrance, truck);
            fireTrucksList.remove(truck);
        });
        fireTrucksList=new ArrayList<>(fireTruckEntranceHashMap.values());

    }

    private FireFighter createRandomFirefighter(int firefighteridcounter)
    {
        return new FireFighter(String.valueOf(firefighteridcounter), randomnames.get((int) (Math.random() * randomnames.size())),
            Gender.values()[(int) (Math.random() + 0.5)], new IDCard());
    }

    public ArrayList<FireFighter> getFireFightersList() {
        return fireFightersList;
    }
}
