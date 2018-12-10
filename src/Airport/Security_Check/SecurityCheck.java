package Airport.Security_Check;

import Airport.Airport.Airport;
import Airport.Base.Baggage;
import Airport.Base.Employee;
import Airport.Base.Passenger;
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

    @Override
    public boolean loginBaggageScanner(Employee employee, String password){
        return false;
    }
    @Override
    public void logoutBaggageScanner() {
    }

    @Override
    public boolean loginBodyScanner(Employee employee, String password) {
        return false;
    }

    @Override
    public void logoutBodyScanner() {

    }

    @Override
    public boolean loginExplosivesDetector(Employee employee, String password) {
        return false;
    }

    @Override
    public void logoutExplosivesDetector() {

    }

    @Override
    public boolean scan(Passenger passenger, String pattern) {
        return false;
    }

    @Override
    public boolean scan(Passenger passenger, CottonPad cottonPad) {
        return false;
    }

    @Override
    public boolean scan(Baggage baggage, String pattern) {
        return false;
    }

    @Override
    public boolean scan(Baggage baggage, CottonPad cottonPad) {
        return false;
    }

    @Override
    public void notifyGroudOperation(SecurityCheckReceipt securityCheckReceipt) {

    }
}
