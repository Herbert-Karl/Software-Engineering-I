package Airport.Security_Check;

import Airport.Base.BoardingPass;
import Airport.Base.Employee;
import Airport.Scanner.IReadingDevice;

public class AutomaticBoardingPassControlDesk implements  IAutomaticBoardingPassControlDesk {

    private String uuid;
    private Employee employee;
    private IReadingDevice iReadingDevice;

    public AutomaticBoardingPassControlDesk(String uuid, IReadingDevice iReadingDevice) {
        this.uuid = uuid;
        this.iReadingDevice = iReadingDevice;
    }


    @Override
    public boolean scan(BoardingPass boardingPass) {
        if(employee != null) {
            //TODO Scan logik
            return true;
        }
        return false;
    }
}

