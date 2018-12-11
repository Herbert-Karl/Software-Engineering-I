package Airport.fire_department;

import Airport.airport.Runway;
import Airport.base.AlarmType;

import java.util.ArrayList;

public class FireAlertStrategy {
    private Runway runway;
    private AlarmType alarmType;
    private ArrayList<FireFighter> fireFighterArrayList;
    private ArrayList<FireTruck> fireTruckArrayList;

    public FireAlertStrategy(Runway runway, AlarmType alarmType, ArrayList<FireFighter> fireFighterArrayList, ArrayList<FireTruck> fireTruckArrayList) {
        this.runway = runway;
        this.alarmType = alarmType;
        this.fireFighterArrayList = fireFighterArrayList;
        this.fireTruckArrayList = fireTruckArrayList;
    }

    public Runway getRunway() {
        return runway;
    }

    public void setRunway(Runway runway) {
        this.runway = runway;
    }

    public AlarmType getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(AlarmType alarmType) {
        this.alarmType = alarmType;
    }

    public ArrayList<FireFighter> getFireFighterArrayList() {
        return fireFighterArrayList;
    }

    public void setFireFighterArrayList(ArrayList<FireFighter> fireFighterArrayList) {
        this.fireFighterArrayList = fireFighterArrayList;
    }

    public ArrayList<FireTruck> getFireTruckArrayList() {
        return fireTruckArrayList;
    }

    public void setFireTruckArrayList(ArrayList<FireTruck> fireTruckArrayList) {
        this.fireTruckArrayList = fireTruckArrayList;
    }
}
