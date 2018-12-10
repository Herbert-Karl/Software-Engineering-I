package Airport.Scanner;

import Airport.Base.Baggage;
import Airport.Base.CottonPad;
import Airport.Base.Employee;
import Airport.Base.IDCard;

import java.util.List;

public class BaggageScanner implements IBaggageScanner {

    String uuid;
    String id;
    String type;
    List<Employee> registeredEmployeeList;
    IReadingDevice readingDevice;
    Employee employee;

    public BaggageScanner(String uuid, String id, String type, IReadingDevice readingDevice) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.readingDevice = readingDevice;
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

    @Override
    //teste ob eemployee ind er Liste steht und das Passwort stimmt
    public boolean login(IDCard idCard, String password) {
        //teste ob employee in der liste steht
        for (Employee employee: registeredEmployeeList) {
            if (employee.getIdCard() == idCard){
                //wenn ja teste ob passwort stimmt
                if (idCard.getPassword() == password) return true;
            }
        }
        //wenn employee nicht vorhanden, oder Passwort falsch
        return false;
    }

    @Override
    //gibt true zurück, wenn baggage pattern enthält
    public boolean scan(Baggage baggage, String pattern) {
        if (baggage.getContent().contains(pattern)) return true;
        return false;
    }

    @Override
    // gibt true zurück, wenn baggage das gesuchte enthält
    public boolean scan(Baggage baggage, CottonPad cottonPad) {
        if (baggage.getContent().contains(cottonPad.getSurface())) return true;
        return false;
    }

    @Override
    public void logout() {
        employee = null;
    }
}

