package Airport.Security_Check;

import Airport.Base.Baggage;
import Airport.Base.Employee;
import Airport.Base.Passenger;

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
    void notifyGroudOperation(SecurityCheckReceipt securityCheckReceipt);
}
