package Airport.Security_Check;

import Airport.Base.Employee;

import java.util.List;

public class SecurityCheckReceipt {
    private String uuid;
    private SecurityCheckID id;
    private List<Employee> employeeList;
    private int numberOfPassengerScanned;
    private int numberOfBaggageScanned;
    private int numberOfDangeroursBaggage;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public SecurityCheckID getId() {
        return id;
    }

    public void setId(SecurityCheckID id) {
        this.id = id;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public int getNumberOfPassengerScanned() {
        return numberOfPassengerScanned;
    }

    public void setNumberOfPassengerScanned(int numberOfPassengerScanned) {
        this.numberOfPassengerScanned = numberOfPassengerScanned;
    }

    public int getNumberOfBaggageScanned() {
        return numberOfBaggageScanned;
    }

    public void setNumberOfBaggageScanned(int numberOfBaggageScanned) {
        this.numberOfBaggageScanned = numberOfBaggageScanned;
    }

    public int getNumberOfDangeroursBaggage() {
        return numberOfDangeroursBaggage;
    }

    public void setNumberOfDangeroursBaggage(int numberOfDangeroursBaggage) {
        this.numberOfDangeroursBaggage = numberOfDangeroursBaggage;
    }
}
