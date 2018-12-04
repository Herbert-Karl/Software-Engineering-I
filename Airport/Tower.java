public class Tower{
    private Airport airport;
    private String frequency;
    private IRunwayManagement runwayManagement;
    private WindDirection windDirection;

    public Tower(Airport airport, IRunwayManagement runwayManagement, WindDirection windDirection;){
        this.airport = airport;
        this.runwayManagement = runwayManagement;
        this.windDirection = windDirection;
        this.frequency = "128.5";
    }

    public void recieveRequestTakeOff(Airplane airplane){
        //TODO
    }

    public void approveRequestTakeOff(Airplane airplane){
        //TODO
    }

    public void recieveRequestLanding(Airplane airplane){
        //TODO
    }

    public void approveRequestLanding(Airplane airplane){
        //TODO
    }

    public void recieveFireAlarm(Airplane airplane){
        //TODO
    }

    public AlarmType determineAlarmType(Airplane airplane){
        //TODO
    }

    public void alarm(RunwayID runwayID, Airplane airplane){
        //TODO
    }
}