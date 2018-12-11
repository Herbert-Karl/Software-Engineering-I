package Airport.Airport;

import Airplane.Aircraft.Airplane;

import java.util.ArrayList;

public class Runway{
    private RunwayID runwayID;
    private Position position;
    private ArrayList<RunwayCheckPointID> checkPoints;
    private WindDirectionSensor windDirectionSensor;
    private boolean isClearedToLand;
    private boolean isClearedForTakeOff;
    private Airplane airplane;

    public Runway(RunwayID runwayID, Position position, ArrayList<RunwayCheckPointID> checkPoints,
                  WindDirectionSensor windDirectionSensor, boolean isClearedToLand, boolean isClearedForTakeOff, Airplane airplane){
        this.runwayID = runwayID;
        this.position = position;
        this.checkPoints = checkPoints;
        this.windDirectionSensor = windDirectionSensor;
        this.isClearedToLand = isClearedToLand;
        this.isClearedForTakeOff = isClearedForTakeOff;
        this.airplane = airplane;
    }

    public RunwayID getRunwayID() {
        return runwayID;
    }

    public void setRunwayID(RunwayID runwayID) {
        this.runwayID = runwayID;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public ArrayList<RunwayCheckPointID> getCheckPoints() {
        return checkPoints;
    }

    public void setCheckPoints(ArrayList<RunwayCheckPointID> checkPoints) {
        this.checkPoints = checkPoints;
    }

    public boolean isClearedToLand() {
        return isClearedToLand;
    }

    public void setClearedToLand(boolean clearedToLand) {
        isClearedToLand = clearedToLand;
    }

    public boolean isClearedForTakeOff() {
        return isClearedForTakeOff;
    }

    public void setClearedForTakeOff(boolean clearedForTakeOff) {
        isClearedForTakeOff = clearedForTakeOff;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
}