package Airport.airport;

import Airplane.Aircraft.Airplane;

public class RunwayCheckpoint {
    private RunwayCheckPointID runwayCheckPointID;
    private boolean IsOccupied;
    private Airplane airplane;

    public RunwayCheckpoint(RunwayCheckPointID runwayCheckPointID, boolean isOccupied, Airplane airplane) {
        this.runwayCheckPointID = runwayCheckPointID;
        IsOccupied = isOccupied;
        this.airplane = airplane;
    }

    public RunwayCheckPointID getRunwayCheckPointID() {
        return runwayCheckPointID;
    }

    public void setRunwayCheckPointID(RunwayCheckPointID runwayCheckPointID) {
        this.runwayCheckPointID = runwayCheckPointID;
    }

    public boolean isOccupied() {
        return IsOccupied;
    }

    public void setOccupied(boolean occupied) {
        IsOccupied = occupied;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
}
