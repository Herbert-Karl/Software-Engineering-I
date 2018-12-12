package Airport.scanner;

import Airport.base.Employee;

import java.util.ArrayList;

public abstract class Scanner implements IScanner {
    private String uuid;
    private String id;
    private String type;
    private StringSearchAlgorithm stringSearchAlgorithm;
    private ArrayList<Employee> registeredEmployees;
    private IReadingDevice readingDevice;
    private Employee employee;

    public Scanner(String uuid, String id, String type, StringSearchAlgorithm stringSearchAlgorithm, ArrayList<Employee> registeredEmployees, IReadingDevice readingDevice, Employee employee) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.stringSearchAlgorithm = stringSearchAlgorithm;
        this.registeredEmployees = registeredEmployees;
        this.readingDevice = readingDevice;
        this.employee = employee;
    }

    public ArrayList<Employee> getRegisteredEmployees() {
        return registeredEmployees;
    }

    public void setRegisteredEmployees(ArrayList<Employee> registeredEmployees) {
        this.registeredEmployees = registeredEmployees;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StringSearchAlgorithm getStringSearchAlgorithm() {
        return stringSearchAlgorithm;
    }

    public void setStringSearchAlgorithm(StringSearchAlgorithm stringSearchAlgorithm) {
        this.stringSearchAlgorithm = stringSearchAlgorithm;
    }

    public IReadingDevice getReadingDevice() {
        return readingDevice;
    }

    public void setReadingDevice(IReadingDevice readingDevice) {
        this.readingDevice = readingDevice;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
