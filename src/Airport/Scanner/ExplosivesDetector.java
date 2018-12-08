package Airport.Scanner;

import Airport.Base.Employee;
import Airport.Base.IDCard;

import java.util.List;

public class ExplosivesDetector implements IExplosivesDetector {

    private String uuid;
    private String id;
    private String type;
    private StringSearchAlgorithm stringSearchAlgorithm;
    private List<Employee> registeredEmployeeList;
    private IReadingDevice readingDevice;
    private Employee employee;

    public ExplosivesDetector(String uuid, String id, String type, IReadingDevice readingDevice) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.readingDevice = readingDevice;
    }

    @Override
    public void register(Employee employee) {

    }

    @Override
    public void unregister(Employee employee) {

    }

    @Override
    public boolean login(IDCard idCard) {
        return false;
    }

    @Override
    public boolean scan(CottonPad cottonPad) {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }
}
