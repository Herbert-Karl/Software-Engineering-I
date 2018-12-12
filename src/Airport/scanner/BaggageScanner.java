package Airport.scanner;

import Airport.base.Baggage;
import Airport.base.CottonPad;
import Airport.base.Employee;
import Airport.base.IDCard;

import java.util.ArrayList;

public class BaggageScanner extends Scanner implements IBaggageScanner {
    public BaggageScanner(String uuid, String id, String type, StringSearchAlgorithm stringSearchAlgorithm, ArrayList<Employee> registeredEmployees, IReadingDevice readingDevice, Employee employee) {
        super(uuid, id, type, stringSearchAlgorithm, registeredEmployees, readingDevice, employee);
    }

    @Override
    public boolean scan(Baggage baggage, String pattern) {
        return false;
    }

    @Override
    public boolean scan(Baggage baggage, CottonPad cottonPad) {
        return false;
    }

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
    public boolean logout() {
        return false;
    }
}
