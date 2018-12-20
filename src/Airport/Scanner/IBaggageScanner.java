package Airport.Scanner;

import Airport.Base.Baggage;
import Airport.Base.CottonPad;
import Airport.Base.Employee;
import Airport.Base.IDCard;

public interface IBaggageScanner {
    String version();
    void register(Employee employee);
    void unregister(Employee employee);
    boolean login(IDCard idCard, String password);
    boolean scan(Baggage baggage, String pattern);
    void logout();

}
