package Airport.Security_Check;

import Airport.Base.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SecurityCheckReceipt {
    private String uuid;
    private SecurityCheckID id;
    private List<Employee> employeeList;
    private int numberOfPassengerScanned;
    private int numberOfBaggageScanned;
    private int numberOfDangerousBaggage;

    public SecurityCheckReceipt(SecurityCheckID id) {
        this.uuid = UUID.randomUUID().toString();
        this.id = id;
        employeeList = new ArrayList<>();
        numberOfPassengerScanned = 0;
        numberOfBaggageScanned = 0;
        numberOfDangerousBaggage = 0;
    }

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

    public int getNumberOfDangerousBaggage() {
        return numberOfDangerousBaggage;
    }

    public void setNumberOfDangeroursBaggage(int numberOfDangeroursBaggage) {
        this.numberOfDangerousBaggage = numberOfDangeroursBaggage;
    }
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
}
