package Airport.federal_police;

import java.util.ArrayList;

public class FederalPoliceCar implements IFederalPoliceCar {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private ArrayList<FederalPoliceOfficer> federalPoliceOfficerArrayList;
    private boolean isFLashingLightOn;
    private int numberOfSeat;
    private String currentLocation;

    public FederalPoliceCar(String uuid, String id, String type, int speedInMPH, ArrayList<FederalPoliceOfficer> federalPoliceOfficerArrayList, boolean isFLashingLightOn, int numberOfSeat, String currentLocation) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.federalPoliceOfficerArrayList = federalPoliceOfficerArrayList;
        this.isFLashingLightOn = isFLashingLightOn;
        this.numberOfSeat = numberOfSeat;
        this.currentLocation = currentLocation;
    }

    @Override
    public void forward(int speedInMPH) {

    }

    @Override
    public void backward(int speedInMPH) {

    }

    @Override
    public void stop() {

    }

    @Override
    public void setFlashingLightOn() {

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

    public ArrayList<FederalPoliceOfficer> getFederalPoliceOfficerArrayList() {
        return federalPoliceOfficerArrayList;
    }

    public void setFederalPoliceOfficerArrayList(ArrayList<FederalPoliceOfficer> federalPoliceOfficerArrayList) {
        this.federalPoliceOfficerArrayList = federalPoliceOfficerArrayList;
    }

    public boolean isFLashingLightOn() {
        return isFLashingLightOn;
    }

    public void setFLashingLightOn(boolean FLashingLightOn) {
        isFLashingLightOn = FLashingLightOn;
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
}
