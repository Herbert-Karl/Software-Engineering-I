package Airport.Baggage_Sorting_Unit;

import Airport.Airport.GateID;
import Airport.Baggage_Sorting_Unit.Vehicles.BaggageVehicle;
import Airport.Baggage_Sorting_Unit.Vehicles.ContainerLifter;
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
    void scanBulkyBaggage() throws IOException
    {
        ArrayList<Baggage> baggageTestList = new ArrayList<Baggage>();

        for (int i = 1; i <= 45; i++) {
            File file = new File("Tests\\TestData\\bulky_baggage\\bulky_baggage_" + i);
            Scanner sc = new Scanner(file);

            String data = "";

            while (sc.hasNextLine())
                data = data + sc.nextLine();

            Baggage baggage = new BulkyBaggage(data, 100, null, null);
            baggageTestList.add(baggage);
        }

        for (Baggage baggage : baggageTestList) {
            if (baggage == baggageTestList.get(39))
                assertTrue(baggageSortingUnit.scan(baggage, "drugs"));
            else
                assertFalse(baggageSortingUnit.scan(baggage, "drugs"));
        }

        for (Baggage baggage : baggageTestList) {
            assertFalse(baggageSortingUnit.scan(baggage, "glock7"));
        }

        for (Baggage baggage : baggageTestList) {
            if (baggage == baggageTestList.get(19))
                assertTrue(baggageSortingUnit.scan(baggage, "exp!os!ve"));
            else
                assertFalse(baggageSortingUnit.scan(baggage, "exp!os!ve"));
        }

        for (Baggage baggage : baggageTestList) {
            assertFalse(baggageSortingUnit.scan(baggage, "knife "));
        }
    }

    @Test
    void scanNormalBaggage() throws IOException
    {
        ArrayList<Baggage> baggageTestList = new ArrayList<Baggage>();

        for (int i = 1; i <= 725; i++) {
            File file = new File("Tests\\TestData\\bulky_baggage\\normal_baggage_" + i);
            Scanner sc = new Scanner(file);

            String data = "";

            while (sc.hasNextLine())
                data = data + sc.nextLine();

            Baggage baggage = new BulkyBaggage(data, 100, null, null);
            baggageTestList.add(baggage);
        }

        for (Baggage baggage : baggageTestList) {
            if (baggage == baggageTestList.get(590))
                assertTrue(baggageSortingUnit.scan(baggage, "drugs"));
            else
                assertFalse(baggageSortingUnit.scan(baggage, "drugs"));
        }

        for (Baggage baggage : baggageTestList) {
            assertFalse(baggageSortingUnit.scan(baggage, "glock7"));
        }

        for (Baggage baggage : baggageTestList) {
            assertFalse(baggageSortingUnit.scan(baggage, "exp!os!ve"));
        }

        for (Baggage baggage : baggageTestList) {
            assertFalse(baggageSortingUnit.scan(baggage, "knife "));
        }
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
        BaggageVehicle baggageVehicle = new BaggageVehicle("uuid", "id", "type", baggageSortingUnit);
        ContainerLifter containerLifter = new ContainerLifter("uuid", "id", "type");
        baggageVehicle.setContainerLifter(containerLifter);
        baggageVehicle.setGate(GateID.A01);

        baggageSortingUnit.sendContainerLifterToGate();
        assertFalse(containerLifter.isFlashingLightOn());
        assertEquals(0, containerLifter.getSpeedInMPH());
        assertEquals(GateID.A01, containerLifter.getGate().getGateID());
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