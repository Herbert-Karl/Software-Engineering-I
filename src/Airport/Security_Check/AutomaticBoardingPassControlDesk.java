package Airport.Security_Check;

import Airport.Base.BoardingPass;
import Airport.Base.Employee;
import Airport.Scanner.IReadingDevice;
import Airport.Scanner.ReadingDevice;

import java.util.UUID;

public class AutomaticBoardingPassControlDesk implements IAutomaticBoardingPassControlDesk {

    private String uuid;
    private Employee employee;
    private IReadingDevice iReadingDevice;

    public AutomaticBoardingPassControlDesk() {
        this.uuid = UUID.randomUUID().toString();
        this.iReadingDevice = new ReadingDevice( "AutomaticBoardingPassControl Reader");
    }

    @Override
    public boolean login(Employee employee) {
        if(employee == null) {
            this.employee = employee;
            return true;
        }
        return false;
    }

    @Override
    public void logout() {
        employee = null;
    }

    @Override
    public boolean scan(BoardingPass boardingPass) {
        if (employee != null) {
            if (boardingPass.getFlight() != null) {
                return true;
            }
        }
        return false;
    }
}

