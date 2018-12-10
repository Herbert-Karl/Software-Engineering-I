package Airport.Security_Check;

import Airport.Airport.Airport;
import Airport.Base.Baggage;
import Airport.Base.Employee;
import Airport.Base.IDCard;
import Airport.Base.Passenger;
import Airport.Federal_Police.FederalPolice;
import Airport.Federal_Police.FederalPoliceOfficer;
import Airport.Scanner.IBaggageScanner;
import Airport.Scanner.IBodyScanner;
import Airport.Scanner.IExplosivesDetector;

import java.util.List;

public class SecurityCheck implements ISecurityCheck {

    private String uuid;
    private SecurityCheckID securityCheckID;
    private Airport airport;
    private List<Employee> employeeList;
    private FederalPoliceOfficer policeOfficer;
    private List<String> scanPatternList;
    private IBaggageScanner baggageScanner;
    private IBodyScanner bodyScanner;
    private IExplosivesDetector explosivesDetector;
    private FederalPolice federalPolice;

    public SecurityCheck(String uuid, SecurityCheckID securityCheckID, Airport airport, IBaggageScanner baggageScanner, IBodyScanner bodyScanner, IExplosivesDetector explosivesDetector) {
        this.uuid = uuid;
        this.securityCheckID = securityCheckID;
        this.airport = airport;
        this.baggageScanner = baggageScanner;
        this.bodyScanner = bodyScanner;
        this.explosivesDetector = explosivesDetector;
    }

    @Override
    public boolean loginBaggageScanner(Employee employee, String password) {
        return baggageScanner.login(employee.getIdCard(), password);
    }

    @Override
    public void logoutBaggageScanner() {
        baggageScanner.logout();
    }

    @Override
    public boolean loginBodyScanner(Employee employee, String password) {
        return bodyScanner.login(employee.getIdCard(), password);
    }

    @Override
    public void logoutBodyScanner() {
        bodyScanner.logut();
    }

    @Override
    public boolean loginExplosivesDetector(Employee employee, String password) {
        return explosivesDetector.login(employee.getIdCard(), password);
    }

    @Override
    public void logoutExplosivesDetector() {
        explosivesDetector.logout();
    }

    @Override
    public boolean scan(Passenger passenger, String pattern) {
        return bodyScanner.scan(passenger, pattern);
    }

    @Override
    public boolean scan(Passenger passenger, CottonPad cottonPad) {
        return bodyScanner.scan(passenger, cottonPad);
    }

    @Override
    public boolean scan(Baggage baggage, String pattern) {
        return baggageScanner.scan(baggage, pattern);
    }

    @Override
    public boolean scan(Baggage baggage, CottonPad cottonPad) {
        return baggageScanner.scan(baggage, cottonPad);
    }

    @Override
    public void notifyGroundOperation(SecurityCheckReceipt securityCheckReceipt) {
//TODO notify police close doors etc.?
    }
}