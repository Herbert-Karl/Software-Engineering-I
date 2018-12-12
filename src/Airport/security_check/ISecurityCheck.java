package Airport.security_check;

import Airport.base.Baggage;
import Airport.base.CottonPad;
import Airport.base.Employee;
import Airport.base.Passenger;

public interface ISecurityCheck {
    boolean loginBaggageScanner(Employee employee, String password);
    void logoutBaggageScanner();
    boolean loginBodyScanner(Employee employee, String password);
    void logoutBodyScanner();
    boolean loginExplosivesDetector(Employee employee, String password);
    void logoutExplosivesDetector();
    boolean scan(Passenger passenger, String pattern);
    boolean scan(Passenger passenger, CottonPad cottonPad);
    boolean scan(Baggage baggage, String pattern);
    boolean scan(Baggage baggage, CottonPad cottonPad);
    void notifyGroundOperations(SecurityCheckReceipt securityCheckReceipt);
}
