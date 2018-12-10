package Airport.Airport;

import Airplane.Aircraft.*;
import java.util.ArrayList;
import java.util.Random;

public class RunwayManagement implements IRunwayManagement {
    private ArrayList<Airplane> airplaneList;
    private ArrayList<Runway> runwayList;

    private Tower tower;

    public RunwayManagement(ArrayList<Airplane> airplaneList, ArrayList<Runway> runwayList, Tower tower) {
        this.airplaneList = airplaneList;
        this.runwayList = runwayList;
        this.tower = tower;
    }

    public RunwayCheckPointID provideRunwayCheckPointID(Airplane airplane) {
        RunwayCheckPointID runwayToStart = null;
        WindDirection windDirection = tower.getWindDirection();

        //anhand von Windrichtung und Runway
        //Runway: anhand von ID prüfen, ob Flugzeug null
        Runway randomRunWay = runwayList.get(0);
        RunwayCheckPointID selectedRanwayCheckPoint;

        switch (windDirection) {
            case WestToEast:
                selectedRanwayCheckPoint = randomRunWay.getCheckPoints().get(0);
                break;
            case EastToWest:

                break;
        }
        return runwayToStart;
    }


}