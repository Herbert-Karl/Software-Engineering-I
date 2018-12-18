package Airport.Security_Check;

import Airport.Base.*;

public interface ISecurityCheck {
    boolean loginBaggageScanner(Employee employee, String password);
    void logoutBaggageScanner();
    boolean loginBodyScanner(Employee employee, String password);
    void logoutBodyScanner();
    boolean loginExplosivesDetector(Employee employee, String password);
    void logoutExplosivesDetector();
    boolean scan(Passenger passenger);
    boolean scan(CottonPad cottonPad);
    boolean scan(Baggage baggage);
    void notifyGroundOperation();
    public void registerEmployee(Employee employee);
    public void unregisterEmployee(Employee employee);
}
