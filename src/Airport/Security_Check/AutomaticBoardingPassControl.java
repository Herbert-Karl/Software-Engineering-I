package Airport.Security_Check;

import Airport.Base.BoardingPass;
import Airport.Base.Passport;
import Airport.Federal_Police.FederalPolice;
import Airport.Scanner.IReadingDevice;

import java.util.List;
import java.util.UUID;

public class AutomaticBoardingPassControl implements IAutomaticBoardingPassControl {

    private String uuid;
    private AutomaticBoardingPassControlID id;
    private IReadingDevice readingDevice;
    FederalPolice federalPolice;
    private List<IDoor> doorList;

    public AutomaticBoardingPassControl(AutomaticBoardingPassControlID id, IReadingDevice readingDevice, FederalPolice federalPolice) {
        this.uuid = UUID.randomUUID().toString();
        this.id = id;
        this.readingDevice = readingDevice;
    }

    @Override
    public boolean openDoors() {
        for (IDoor door : doorList) {
            door.open();
        }
        return true;
    }

    @Override
    public boolean closeDoors() {
        for (IDoor door : doorList) {
            door.close();
        }
        return true;
    }

    @Override
    public boolean scan(BoardingPass boardingPass) {
        if (boardingPass.getFlight() != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void alarm() {
        federalPolice.alarm(this);
    }
}