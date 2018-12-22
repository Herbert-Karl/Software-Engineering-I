package Airport.AirCargoPalletLifter;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Configuration;
import Airplane.stowage_cargo.RearStowage;
import Airplane.stowage_cargo.RearStowagePosition;
import Airplane.stowage_cargo.RearStowagePositionID;
import Airport.Airport.Airport;
import Airport.Airport.GateID;
import Airport.Base.*;
import Airport.Customs.Customs;
import Airport.Scanner.BaggageScanner;
import Airport.Scanner.ItemScanner;
import Airport.Scanner.StringSearchAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class AirCargoPalletPackingUnitTest {
    private AirCargoPalletPackingUnit airCargoPalletPackingUnit;
    private ArrayList<AirCargoPallet> airCargoPallets;
    private BaggageScanner baggageScanner;
    private final String path = "C:\\TestData\\";

    @BeforeEach
    void setup() {
        Airport airport = Airport.getInstance();
        airport = null;
        airport = Airport.getInstance();
        airport.build();

        airCargoPallets = new ArrayList<AirCargoPallet>();
        ItemScanner itemScanner = new ItemScanner("id", "type", StringSearchAlgorithm.BITAP);

        for (int i = 0; i < 10; i++) {
            AirCargoPallet airCargoPallet = new AirCargoPallet("uuid", "type", "id");
            for (int j = 0; j < 10; j++)
                airCargoPallet.getItemList()[j] = new Item(j, "content", 10);
            airCargoPallets.add(airCargoPallet);
        }

        airCargoPalletPackingUnit = new AirCargoPalletPackingUnit(new ArrayList<AirCargoPallet>(), new ArrayList<String>(),
                itemScanner, new ArrayList<AirCargoPallet>(), new AirCargoPalletVehicle("uuid", "id", "type", 0,
                false, null, null, null), null);
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
        airCargoPalletPackingUnit.loginItemScanner(employee, "password");
        assertEquals(baggageScanner.getEmployee(), employee);
    }

    /**
     * Done
     */
    @Test
    void logoutBaggageScanner() {
        airCargoPalletPackingUnit.logoutItemScanner();
        assertNull(baggageScanner.getEmployee());
    }

    /**
     * Done
     * @throws IOException
     */
    @Test
    void scanAirCargoPallets() throws IOException
    {
        ArrayList<Item> items = new ArrayList<Item>();

        for (int i = 1; i <= 7; i++) {
            String newPath = path + "air_cargo\\pallets_" + i + "\\";
            for (int j = 1; j < 2000; j++) {
                File file = new File(newPath + "air_cargo_item_" + j);
                Scanner sc = new Scanner(file);

                String data = "";

                while (sc.hasNextLine())
                    data = data + sc.nextLine();

                Item item = new Item(i, data, j);
                items.add(item);
            }
        }

        for (Item item : items) {
            if ((item.getId() == 5 && item.getWeight() == 1228) || (item.getId() == 7 && item.getWeight() == 1941))
                assertTrue(airCargoPalletPackingUnit.scan(item, "drugs"));
            else
                assertFalse(airCargoPalletPackingUnit.scan(item, "drugs"));
        }

        for (Item item : items) {
            assertFalse(airCargoPalletPackingUnit.scan(item, "glock7"));
        }

        for (Item item : items) {
            assertFalse(airCargoPalletPackingUnit.scan(item, "exp!os!ve"));
        }

        for (Item item : items) {
            assertFalse(airCargoPalletPackingUnit.scan(item, "knife "));
        }
    }

    /**
     * Done
     */
    @Test
    void setAirCargoPalletVehicle() {
        airCargoPalletPackingUnit.setAirCargoPalletVehicle();

        assertNotNull(airCargoPalletPackingUnit.getAirCargoPalletVehicel());
    }

    /**
     * Done
     */
    @Test
    void handOverToCustoms() {
        Item item = airCargoPallets.get(0).getItemList()[0];
        airCargoPalletPackingUnit.handOverToCustoms(item);
        assertEquals(item, airCargoPallets.get(0).getItemList()[0]);
        assertTrue(Airport.getInstance().getCustoms().getKeepSafeItemList().contains(item));
    }

    /**
     * Done
     */
    @Test
    void sendAirCargoPalletLifterToGate() {
        AirCargoPalletVehicle airCargoPalletVehicle = new AirCargoPalletVehicle("uuid", "id", "type", 0,
        false, null, null, null);
        AirCargoPalletLifter airCargoPalletLifter = new AirCargoPalletLifter("uuid", "id", "type", 0,
                false, null, 0, null, null, null);
        airCargoPalletVehicle.setConnectedAirCargoPalletLifter(airCargoPalletLifter);
        airCargoPalletVehicle.setGate(GateID.A01);

        airCargoPalletPackingUnit.sendAirCargoPalletLifterToGate();
        assertFalse(airCargoPalletLifter.isFlashingLightOn());
        assertEquals(0, airCargoPalletLifter.getSpeedInMPH());
        assertEquals(GateID.A01, airCargoPalletLifter.getGate().getGateID());
    }

    /**
     * Done
     */
    @Test
    void optimizeAirplaneLoading() {
        Item[] items1 = new Item[500];
        for (int i = 0; i < 10; i++) {
            Item item = new Item(i, "content", 10);
            items1[i] = item;
        }
        AirCargoPallet airCargoPallet1 = new AirCargoPallet("uuid", "type", "id");
        airCargoPallet1.setItemList(items1);

        Item[] items2 = new Item[500];
        for (int i = 0; i < 10; i++) {
            Item item = new Item(i, "content", 10);
            items2[i] = item;
        }
        AirCargoPallet airCargoPallet2 = new AirCargoPallet("uuid", "type", "id");
        airCargoPallet2.setItemList(items1);

        Item[] items3 = new Item[500];
        for (int i = 0; i < 10; i++) {
            Item item = new Item(i, "content", 10);
            items3[i] = item;
        }
        AirCargoPallet airCargoPallet3 = new AirCargoPallet("uuid", "type", "id");
        airCargoPallet3.setItemList(items1);

        airCargoPalletPackingUnit.getFilledAirCargoPalletList().add(airCargoPallet1);
        airCargoPalletPackingUnit.getFilledAirCargoPalletList().add(airCargoPallet2);
        airCargoPalletPackingUnit.getFilledAirCargoPalletList().add(airCargoPallet3);

        LoadingStrategy loadingStrategy = airCargoPalletPackingUnit.optimizeAirplaneLoading();

        ArrayList<RearStowagePosition> frontStowagePositions = ((RearStowage)loadingStrategy.getStowage()).getPositionList();

        assertEquals(airCargoPallet1, frontStowagePositions.get(0).getAirCargoPallet());
        assertEquals(RearStowagePositionID.SR07, frontStowagePositions.get(0).getId());

        assertEquals(airCargoPallet2, frontStowagePositions.get(1).getAirCargoPallet());
        assertEquals(RearStowagePositionID.SR06, frontStowagePositions.get(1).getId());

        assertEquals(airCargoPallet3, frontStowagePositions.get(2).getAirCargoPallet());
        assertEquals(RearStowagePositionID.SR05, frontStowagePositions.get(2).getId());
    }

    /**
     * Done
     */
    @Test
    void loadAirCargoPalletVehicle() {
        Item[] items1 = new Item[500];
        for (int i = 0; i < 10; i++) {
            Item item = new Item(i, "content", 10);
            items1[i] = item;
        }
        AirCargoPallet airCargoPallet1 = new AirCargoPallet("uuid", "type", "id");
        airCargoPallet1.setItemList(items1);

        Item[] items2 = new Item[500];
        for (int i = 0; i < 10; i++) {
            Item item = new Item(i, "content", 10);
            items2[i] = item;
        }
        AirCargoPallet airCargoPallet2 = new AirCargoPallet("uuid", "type", "id");
        airCargoPallet2.setItemList(items1);

        Item[] items3 = new Item[500];
        for (int i = 0; i < 10; i++) {
            Item item = new Item(i, "content", 10);
            items3[i] = item;
        }
        AirCargoPallet airCargoPallet3 = new AirCargoPallet("uuid", "type", "id");
        airCargoPallet3.setItemList(items1);

        airCargoPalletPackingUnit.getFilledAirCargoPalletList().add(airCargoPallet1);
        airCargoPalletPackingUnit.getFilledAirCargoPalletList().add(airCargoPallet2);
        airCargoPalletPackingUnit.getFilledAirCargoPalletList().add(airCargoPallet3);

        LoadingStrategy loadingStrategy = new LoadingStrategy(new RearStowage(), null);
        RearStowage rearStowage = new RearStowage();
        RearStowagePosition rearStowagePosition = new RearStowagePosition(RearStowagePositionID.SR07, airCargoPallet1);
        rearStowage.getPositionList().add(rearStowagePosition);
        rearStowagePosition = new RearStowagePosition(RearStowagePositionID.SR06, airCargoPallet2);
        rearStowage.getPositionList().add(rearStowagePosition);
        rearStowagePosition = new RearStowagePosition(RearStowagePositionID.SR05, airCargoPallet3);
        rearStowage.getPositionList().add(rearStowagePosition);

        AirCargoPalletVehicle airCargoPalletVehicle = new AirCargoPalletVehicle("uuid", "id", "type", 0,
                false, null, null, null);
        airCargoPalletVehicle.setGate(GateID.A01);
        Airplane airplane = new Airplane(new Configuration(10, 10, 10,
                10, 10));
        Airport.getInstance().getGatefromID(GateID.A01).setAirplane(airplane);
        airCargoPalletPackingUnit.setAirCargoPalletVehicel(airCargoPalletVehicle);

        airCargoPalletPackingUnit.loadAirCargoPalletVehicle(loadingStrategy);

        for (RearStowagePosition rearStowagePosition1 : ((RearStowage)airplane.getBody().getCargoSystemArrayList().get(0)
                .getFrontStowage()).getPositionList()) {
            if (rearStowagePosition1.getId() == RearStowagePositionID.SR07)
                assertEquals(airCargoPallet1, rearStowagePosition1.getAirCargoPallet());

            if (rearStowagePosition1.getId() == RearStowagePositionID.SR06)
                assertEquals(airCargoPallet2, rearStowagePosition1.getAirCargoPallet());

            if (rearStowagePosition1.getId() == RearStowagePositionID.SR05)
                assertEquals(airCargoPallet3, rearStowagePosition1.getAirCargoPallet());
        }
    }

    /**
     * Done
     */
    @Test
    void sendAirCargoPalletVehicleToGate() {
        AirCargoPalletVehicle airCargoPalletVehicle = new AirCargoPalletVehicle("uuid", "id", "type", 0,
                false, null, null, null);
        airCargoPalletPackingUnit.setAirCargoPalletVehicel(airCargoPalletVehicle);
        airCargoPalletPackingUnit.sendAirCargoPalletVehicleToGate();

        AirCargoPallet airCargoPallet = new AirCargoPallet("uuid", "type", "id");
        airCargoPalletVehicle.store(airCargoPallet);
        AirCargoPalletLifter airCargoPalletLifter = new AirCargoPalletLifter("uuid", "id", "type", 0,
                false, null, 0, null, null, null);
        airCargoPalletVehicle.connect(airCargoPalletLifter);

        airCargoPalletVehicle.executeRequest(GateID.A01);
        assertEquals(Airport.getInstance().getGatefromID(GateID.A01), airCargoPalletVehicle.getGate());
        assertEquals(0, airCargoPalletVehicle.getSpeedInMPH());
        assertFalse(airCargoPalletVehicle.isFlashingLightOn());
        assertEquals(airCargoPallet, airCargoPalletLifter.getAirCargoPallet());
        assertNull(airCargoPalletVehicle.getConnectedAirCargoPalletLifter());
        assertEquals(airCargoPalletVehicle, airCargoPalletPackingUnit.getAirCargoPalletVehicel());
    }

    /**
     * Done
     */
    @Test
    void sort() {
        ArrayList<Item> itemArrayList = new ArrayList<Item>();

        for (int i = 1; i < 10; i++) {
            Item item = new Item(i, "content", i);
            itemArrayList.add(item);
        }

        airCargoPalletPackingUnit.sort(itemArrayList);


        for (int i = 0, j = 9; i < 10; i++, j--) {
            assertEquals(j, itemArrayList.get(0).getWeight());
        }
    }

    /**
     * Done
     */
    @Test
    void pack() {
        ArrayList<Item> itemArrayList = new ArrayList<Item>();

        for (int i = 1; i < 4000; i++) {
            Item item = new Item(i, "content", i);
            itemArrayList.add(item);
        }

        airCargoPalletPackingUnit.pack();

        assertEquals(2, airCargoPalletPackingUnit.getFilledAirCargoPalletList().size());
    }
}