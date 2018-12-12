package Airport.scanner;

import Airport.base.Employee;
import Airport.base.IDCard;

public interface IScanner {
    String version();
    void register(Employee employee);
    void unregister(Employee employee);
    boolean login(IDCard idCard, String password);
    boolean logout();
}
