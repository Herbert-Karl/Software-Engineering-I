package Airport.security_check;

import Airport.base.BoardingPass;
import Airport.scanner.ReadingDevice;

import java.util.ArrayList;

public class AutomaticBoardingPassControl implements IAutomaticBoardingPassControl {
    private String uuid;
    private AutomaticBoardingPassControlID id;
    private ReadingDevice readingDevice;
    private ArrayList<IDoor> doorArrayList;

    public AutomaticBoardingPassControl(String uuid, AutomaticBoardingPassControlID id, ReadingDevice readingDevice, ArrayList<IDoor> doorArrayList) {
        this.uuid = uuid;
        this.id = id;
        this.readingDevice = readingDevice;
        this.doorArrayList = doorArrayList;
    }

    @Override
    public boolean openDoors() {
        return false;
    }

    @Override
    public boolean closeDoors() {
        return false;
    }

    @Override
    public boolean scan(BoardingPass boardingPass) {
        return false;
    }

    @Override
    public void alarm() {

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public AutomaticBoardingPassControlID getId() {
        return id;
    }

    public void setId(AutomaticBoardingPassControlID id) {
        this.id = id;
    }

    public ReadingDevice getReadingDevice() {
        return readingDevice;
    }

    public void setReadingDevice(ReadingDevice readingDevice) {
        this.readingDevice = readingDevice;
    }

    public ArrayList<IDoor> getDoorArrayList() {
        return doorArrayList;
    }

    public void setDoorArrayList(ArrayList<IDoor> doorArrayList) {
        this.doorArrayList = doorArrayList;
    }
}
