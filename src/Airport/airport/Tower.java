package Airport.airport;

import Airplane.Aircraft.Airplane;
import Airport.base.AlarmType;

public class Tower {
    private Airport airport;
    private String frequency;
    private IRunwayManagement runwayManagement;
    private WindDirection windDirection;

    public Tower(Airport airport, IRunwayManagement runwayManagement, WindDirection windDirection) {
        this.airport = airport;
        this.runwayManagement = runwayManagement;
        this.windDirection = windDirection;
        this.frequency = "128.5";
    }

    public void receiveRequestTakeOff(Airplane airplane) {

    }

    public void approveRequestTakeOff(Airplane airplane) {

    }

    public void receiveRequestLanding(Airplane airplane) {

    }

    public void approveRequestLanding(Airplane airplane) {

    }

    public void receiveFireAlarm(Airplane airplane) {

    }

    public AlarmType determineAlarmType(Airplane airplane) {
        return AlarmType.A;
    }

    public void alarm(RunwayID runwayID, AlarmType alarmType) {

    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public IRunwayManagement getRunwayManagement() {
        return runwayManagement;
    }

    public void setRunwayManagement(IRunwayManagement runwayManagement) {
        this.runwayManagement = runwayManagement;
    }

    public WindDirection getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(WindDirection windDirection) {
        this.windDirection = windDirection;
    }
}
