package Airport.Scanner;

import Airport.Base.Employee;
import Airport.Base.IDCard;

public interface IExplosivesDetector {
    void register(Employee employee);
    void unregister(Employee employee);
    boolean login(IDCard idCard);
    boolean scan(CottonPad cottonPad);
    boolean logout();
}
