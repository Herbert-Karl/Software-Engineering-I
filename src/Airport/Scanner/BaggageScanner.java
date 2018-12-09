package Airport.Scanner;

import Airport.Base.Baggage;
import Airport.Base.Employee;
import Airport.Base.IDCard;

import java.util.List;

public class BaggageScanner implements  IBaggageScanner {

    String uuid;
    String id;
    String type;
    StringSearchAlgorithm stringSearchAlgorithm;
    List<Employee> registeredEmployeeList;
    IReadingDevice readingDevice;
    Employee employee;

    public String version() {
        return null;
    }
    public void register(Employee employee) {
    }
    public void unregister(Employee employee) {

    }
    public boolean login(IDCard idCard, String password) {
        return false;
    }
    public boolean scan(Baggage baggage, String pattern) {
        return false;
    }
    public boolean scan(Baggage baggage, CottonPad conttonPad) {
        return false;
    }
    public void logout() {

    }
}
