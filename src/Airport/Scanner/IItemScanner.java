package Airport.Scanner;

import Airport.Base.*;

public interface IItemScanner {
    String version();
    void register(Employee employee);
    void unregister(Employee employee);
    boolean login(IDCard idCard, String password);
    boolean scan(Item item, String pattern);
    void logout();
}
