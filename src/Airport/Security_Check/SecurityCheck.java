package Airport.Security_Check;

import Airport.Airport.Airport;
import Airport.Base.*;
import Airport.Federal_Police.FederalPolice;
import Airport.Federal_Police.FederalPoliceOfficer;
import Airport.Scanner.IBaggageScanner;
import Airport.Scanner.IBodyScanner;
import Airport.Scanner.IExplosivesDetector;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    public SecurityCheck(SecurityCheckID securityCheckID, Airport airport, IBaggageScanner baggageScanner, IBodyScanner bodyScanner, IExplosivesDetector explosivesDetector) {
        this.uuid = UUID.randomUUID().toString();
        this.securityCheckID = securityCheckID;
        this.airport = airport;
        this.baggageScanner = baggageScanner;
        this.bodyScanner = bodyScanner;
        this.explosivesDetector = explosivesDetector;
        scanPatternList = new ArrayList<String>();
        scanPatternList.add("drug");
        scanPatternList.add("explosive");
        scanPatternList.add("knife");
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
        bodyScanner.logout();
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
    public boolean scan(Passenger passenger) {
        boolean ret = false;
        for(String pattern:scanPatternList) {
            if(bodyScanner.scan(passenger, pattern)) {
                ret = true;
            }
        }
        return ret;
    }

    @Override
    public boolean scan(Passenger passenger, CottonPad cottonPad) {
        return bodyScanner.scan(passenger, cottonPad);
    }

    @Override
    public boolean scan(Baggage baggage) {
        boolean ret = false;
        for(String pattern:scanPatternList) {
            if(baggageScanner.scan(baggage, pattern)) {
                ret = true;
            }
        }
        return ret;
    }

    @Override
    public boolean scan(Baggage baggage, CottonPad cottonPad) {
        return baggageScanner.scan(baggage, cottonPad);
    }

    @Override
    public void notifyGroundOperation(SecurityCheckReceipt securityCheckReceipt) {
        //TODO
    }
}