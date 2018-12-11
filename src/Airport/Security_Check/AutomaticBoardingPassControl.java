package Airport.Security_Check;

import Airport.Base.BoardingPass;
import Airport.Base.Passport;
import Airport.Scanner.IReadingDevice;

import java.util.List;

public class AutomaticBoardingPassControl implements  IAutomaticBoardingPassControl {

    private String uuid;
    private AutomaticBoardingPassControlID id;
    private IReadingDevice readingDevice;
    private List<IDoor> doorList;

    public AutomaticBoardingPassControl(String uuid, AutomaticBoardingPassControlID id, IReadingDevice readingDevice) {
        this.uuid = uuid;
        this.id = id;
        this.readingDevice = readingDevice;
    }

    @Override
    public boolean openDoors() {
        for(IDoor door : doorList) {
            door.open();
        }
        return true;
    }

    @Override
    public boolean closeDoors() {
        for(IDoor door : doorList) {
            door.close();
        }
        return true;
    }

    //TODO Scann logik nicht klar
    @Override
    public boolean scan(BoardingPass boardingPass) {
        return true;
    }
//TODO
    @Override
    public void alarm() {

    }
}