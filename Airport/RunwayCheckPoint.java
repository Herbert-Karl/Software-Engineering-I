public class RunwayCheckPoint{
    private RunwayCheckPointID runwayCheckPointID;
    private boolean isOccupied;
    private Airplane airplane;

    public RunwayCheckPoint(RunwayCheckPointID runwayCheckpointID, boolean isOccupied, Airplane airplane){
        this.runwayCheckPointID = runwayCheckpointID;
        this.isOccupied = isOccupied;
        this.airplane = airplane;
    }
}