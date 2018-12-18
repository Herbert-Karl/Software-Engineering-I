package Airport.Baggage_Sorting_Unit;

import Airport.Base.*;
import Airport.Customs.Customs;
import Airport.Scanner.BaggageScanner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BaggageSortingUnitTest {
    private BaggageSortingUnit baggageSortingUnit;
    private ArrayList<Baggage> baggageList;
    private BaggageScanner baggageScanner;

    @BeforeEach
    void setup() {
        baggageList = new ArrayList<Baggage>();
        baggageScanner = new BaggageScanner();

        for (int i = 0; i < 10; i++) {
            baggageList.add(new NormalBaggage("content", 100,
                    new BaggageIdentificationTag(null, "flight", 100, null, "barcode" + i)));
        }

        baggageSortingUnit = new BaggageSortingUnit(new ArrayList<Employee>(), baggageScanner, new DestinationBox(null, baggageList,
                100), new Customs());
    }

    @Test
    void executeRequest() {
    }

    @Test
    void loginBaggageScanner() {
    }

    @Test
    void logoutBaggageScanner() {
        baggageSortingUnit.logoutBaggageScanner();
        assertNull(baggageScanner.getEmployee());
    }

    @Test
    void scan() throws IOException
    {
        File file = new File("");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }

    @Test
    void handOverToCustoms() {
    }

    @Test
    void throwOff() {
    }

    @Test
    void emptyDestinationBox() {
        baggageSortingUnit.emptyDestinationBox();
        assertEquals(baggageList, baggageSortingUnit.getBaggageDepot().getBaggageList());
        assertEquals(0, baggageSortingUnit.getDestinationBox().getBaggageList().size());
    }

    @Test
    void sendContainerLifterToGate() {
    }

    @Test
    void optimizeAirplaneLoading() {
    }

    @Test
    void loadBaggageVehicle() {
    }

    @Test
    void sendBaggageVehicleToGate() {
    }

    @Test
    void notifyGroundOperations() {
    }

    @Test
    void returnEmptyLuggageTubToCheckInDesk() {
    }
}