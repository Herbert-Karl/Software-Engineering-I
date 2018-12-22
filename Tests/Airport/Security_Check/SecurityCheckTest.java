package Airport.Security_Check;

import Airport.Airport.Airport;
import Airport.Base.*;
import Airport.Scanner.BaggageScanner;
import Airport.Scanner.BodyScanner;
import Airport.Scanner.ExplosivesDetector;
import Airport.Scanner.StringSearchAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SecurityCheckTest {
    private SecurityCheck securityCheck;
    private SecurityCheckID securityCheckID;
    private Airport airport;
    private BaggageScanner baggageScanner;
    private BodyScanner bodyScanner;
    private ExplosivesDetector explosivesDetector;
    private SecurityCheckReceipt securityCheckReceipt;
    private Employee employee;
    private List<Employee> employeeList;
    private List<String> scanPatternList;
    private Passenger passenger;
    private CottonPad cottonPad;
    private Baggage baggage;

    @BeforeEach
    void setUp(){
        securityCheck = new SecurityCheck(securityCheckID,airport);
        baggageScanner = new BaggageScanner( "baggage", StringSearchAlgorithm.JAVASTRINGCONTAINS);
        bodyScanner = new BodyScanner(securityCheckID.toString(), "body", StringSearchAlgorithm.JAVASTRINGCONTAINS);
        explosivesDetector = new ExplosivesDetector(securityCheckID.toString(), "explosive", StringSearchAlgorithm.JAVASTRINGCONTAINS);
        securityCheckReceipt = new SecurityCheckReceipt(securityCheckID);
        employeeList = new ArrayList<>();
        employee = airport.getResourcePool().takeResource("Employee");
        employeeList.add(0, employee);
        passenger = new Passenger();
        cottonPad = new CottonPad("surface");


        scanPatternList = new ArrayList<>();
        scanPatternList.add("drug");
        scanPatternList.add("explosive");
        scanPatternList.add("knife");
    }

    @Test
    void registerEmployee() {
        securityCheck.registerEmployee(employee);
        assertNotNull(baggageScanner.getEmployee());
        assertNotNull(bodyScanner.getEmployee());
        assertNotNull(explosivesDetector.getEmployee());
        assertEquals(employeeList,securityCheck.getEmployeeList());

    }

    @Test
    void unregisterEmployee() {
        securityCheck.unregisterEmployee(employee);
        assertNull(baggageScanner.getEmployee());
        assertNull(bodyScanner.getEmployee);
        assertNull(explosivesDetector.getEmployee);
    }

    @Test
    void loginBaggageScanner() {
        assertTrue(securityCheck.loginBaggageScanner(employee,"SHA-265"));
        assertFalse(securityCheck.loginBaggageScanner(employee,"falsch"));
    }

    @Test
    void logoutBaggageScanner() {
        securityCheck.logoutBaggageScanner();
        assertNull(baggageScanner.getEmployee());
    }

    @Test
    void loginBodyScanner() {
        assertTrue(securityCheck.loginBodyScanner(employee,"SHA-265"));
        assertFalse(securityCheck.loginBodyScanner(employee,"falsch"));
    }

    @Test
    void logoutBodyScanner() {
        securityCheck.logoutBaggageScanner();
        assertNull(bodyScanner.getEmployee);
    }

    @Test
    void loginExplosivesDetector() {
        assertTrue(securityCheck.loginExplosivesDetector(employee,"SHA-265"));
        assertFalse(securityCheck.loginExplosivesDetector(employee,"falsch"));
    }

    @Test
    void logoutExplosivesDetector() {
        securityCheck.logoutExplosivesDetector();
        assertNull(explosivesDetector.getEmployee);
    }

    @Test
    void scan() {
        assertTrue(securityCheck.scan(passenger));
    }

    @Test
    void scan1() {
        assertTrue(securityCheck.scan(cottonPad));
    }

    @Test
    void scan2() {
        baggage = new NormalBaggage("content");
        assertTrue(securityCheck.scan(baggage));
        baggage = new NormalBaggage("knife");
        assertFalse(securityCheck.scan(baggage));
    }

    @Test
    void notifyGroundOperation() {

    }
}