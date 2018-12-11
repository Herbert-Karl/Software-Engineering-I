package Airport.fire_department;

import Airplane.Aircraft.Airplane;
import Airport.airport.Airport;
import Airport.airport.Runway;
import Airport.airport.RunwayID;
import Airport.base.AlarmType;

import java.util.ArrayList;

public class FireTruck implements IFireTruck {
    private String uuid;
    private String id;
    private FireTruckType type;
    private int speedInMPH;
    private ArrayList<FireFighter> fireFighterArrayList;
    private boolean isFlashingLightOn;
    private int numberOfSeat;
    private int numberOfWheel;
    private int numberOfExtinguisher;
    private boolean hasFireEtinguishingGun;
    private int maximumCapacityOfWater;
    private int numberOfHose;
    private int numberOfRespiratoryProtection;
    private int numberOfOxygenBottle;
    private boolean hasExtingishingFoam;
    private boolean hasSpecialTool;
    private AlarmType alarmType;
    private Runway runway;
    private Airplane airplane;
    private Airport airport;

    public FireTruck(String uuid, String id, FireTruckType type, int speedInMPH, ArrayList<FireFighter> fireFighterArrayList, boolean isFlashingLightOn, int numberOfSeat, int numberOfWheel, int numberOfExtinguisher, boolean hasFireEtinguishingGun, int maximumCapacityOfWater, int numberOfHose, int numberOfRespiratoryProtection, int numberOfOxygenBottle, boolean hasExtingishingFoam, boolean hasSpecialTool, AlarmType alarmType, Runway runway, Airplane airplane, Airport airport) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.fireFighterArrayList = fireFighterArrayList;
        this.isFlashingLightOn = isFlashingLightOn;
        this.numberOfSeat = numberOfSeat;
        this.numberOfWheel = numberOfWheel;
        this.numberOfExtinguisher = numberOfExtinguisher;
        this.hasFireEtinguishingGun = hasFireEtinguishingGun;
        this.maximumCapacityOfWater = maximumCapacityOfWater;
        this.numberOfHose = numberOfHose;
        this.numberOfRespiratoryProtection = numberOfRespiratoryProtection;
        this.numberOfOxygenBottle = numberOfOxygenBottle;
        this.hasExtingishingFoam = hasExtingishingFoam;
        this.hasSpecialTool = hasSpecialTool;
        this.alarmType = alarmType;
        this.runway = runway;
        this.airplane = airplane;
        this.airport = airport;
    }

    @Override
    public void executeRequest(RunwayID runwayID) {

    }

    @Override
    public void setFlashingLightOn() {

    }

    @Override
    public void move(int speedInMPH) {

    }

    @Override
    public void stop() {

    }

    @Override
    public void setRunway(RunwayID runwayID) {

    }

    @Override
    public void setAirplane() {

    }

    @Override
    public boolean extinguish(int amount, Airplane airplane) {
        return false;
    }

    @Override
    public boolean extinguish(boolean useFoam, Airplane airplane) {
        return false;
    }

    @Override
    public void returnToFireDepartment() {

    }

    @Override
    public void setFlashingLightOff() {

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FireTruckType getType() {
        return type;
    }

    public void setType(FireTruckType type) {
        this.type = type;
    }

    public int getSpeedInMPH() {
        return speedInMPH;
    }

    public void setSpeedInMPH(int speedInMPH) {
        this.speedInMPH = speedInMPH;
    }

    public ArrayList<FireFighter> getFireFighterArrayList() {
        return fireFighterArrayList;
    }

    public void setFireFighterArrayList(ArrayList<FireFighter> fireFighterArrayList) {
        this.fireFighterArrayList = fireFighterArrayList;
    }

    public boolean isFlashingLightOn() {
        return isFlashingLightOn;
    }

    public void setFlashingLightOn(boolean flashingLightOn) {
        isFlashingLightOn = flashingLightOn;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public int getNumberOfExtinguisher() {
        return numberOfExtinguisher;
    }

    public void setNumberOfExtinguisher(int numberOfExtinguisher) {
        this.numberOfExtinguisher = numberOfExtinguisher;
    }

    public boolean isHasFireEtinguishingGun() {
        return hasFireEtinguishingGun;
    }

    public void setHasFireEtinguishingGun(boolean hasFireEtinguishingGun) {
        this.hasFireEtinguishingGun = hasFireEtinguishingGun;
    }

    public int getMaximumCapacityOfWater() {
        return maximumCapacityOfWater;
    }

    public void setMaximumCapacityOfWater(int maximumCapacityOfWater) {
        this.maximumCapacityOfWater = maximumCapacityOfWater;
    }

    public int getNumberOfHose() {
        return numberOfHose;
    }

    public void setNumberOfHose(int numberOfHose) {
        this.numberOfHose = numberOfHose;
    }

    public int getNumberOfRespiratoryProtection() {
        return numberOfRespiratoryProtection;
    }

    public void setNumberOfRespiratoryProtection(int numberOfRespiratoryProtection) {
        this.numberOfRespiratoryProtection = numberOfRespiratoryProtection;
    }

    public int getNumberOfOxygenBottle() {
        return numberOfOxygenBottle;
    }

    public void setNumberOfOxygenBottle(int numberOfOxygenBottle) {
        this.numberOfOxygenBottle = numberOfOxygenBottle;
    }

    public boolean isHasExtingishingFoam() {
        return hasExtingishingFoam;
    }

    public void setHasExtingishingFoam(boolean hasExtingishingFoam) {
        this.hasExtingishingFoam = hasExtingishingFoam;
    }

    public boolean isHasSpecialTool() {
        return hasSpecialTool;
    }

    public void setHasSpecialTool(boolean hasSpecialTool) {
        this.hasSpecialTool = hasSpecialTool;
    }

    public AlarmType getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(AlarmType alarmType) {
        this.alarmType = alarmType;
    }

    public Runway getRunway() {
        return runway;
    }

    public void setRunway(Runway runway) {
        this.runway = runway;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}
