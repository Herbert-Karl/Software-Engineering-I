package Airport.Federal_Police;

import java.util.ArrayList;
import java.util.Random;

public class FederalPoliceCar implements IFederalPoliceCar{
    private String uuid;
    private int id;
    private String type;
    private int speedInMPH;
    private ArrayList<FederalPoliceOfficer> federalPoliceOfficerList;
    private boolean isFlashingLightOn;
    private int numberOfSeat;
    private String currentLocation;
    Random rnd = new Random();

    public FederalPoliceCar(String type, int speedInMPH, ArrayList<FederalPoliceOfficer> federalPoliceOfficerList, boolean isFlashingLightOn, int numberOfSeat, String currentLocation) {
        this.uuid = java.util.UUID.randomUUID().toString();
        this.id = rnd.nextInt(100000)+1;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.federalPoliceOfficerList = federalPoliceOfficerList;
        this.isFlashingLightOn = isFlashingLightOn;
        this.numberOfSeat = numberOfSeat;
        this.currentLocation = currentLocation;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeedInMPH() {
        return speedInMPH;
    }

    public void setSpeedInMPH(int speedInMPH) {
        this.speedInMPH = speedInMPH;
    }

    public ArrayList<FederalPoliceOfficer> getFederalPoliceOfficerList() {
        return federalPoliceOfficerList;
    }

    public void setFederalPoliceOfficerList(ArrayList<FederalPoliceOfficer> federalPoliceOfficerList) {
        this.federalPoliceOfficerList = federalPoliceOfficerList;
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

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public void forward(int speedInMPH) {
        this.speedInMPH = speedInMPH;
    }

    @Override
    public void backward(int speedInMPH) {
        this.speedInMPH = -speedInMPH;
    }

    @Override
    public void stop() {
        this.speedInMPH = 0;
    }

    @Override
    public void setFlashingLightOn() {
        this.isFlashingLightOn = true;
    }

    @Override
    public void setFlashingLightOff() {
        this.isFlashingLightOn = false;
    }
}
