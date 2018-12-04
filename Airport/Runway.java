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
}