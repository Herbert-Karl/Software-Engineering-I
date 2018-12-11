package Airport.Scanner;

import Airport.Base.CottonPad;
import Airport.Base.Employee;
import Airport.Base.IDCard;
import Airport.Base.Passenger;

public interface IBodyScanner {
    String version();
    void register(Employee employee);
    void unregister(Employee employee);
    boolean login(IDCard idCard, String password);
    boolean scan(Passenger passenger, String pattern);
    boolean scan(Passenger passenger, CottonPad cottonPad);
    void logout();
}
