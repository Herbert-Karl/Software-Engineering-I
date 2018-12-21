package Airport.Airport;

import Airplane.Aircraft.Airplane;

public class RunwayCheckPoint{
    private RunwayCheckPointID runwayCheckPointID;
    private boolean isOccupied;
    private Airplane airplane;

    public RunwayCheckPoint(RunwayCheckPointID runwayCheckpointID, boolean isOccupied, Airplane airplane){
        this.runwayCheckPointID = runwayCheckpointID;
        this.isOccupied = isOccupied;
        this.airplane = airplane;
    }


    public RunwayCheckPointID getRunwayCheckPointID() {
        return runwayCheckPointID;
    }

    public void setRunwayCheckPointID(RunwayCheckPointID runwayCheckPointID) {
        this.runwayCheckPointID = runwayCheckPointID;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}