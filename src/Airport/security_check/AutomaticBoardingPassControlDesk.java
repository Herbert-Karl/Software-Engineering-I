package Airport.security_check;

import Airport.base.BoardingPass;
import Airport.base.Employee;
import Airport.scanner.ReadingDevice;

public class AutomaticBoardingPassControlDesk implements IAutomaticBoardingPassControlDesk {
    private String uuid;
    private Employee employee;
    private ReadingDevice readingDevice;

    public AutomaticBoardingPassControlDesk(String uuid, Employee employee, ReadingDevice readingDevice) {
        this.uuid = uuid;
        this.employee = employee;
        this.readingDevice = readingDevice;
    }

    @Override
    public boolean scan(BoardingPass boardingPass) {
        return false;
    }

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

    public ReadingDevice getReadingDevice() {
        return readingDevice;
    }

    public void setReadingDevice(ReadingDevice readingDevice) {
        this.readingDevice = readingDevice;
    }
}
