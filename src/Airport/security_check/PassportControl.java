package Airport.security_check;

import Airport.base.Passport;
import Airport.federal_police.FederalPoliceOfficer;
import Airport.scanner.ReadingDevice;

import java.util.ArrayList;

public class PassportControl implements IPassportControl {
    private String uuid;
    private String id;
    private FederalPoliceOfficer federalPoliceOfficer;
    private ReadingDevice readingDevice;
    private ArrayList<Passport> passportArrayList;

    public PassportControl(String uuid, String id, FederalPoliceOfficer federalPoliceOfficer, ReadingDevice readingDevice, ArrayList<Passport> passportArrayList) {
        this.uuid = uuid;
        this.id = id;
        this.federalPoliceOfficer = federalPoliceOfficer;
        this.readingDevice = readingDevice;
        this.passportArrayList = passportArrayList;
    }

    @Override
    public boolean verify(Passport passport) {
        return false;
    }

    @Override
    public boolean scan(Passport passport) {
        return false;
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

    public FederalPoliceOfficer getFederalPoliceOfficer() {
        return federalPoliceOfficer;
    }

    public void setFederalPoliceOfficer(FederalPoliceOfficer federalPoliceOfficer) {
        this.federalPoliceOfficer = federalPoliceOfficer;
    }

    public ReadingDevice getReadingDevice() {
        return readingDevice;
    }

    public void setReadingDevice(ReadingDevice readingDevice) {
        this.readingDevice = readingDevice;
    }

    public ArrayList<Passport> getPassportArrayList() {
        return passportArrayList;
    }

    public void setPassportArrayList(ArrayList<Passport> passportArrayList) {
        this.passportArrayList = passportArrayList;
    }
}
