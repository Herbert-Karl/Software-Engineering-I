package Airport.Customs;

import Airport.Base.Baggage;
import Airport.Base.Employee;
import Airport.Base.Gender;
import Airport.Base.NormalBaggage;
import Airport.Scanner.BaggageScanner;
import Airport.Scanner.StringSearchAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomsTest {
    private Customs customs;
    private Employee employee;
    private BaggageScanner baggageScanner;
    private Baggage baggage;
    private List<String> scanPatternList;


    @BeforeEach
    void setUp() {
        customs = new Customs();
        employee = new Employee(1,"paul", Gender.Male);
        baggageScanner = new BaggageScanner( "baggage", StringSearchAlgorithm.JAVASTRINGCONTAINS);

        scanPatternList = new ArrayList<>();
        scanPatternList.add("drug");
        scanPatternList.add("explosive");
        scanPatternList.add("knife");
    }

    @Test
    void loginBaggageScanner() {
        assertTrue(customs.loginBaggageScanner(employee,"SHA-265"));
        assertFalse(customs.loginBaggageScanner(employee,"falsch"));
    }

    @Test
    void logoutBaggageScanner() {
        customs.logoutBaggageScanner();
        assertNull(baggageScanner.getEmployee());
    }

    @Test
    void scan() {
        baggage = new NormalBaggage("content");
        assertTrue(customs.scan(baggage,baggageScanner,"test"));
        baggage = new NormalBaggage("knife");
        assertFalse(customs.scan(baggage,baggageScanner,"knife"));
    }

    @Test
    void executeRequest() {

    }

    @Test
    void handOverBaggageToFederalPolice() {

    }

    @Test
    void handOverItemsToFederalPolice() {
    }

    @Test
    void notifyGroundOperations() {
    }
}