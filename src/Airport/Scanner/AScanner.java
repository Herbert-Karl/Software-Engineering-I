package Airport.Scanner;

import Airport.Base.Baggage;
import Airport.Base.CottonPad;
import Airport.Base.Employee;
import Airport.Base.IDCard;

import java.util.List;
import java.util.Random;
import java.util.UUID;

abstract class AScanner {
    String uuid;
    String id;
    String type;
    StringSearcher stringSearcher;
    List<Employee> registeredEmployeeList;
    IReadingDevice readingDevice;
    Employee employee;

    public AScanner(String type, StringSearchAlgorithm stringSearchAlgorithm, IReadingDevice readingDevice) {
        this.uuid = UUID.randomUUID().toString();
        this.id = Integer.toString(new Random().nextInt());
        this.type = type;
        this.readingDevice = readingDevice;
        stringSearcher = new StringSearcher(stringSearchAlgorithm);
    }

    public String version() {
        return "<" + id + "> - <" + type + ">";
    }

    public void register(Employee employee) {
        if (!registeredEmployeeList.contains(employee)) {
            registeredEmployeeList.add(employee);
        }
    }

    public void unregister(Employee employee) {
        if (registeredEmployeeList.contains(employee)) {
            registeredEmployeeList.remove(employee);
        }
    }

    public boolean login(IDCard idCard, String password) {
        if (employee == null) {
            if (registeredEmployeeList.contains(employee) && idCard.getPassword() == password) {
                return true;
            }
        }
        return false;
    }

    public void logout() {
        employee = null;
    }

    public boolean contains(String text, String pattern) {
        return stringSearcher.search(text, pattern);
    }
}
