package Airport.scanner;

import Airport.base.CottonPad;
import Airport.base.Employee;
import Airport.base.IDCard;

import java.util.ArrayList;

public class ExplosiveDetector extends Scanner implements IExplosiveDetector {
    public ExplosiveDetector(String uuid, String id, String type, StringSearchAlgorithm stringSearchAlgorithm, ArrayList<Employee> registeredEmployees, IReadingDevice readingDevice, Employee employee) {
        super(uuid, id, type, stringSearchAlgorithm, registeredEmployees, readingDevice, employee);
    }

    @Override
    public boolean scan(CottonPad cottonPad) {
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
