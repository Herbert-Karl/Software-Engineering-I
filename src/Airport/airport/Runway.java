package Airport.airport;

import Airplane.Aircraft.Airplane;

import java.util.ArrayList;

public class Runway {
    private RunwayID id;
    private Position position;
    private ArrayList<RunwayCheckPointID> checkPoint;
    private WindDirectionSensor windDirectionSensor;
    private boolean isClearedToLand;
    private boolean isClearedForTakeOff;
    private Airplane airplane;

    public Runway(RunwayID id, Position position, ArrayList<RunwayCheckPointID> checkPoint, WindDirectionSensor windDirectionSensor, boolean isClearedToLand, boolean isClearedForTakeOff, Airplane airplane) {
        this.id = id;
        this.position = position;
        this.checkPoint = checkPoint;
        this.windDirectionSensor = windDirectionSensor;
        this.isClearedToLand = isClearedToLand;
        this.isClearedForTakeOff = isClearedForTakeOff;
        this.airplane = airplane;
    }

    public RunwayID getId() {
        return id;
    }

    public void setId(RunwayID id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public ArrayList<RunwayCheckPointID> getCheckPoint() {
        return checkPoint;
    }

    public void setCheckPoint(ArrayList<RunwayCheckPointID> checkPoint) {
        this.checkPoint = checkPoint;
    }

    public WindDirectionSensor getWindDirectionSensor() {
        return windDirectionSensor;
    }

    public void setWindDirectionSensor(WindDirectionSensor windDirectionSensor) {
        this.windDirectionSensor = windDirectionSensor;
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
