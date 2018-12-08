package Airport.Security_Check;

import Airport.Base.BoardingPass;
import Airport.Scanner.IReadingDevice;

import java.util.List;

public class AutomaticBoardingPassControl implements  IAutomaticBoardingPassControl {

    private String uuid;
    private AutomaticBoardingPassControlID id;
    private IReadingDevice readingDevice;
    private List<IDoor> doorList;

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
}
