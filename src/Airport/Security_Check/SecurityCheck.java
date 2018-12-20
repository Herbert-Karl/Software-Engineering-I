package Airport.Security_Check;

import Airport.Airport.Airport;
import Airport.Base.*;
import Airport.Federal_Police.FederalPolice;
import Airport.Federal_Police.FederalPoliceOfficer;
import Airport.Scanner.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SecurityCheck implements ISecurityCheck {

    private String uuid;
    private SecurityCheckID securityCheckID;
    private Airport airport;
    private List<Employee> employeeList;
    private List<String> scanPatternList;
    private IBaggageScanner baggageScanner;
    private IBodyScanner bodyScanner;
    private IExplosivesDetector explosivesDetector;
    private SecurityCheckReceipt securityCheckReceipt;


    public SecurityCheck(SecurityCheckID securityCheckID, Airport airport) {
        this.uuid = UUID.randomUUID().toString();
        this.securityCheckID = securityCheckID;
        this.airport = airport;

        this.baggageScanner = new BaggageScanner( "baggage", StringSearchAlgorithm.JAVASTRINGCONTAINS);
        this.bodyScanner = new BodyScanner(securityCheckID.toString(), "body", StringSearchAlgorithm.JAVASTRINGCONTAINS);
        this.explosivesDetector = new ExplosivesDetector(securityCheckID.toString(), "explosive", StringSearchAlgorithm.JAVASTRINGCONTAINS);
        securityCheckReceipt = new SecurityCheckReceipt(securityCheckID);
        employeeList = new ArrayList<>();



        for(int i = 0; i < 3; i++) {
            Employee employee = airport.getResourcePool().takeResource("Employee");
            securityCheckReceipt.addEmployee(employee);
            registerEmployee(employee);
            employeeList.add(i, employee);
        }

        loginBaggageScanner(employeeList.get(0), employeeList.get(0).getIdCard().getPassword());
        loginBodyScanner(employeeList.get(1), employeeList.get(1).getIdCard().getPassword());
        loginExplosivesDetector(employeeList.get(2), employeeList.get(2).getIdCard().getPassword());

        scanPatternList = new ArrayList<>();
        scanPatternList.add("drug");
        scanPatternList.add("explosive");
        scanPatternList.add("knife");
    }

    @Override
    public void registerEmployee(Employee employee) {
        baggageScanner.register(employee);
        bodyScanner.register(employee);
        explosivesDetector.register(employee);
        employeeList.add(employee);
    }

    @Override
    public void unregisterEmployee(Employee employee) {
        baggageScanner.unregister(employee);
        bodyScanner.unregister(employee);
        explosivesDetector.unregister(employee);
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
        boolean ret = true;
        for (String pattern : scanPatternList) {
            if (!bodyScanner.scan(passenger, pattern)) {
                ret = false;
            }
        }
        securityCheckReceipt.setNumberOfPassengerScanned(securityCheckReceipt.getNumberOfPassengerScanned() + 1);
        return ret;
    }

    @Override
    public boolean scan(CottonPad cottonPad) {
        return explosivesDetector.scan(cottonPad);
    }

    @Override
    public boolean scan(Baggage baggage) {
        boolean ret = true;
        for (String pattern : scanPatternList) {
            if (!baggageScanner.scan(baggage, pattern)) {
                ret = false;
            }
        }
        securityCheckReceipt.setNumberOfBaggageScanned(securityCheckReceipt.getNumberOfBaggageScanned() + 1);
        if (!ret) {
            securityCheckReceipt.setNumberOfDangeroursBaggage(securityCheckReceipt.getNumberOfDangerousBaggage() + 1);
        }
        return ret;
    }

    @Override
    public void notifyGroundOperation() {
        //Todo
    }
}