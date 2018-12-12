package Airport.airport;

import Airplane.Aircraft.Airplane;

import java.util.ArrayList;

public class RunwayManagement implements IRunwayManagement {
    private ArrayList<Airplane> airplaneArrayList;
    private ArrayList<Runway> runwayArrayList;

    public RunwayManagement(ArrayList<Airplane> airplaneArrayList, ArrayList<Runway> runwayArrayList) {
        this.airplaneArrayList = airplaneArrayList;
        this.runwayArrayList = runwayArrayList;
    }

    @Override
    public RunwayCheckPointID provideRunwayCheckPointID(Airplane airplane) {
        return null;
    }

    public ArrayList<Airplane> getAirplaneArrayList() {
        return airplaneArrayList;
    }

    public void setAirplaneArrayList(ArrayList<Airplane> airplaneArrayList) {
        this.airplaneArrayList = airplaneArrayList;
    }

    public ArrayList<Runway> getRunwayArrayList() {
        return runwayArrayList;
    }

    public void setRunwayArrayList(ArrayList<Runway> runwayArrayList) {
        this.runwayArrayList = runwayArrayList;
    }
}
