package Airport.security_check;

import Airport.base.Employee;

import java.util.ArrayList;

public class SecurityCheckReceipt {
    private String uuid;
    private SecurityCheckID id;
    private ArrayList<Employee> employeeArrayList;
    private int numberOfPassengerScanned;
    private int numberOfBaggageScanned;
    private int numberOfDangerousBaggage;

    public SecurityCheckReceipt(String uuid, SecurityCheckID id, ArrayList<Employee> employeeArrayList, int numberOfPassengerScanned, int numberOfBaggageScanned, int numberOfDangerousBaggage) {
        this.uuid = uuid;
        this.id = id;
        this.employeeArrayList = employeeArrayList;
        this.numberOfPassengerScanned = numberOfPassengerScanned;
        this.numberOfBaggageScanned = numberOfBaggageScanned;
        this.numberOfDangerousBaggage = numberOfDangerousBaggage;
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

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void setEmployeeArrayList(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
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

    public void setNumberOfDangerousBaggage(int numberOfDangerousBaggage) {
        this.numberOfDangerousBaggage = numberOfDangerousBaggage;
    }
}
