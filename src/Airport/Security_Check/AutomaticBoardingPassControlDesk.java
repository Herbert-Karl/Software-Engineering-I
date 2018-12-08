package Airport.Security_Check;

import Airport.Base.BoardingPass;
import Airport.Base.Employee;
import Airport.Scanner.IReadingDevice;

public class AutomaticBoardingPassControlDesk implements  IAutomaticBoardingPassControlDesk {

    private String uuid;
    private Employee employee;
    private IReadingDevice iReadingDevice;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public IReadingDevice getiReadingDevice() {
        return iReadingDevice;
    }

    public void setiReadingDevice(IReadingDevice iReadingDevice) {
        this.iReadingDevice = iReadingDevice;
    }

    @Override
    public boolean scan(BoardingPass boardingPass) {
        return false;
    }
}
