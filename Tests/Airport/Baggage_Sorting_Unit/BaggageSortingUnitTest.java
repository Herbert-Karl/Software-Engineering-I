package Airport.Baggage_Sorting_Unit;

import Airport.Airport.GateID;
import Airport.Baggage_Sorting_Unit.Loading.LoadingStrategy;
import Airport.Baggage_Sorting_Unit.Vehicles.BaggageVehicle;
import Airport.Baggage_Sorting_Unit.Vehicles.ContainerLifter;
import Airport.Base.*;
import Airport.Customs.Customs;
import Airport.Customs.CustomsOfficer;
import Airport.Customs.CustomsResourcePool;
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
            baggageList.add(new NormalBaggage("content"));
        }

        baggageSortingUnit = new BaggageSortingUnit(new ArrayList<Employee>(), baggageScanner, new DestinationBox(null, baggageList,
                100), new Customs());
    }

    @Test
    void executeRequest() {
    }

    /**
     * Done
     */
    @Test
    void loginBaggageScanner() {
        Employee employee = new Employee(1,"name", Gender.Male);
        IDCard idCard = new IDCard();
        idCard.setEmployee(employee);
        idCard.setPassword("password");
        employee.setIdCard(idCard);
        baggageScanner.register(employee);
        baggageSortingUnit.loginBaggageScanner(employee, "password");
        assertEquals(baggageScanner.getEmployee(), employee);
    }

    /**
     * Done
     */
    @Test
    void logoutBaggageScanner() {
        baggageSortingUnit.logoutBaggageScanner();
        assertNull(baggageScanner.getEmployee());
    }

    /**
     * TODO move data to folder TestData
     * @throws IOException
     */
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

            Baggage baggage = new BulkyBaggage(data);
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

    /**
     * TODO move data to folder TestData
     * @throws IOException
     */
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

            Baggage baggage = new BulkyBaggage(data);
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

    /**
     * TODO singleton CustomsResourcePool
     */
    @Test
    void handOverToCustoms() {
        CustomsOfficer customsOfficer = new CustomsOfficer();
        CustomsResourcePool customsResourcePool = new CustomsResourcePool();
        customsResourcePool.getCustomsOfficerList().add(customsOfficer);
        Baggage baggage = baggageList.get(0);
        baggageSortingUnit.handOverToCustoms(baggage);
        assertFalse(baggageList.contains(baggage));
    }

    /**
     * TODO
     */
    @Test
    void throwOff() {
    }

    /**
     * Done
     */
    @Test
    void emptyDestinationBox() {
        baggageSortingUnit.emptyDestinationBox();
        assertEquals(baggageList, baggageSortingUnit.getBaggageDepot().getBaggageList());
        assertEquals(0, baggageSortingUnit.getDestinationBox().getBaggageList().size());
    }

    /**
     * TODO singleton Airport for setGate(GateID.A01)
     */
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

    /**
     * TODO
     */
    @Test
    void optimizeAirplaneLoading() {
    }

    /**
     * TODO
     */
    @Test
    void loadBaggageVehicle() {
    }

    /**
     * TODO
     */
    @Test
    void sendBaggageVehicleToGate() {
        baggageSortingUnit.sendBaggageVehicleToGate();
    }

    /**
     * TODO
     */
    @Test
    void notifyGroundOperations() {
    }

    /**
     * Done
     */
    @Test
    void returnEmptyLuggageTubToCheckInDesk() {
        ArrayList<LuggageTub> luggageTubs = baggageSortingUnit.getEmptyLuggageTubList();
        luggageTubs.add(new LuggageTub("barCode", "barCodeDestinationBox", null));
        baggageSortingUnit.returnEmptyLuggageTubToCheckInDesk();
        assertEquals(0, luggageTubs.size());
    }
}