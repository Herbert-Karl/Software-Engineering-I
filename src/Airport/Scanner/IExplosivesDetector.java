package Airport.Scanner;

import Airport.Base.CottonPad;
import Airport.Base.Employee;
import Airport.Base.IDCard;

public interface IExplosivesDetector {
    void register(Employee employee);
    void unregister(Employee employee);
    boolean login(IDCard idCard, String password);
    boolean scan(CottonPad cottonPad);
    void logout();
    String version();
}
