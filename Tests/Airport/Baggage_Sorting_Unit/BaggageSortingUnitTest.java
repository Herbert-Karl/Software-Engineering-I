package Airport.Baggage_Sorting_Unit;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Configuration;
import Airplane.stowage_cargo.FrontStowage;
import Airplane.stowage_cargo.FrontStowagePosition;
import Airplane.stowage_cargo.FrontStowagePositionID;
import Airport.Airport.Airport;
import Airport.Airport.GateID;
import Airport.Baggage_Sorting_Unit.Loading.LoadingStrategy;
import Airport.Baggage_Sorting_Unit.Receipts.BaggageSortingUnitReceipt;
import Airport.Baggage_Sorting_Unit.Storage.BaggageSortingUnitRoboter;
import Airport.Baggage_Sorting_Unit.Vehicles.BaggageVehicle;
import Airport.Baggage_Sorting_Unit.Vehicles.ContainerLifter;
import Airport.Base.*;
import Airport.Customs.Customs;
import Airport.Customs.CustomsOfficer;
import Airport.Customs.CustomsResourcePool;
import Airport.Scanner.BaggageScanner;
import Airport.Scanner.StringSearchAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class BaggageSortingUnitTest {
    private BaggageSortingUnit baggageSortingUnit;
    private ArrayList<Baggage> baggageList;
    private BaggageScanner baggageScanner;
    private final String path = "C:\\TestData\\";

    @BeforeEach
    void setup() {
        Airport airport = Airport.getInstance();
        airport = null;
        airport = Airport.getInstance();
        airport.build();

        baggageList = new ArrayList<Baggage>();
        baggageScanner = new BaggageScanner("type", StringSearchAlgorithm.BITAP);

        for (int i = 0; i < 10; i++) {
            baggageList.add(new NormalBaggage("content"));
        }

        baggageSortingUnit = new BaggageSortingUnit(new ArrayList<Employee>(), baggageScanner, new DestinationBox(null, baggageList,
                100), new Customs(), new BaggageSortingUnitRoboter(baggageSortingUnit, "type"));
    }

    /**
     * Done
     */
    @Test
    void executeRequest() {
        BaggageVehicle baggageVehicle = new BaggageVehicle("type", baggageSortingUnit);
        baggageSortingUnit.setBaggageVehicle(baggageVehicle);

        Stack<Baggage> baggages1 = new Stack<Baggage>();
        for (int i = 0; i < 10; i++) {
            NormalBaggage normalBaggage = new NormalBaggage("content");
            normalBaggage.setWeight(5);
            baggages1.add(normalBaggage);
        }
        Container container1 = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null,
                "barCodeIDCatagory", "qrCodeIDCatagory", baggages1);

        Stack<Baggage> baggages2 = new Stack<Baggage>();
        for (int i = 0; i < 10; i++) {
            NormalBaggage normalBaggage = new NormalBaggage("content");
            normalBaggage.setWeight(10);
            baggages2.add(normalBaggage);
        }
        Container container2 = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null,
                "barCodeIDCatagory", "qrCodeIDCatagory", baggages2);

        Stack<Baggage> baggages3 = new Stack<Baggage>();
        for (int i = 0; i < 10; i++) {
            NormalBaggage normalBaggage = new NormalBaggage("content");
            normalBaggage.setWeight(20);
            baggages3.add(normalBaggage);
        }
        Container container3 = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null,
                "barCodeIDCatagory", "qrCodeIDCatagory", baggages3);

        baggageSortingUnit.getFilledContainerList().add(container1);
        baggageSortingUnit.getFilledContainerList().add(container2);
        baggageSortingUnit.getFilledContainerList().add(container3);

        Airplane airplane = new Airplane(new Configuration(10, 10, 10,
                10, 10));

        Airport.getInstance().getGatefromID(GateID.A01).connect(airplane);

        baggageSortingUnit.executeRequest(GateID.A01);

        assertEquals(0, baggageSortingUnit.getFilledContainerList().size());

        for (FrontStowagePosition frontStowagePosition : ((FrontStowage)airplane.getBody().getCargoSystemArrayList().get(0).getFrontStowage()).getPositionList()) {
            if (frontStowagePosition.getId() == FrontStowagePositionID.SFL07)
                assertEquals(container1, frontStowagePosition.getContainer());
            if (frontStowagePosition.getId() == FrontStowagePositionID.SFL06)
                assertEquals(container2, frontStowagePosition.getContainer());
            if (frontStowagePosition.getId() == FrontStowagePositionID.SFR07)
                assertEquals(container3, frontStowagePosition.getContainer());
        }
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
     * Done
     * @throws IOException
     */
    @Test
    void scanBulkyBaggage() throws IOException
    {
        ArrayList<Baggage> baggageTestList = new ArrayList<Baggage>();

        for (int i = 1; i <= 45; i++) {
            File file = new File(path + "bulky_baggage\\bulky_baggage_" + i);
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
     * Done
     * @throws IOException
     */
    @Test
    void scanNormalBaggage() throws IOException
    {
        ArrayList<Baggage> baggageTestList = new ArrayList<Baggage>();

        for (int i = 1; i <= 725; i++) {
            File file = new File(path + "normal_baggage\\normal_baggage_" + i);
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
     * Done
     */
    @Test
    void handOverToCustoms() {
        Baggage baggage = baggageList.get(0);
        baggageSortingUnit.handOverToCustoms(baggage);
        assertFalse(baggageList.contains(baggage));
        assertTrue(Airport.getInstance().getCustoms().getKeepSafeBaggageList().contains(baggage));
    }

    /**
     * Done
     */
    @Test
    void throwOff() {
        NormalBaggage normalBaggage = new NormalBaggage("content");
        LuggageTub luggageTub = new LuggageTub("barCode", "barCodeDestinationBox", normalBaggage);
        DestinationBox destinationBox = new DestinationBox(null, new ArrayList<Baggage>(), 70);
        baggageSortingUnit.throwOff(luggageTub, destinationBox);

        assertNull(luggageTub.getBaggage());
        assertTrue(destinationBox.getBaggageList().contains(normalBaggage));
        assertTrue(baggageSortingUnit.getEmptyLuggageTubList().contains(luggageTub));
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
     * Done
     */
    @Test
    void sendContainerLifterToGate() {
        BaggageVehicle baggageVehicle = new BaggageVehicle("type", baggageSortingUnit);
        ContainerLifter containerLifter = new ContainerLifter("type");
        baggageVehicle.setContainerLifter(containerLifter);
        baggageVehicle.setGate(GateID.A01);

        baggageSortingUnit.sendContainerLifterToGate();
        assertFalse(containerLifter.isFlashingLightOn());
        assertEquals(0, containerLifter.getSpeedInMPH());
        assertEquals(GateID.A01, containerLifter.getGate().getGateID());
    }

    /**
     * Done
     */
    @Test
    void optimizeAirplaneLoading() {
        Stack<Baggage> baggages1 = new Stack<Baggage>();
        for (int i = 0; i < 10; i++) {
            NormalBaggage normalBaggage = new NormalBaggage("content");
            normalBaggage.setWeight(5);
            baggages1.add(normalBaggage);
        }
        Container container1 = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null,
                "barCodeIDCatagory", "qrCodeIDCatagory", baggages1);

        Stack<Baggage> baggages2 = new Stack<Baggage>();
        for (int i = 0; i < 10; i++) {
            NormalBaggage normalBaggage = new NormalBaggage("content");
            normalBaggage.setWeight(10);
            baggages2.add(normalBaggage);
        }
        Container container2 = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null,
                "barCodeIDCatagory", "qrCodeIDCatagory", baggages2);

        Stack<Baggage> baggages3 = new Stack<Baggage>();
        for (int i = 0; i < 10; i++) {
            NormalBaggage normalBaggage = new NormalBaggage("content");
            normalBaggage.setWeight(20);
            baggages3.add(normalBaggage);
        }
        Container container3 = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null,
                "barCodeIDCatagory", "qrCodeIDCatagory", baggages3);

        baggageSortingUnit.getFilledContainerList().add(container1);
        baggageSortingUnit.getFilledContainerList().add(container2);
        baggageSortingUnit.getFilledContainerList().add(container3);

        LoadingStrategy loadingStrategy = baggageSortingUnit.optimizeAirplaneLoading();

        ArrayList<FrontStowagePosition> frontStowagePositions = ((FrontStowage)loadingStrategy.getStowage()).getPositionList();

        assertEquals(container1, frontStowagePositions.get(0).getContainer());
        assertEquals(FrontStowagePositionID.SFL01, frontStowagePositions.get(0).getId());

        assertEquals(container2, frontStowagePositions.get(1).getContainer());
        assertEquals(FrontStowagePositionID.SFL02, frontStowagePositions.get(1).getId());

        assertEquals(container3, frontStowagePositions.get(2).getContainer());
        assertEquals(FrontStowagePositionID.SFR01, frontStowagePositions.get(2).getId());
    }

    /**
     * Done
     */
    @Test
    void loadBaggageVehicle() {
        Stack<Baggage> baggages1 = new Stack<Baggage>();
        for (int i = 0; i < 10; i++) {
            NormalBaggage normalBaggage = new NormalBaggage("content");
            normalBaggage.setWeight(5);
            baggages1.add(normalBaggage);
        }
        Container container1 = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null,
                "barCodeIDCatagory", "qrCodeIDCatagory", baggages1);

        Stack<Baggage> baggages2 = new Stack<Baggage>();
        for (int i = 0; i < 10; i++) {
            NormalBaggage normalBaggage = new NormalBaggage("content");
            normalBaggage.setWeight(10);
            baggages2.add(normalBaggage);
        }
        Container container2 = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null,
                "barCodeIDCatagory", "qrCodeIDCatagory", baggages2);

        Stack<Baggage> baggages3 = new Stack<Baggage>();
        for (int i = 0; i < 10; i++) {
            NormalBaggage normalBaggage = new NormalBaggage("content");
            normalBaggage.setWeight(20);
            baggages3.add(normalBaggage);
        }
        Container container3 = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null,
                "barCodeIDCatagory", "qrCodeIDCatagory", baggages3);

        baggageSortingUnit.getFilledContainerList().add(container1);
        baggageSortingUnit.getFilledContainerList().add(container2);
        baggageSortingUnit.getFilledContainerList().add(container3);

        LoadingStrategy loadingStrategy = new LoadingStrategy(new ArrayList<String>());
        FrontStowage frontStowage = new FrontStowage();
        FrontStowagePosition frontStowagePosition = new FrontStowagePosition(FrontStowagePositionID.SFL07, container1);
        frontStowage.getPositionList().add(frontStowagePosition);
        frontStowagePosition = new FrontStowagePosition(FrontStowagePositionID.SFL06, container2);
        frontStowage.getPositionList().add(frontStowagePosition);
        frontStowagePosition = new FrontStowagePosition(FrontStowagePositionID.SFR07, container3);
        frontStowage.getPositionList().add(frontStowagePosition);

        BaggageVehicle baggageVehicle = new BaggageVehicle("type", baggageSortingUnit);
        baggageVehicle.setGate(GateID.A01);
        Airplane airplane = new Airplane(new Configuration(10, 10, 10,
        10, 10));
        Airport.getInstance().getGatefromID(GateID.A01).setAirplane(airplane);
        baggageSortingUnit.setBaggageVehicle(baggageVehicle);

        baggageSortingUnit.loadBaggageVehicle(loadingStrategy);

        for (FrontStowagePosition frontStowagePosition1 : ((FrontStowage)airplane.getBody().getCargoSystemArrayList().get(0)
        .getFrontStowage()).getPositionList()) {
            if (frontStowagePosition1.getId() == FrontStowagePositionID.SFL07)
                assertEquals(container1, frontStowagePosition1.getContainer());

            if (frontStowagePosition1.getId() == FrontStowagePositionID.SFL06)
                assertEquals(container2, frontStowagePosition1.getContainer());

            if (frontStowagePosition1.getId() == FrontStowagePositionID.SFR07)
                assertEquals(container3, frontStowagePosition1.getContainer());
        }
    }

    /**
     * Done
     */
    @Test
    void sendBaggageVehicleToGate() {
        BaggageVehicle baggageVehicle = new BaggageVehicle("type", baggageSortingUnit);
        baggageSortingUnit.setBaggageVehicle(baggageVehicle);
        baggageSortingUnit.sendBaggageVehicleToGate();

        Container container = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null, "barCodeIDCatagory",
                "qrCodeIDCatagory", new Stack<Baggage>());
        baggageVehicle.store(container);
        ContainerLifter containerLifter = new ContainerLifter("type");
        baggageVehicle.connect(containerLifter);

        baggageVehicle.executeRequest(GateID.A01);
        assertEquals(Airport.getInstance().getGatefromID(GateID.A01), baggageVehicle.getGate());
        assertEquals(0, baggageVehicle.getSpeedInMPH());
        assertFalse(baggageVehicle.isFlashingLightOn());
        assertEquals(container, containerLifter.getContainer());
        assertNull(baggageVehicle.getContainerLifter());
        assertEquals(baggageVehicle, baggageSortingUnit.getVehicle());
    }

    /**
     * Done
     */
    @Test
    void notifyGroundOperations() {
        BaggageSortingUnitReceipt baggageSortingUnitReceipt = new BaggageSortingUnitReceipt(10,
                10, 10, 10, 10,
                null, 10, 10);
        baggageSortingUnit.notifyGroundOperations(baggageSortingUnitReceipt);
        assertTrue(Airport.getInstance().getGroundOperationsCenter().getBaggageSortingUnitReceiptList().contains(baggageSortingUnitReceipt));
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