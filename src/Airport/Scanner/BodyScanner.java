package Airport.Scanner;

import Airport.Base.Employee;
import Airport.Base.IDCard;
import Airport.Base.Passenger;

import java.util.List;

public class BodyScanner implements IBodyScanner{

    private String uuid;
    private String id;
    private String type;
    private StringSearchAlgorithm stringSearchAlgorithm;
    private List<Employee> registeredEmployeeList;
    private IReadingDevice readingDevice;
    private Employee employee;

    @Override
    public String version() {
        return null;
    }

    @Override
    public void register(Employee employee) {

    }

    @Override
    public void unregister(Employee employee) {

    }

    @Override
    public boolean login(IDCard idCard, String password) {
        return false;
    }

    @Override
    public boolean scan(Passenger passenger, String pattern){
        return false;
    }

    @Override
    public boolean scan(Passenger passenger, CottonPad cottonPad) {
        return false;
    }

    @Override
    public boolean logut() {
        return false;
    }
}
