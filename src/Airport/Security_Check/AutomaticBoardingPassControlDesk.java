package Airport.Security_Check;

import Airport.Base.BoardingPass;
import Airport.Base.Employee;
import Airport.Scanner.IReadingDevice;

import java.util.UUID;

public class AutomaticBoardingPassControlDesk implements IAutomaticBoardingPassControlDesk {

    private String uuid;
    private Employee employee;
    private IReadingDevice iReadingDevice;

    public AutomaticBoardingPassControlDesk(IReadingDevice iReadingDevice) {
        this.uuid = UUID.randomUUID().toString();
        this.iReadingDevice = iReadingDevice;
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

