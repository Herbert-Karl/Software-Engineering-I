package Airport.Airport;

import java.util.ArrayList;

public class RunwayManagement implements IRunwayManagement{
    private ArrayList<Airplane> airplaneList;
    private ArrayList<Runway> runwayList;

    public RunwayManagement(ArrayList<Airplane> airplaneList, Arraylist<Runway> runwayList){
        this.airplaneList = airplaneList;
        this.runwayList = runwayList;
    }

    public RunwayCheckPointID provideRunwayCheckPointID(Airplane airplane){
        //TODO
    }
}