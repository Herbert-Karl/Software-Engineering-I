package Airport.Baggage_Sorting_Unit.Storage;

import Airport.Airport.GateID;
import Airport.Baggage_Sorting_Unit.BaggageSortingUnit;
import Airport.Baggage_Sorting_Unit.Vehicles.BaggageVehicle;
import Airport.Base.*;
import Airport.Customs.Customs;
import Airport.Scanner.BaggageScanner;
import Airport.Scanner.StringSearchAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class BaggageSortingUnitRoboterTest
{
    private BaggageSortingUnitRoboter baggageSortingUnitRoboter;
    private BaggageSortingUnit baggageSortingUnit;

    @BeforeEach
    void setup() {
        baggageSortingUnit = new BaggageSortingUnit(new ArrayList<Employee>(), new BaggageScanner("type", StringSearchAlgorithm.BITAP),
                new DestinationBox(null, new ArrayList<Baggage>(), 100), new Customs());
        baggageSortingUnitRoboter = new BaggageSortingUnitRoboter(baggageSortingUnit, "uuid", "id", "type");
        baggageSortingUnit.setRoboter(baggageSortingUnitRoboter);

        for (int i = 0; i < 10; i++) {
            baggageSortingUnitRoboter.addBaggage(new NormalBaggage("content"));
        }
    }

    /**
     * Done
     */
    @Test
    void moveBaggageToDepot()
    {
        baggageSortingUnitRoboter.moveBaggageToDepot(baggageSortingUnitRoboter.getSelectedBaggageList());
        assertEquals(baggageSortingUnitRoboter.getSelectedBaggageList(), baggageSortingUnit.getBaggageDepot().getBaggageList());
    }

    /**
     * TODO
     */
    @Test
    void selectBaggageFromDepot()
    {
        for (int i = 0; i < 75; i++) {
            NormalBaggage normalBaggage = new NormalBaggage("content");
            normalBaggage.setBaggageIdentificationTag(
                    new BaggageIdentificationTag(
                            new BoardingPass(null, "flight", null,
                                    TicketClass.Economy, null, null, "date", GateID.A01, "boardingTime", "seat",
                                    null), "flight", 0, normalBaggage, "barcode"));
            baggageSortingUnit.getDepot().store(normalBaggage);
        }

        for (int i = 0; i < 75; i++) {
            NormalBaggage normalBaggage = new NormalBaggage("content");
            normalBaggage.setBaggageIdentificationTag(
                    new BaggageIdentificationTag(
                            new BoardingPass(null, "flight", null,
                                    TicketClass.Business, null, null, "date", GateID.A01, "boardingTime", "seat",
                                    null), "flight", 0, normalBaggage, "barcode"));
            baggageSortingUnit.getDepot().store(normalBaggage);
        }

        for (int i = 0; i < 75; i++) {
            NormalBaggage normalBaggage = new NormalBaggage("content");
            normalBaggage.setBaggageIdentificationTag(
                    new BaggageIdentificationTag(
                            new BoardingPass(null, "flight", null,
                                    TicketClass.First, null, null, "date", GateID.A01, "boardingTime", "seat",
                                    null), "flight", 0, normalBaggage, "barcode"));
            baggageSortingUnit.getDepot().store(normalBaggage);
        }

        for (int i = 0; i < 90; i++) {
            BulkyBaggage bulkyBaggage = new BulkyBaggage("content");
            baggageSortingUnit.getDepot().store(bulkyBaggage);
        }

        for (int i = 0; i < 300; i++) {
            baggageSortingUnit.getEmptyContainerList().add(new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null,
                    "barCodeIDCatagory", "qrCodeIDCatagory", new Stack<Baggage>()));
        }

        for (int i = 0; i < 300; i++) {
            baggageSortingUnit.getEmptyContainerList().add(new Container(ContainerType.AKH, "id", ContainerCategory.Bulky, null,
                    "barCodeIDCatagory", "qrCodeIDCatagory", new Stack<Baggage>()));
        }

        baggageSortingUnitRoboter.selectBaggageFromDepot();

        assertEquals(0, baggageSortingUnit.getDepot().getBaggageList().size());
        assertEquals(0, baggageSortingUnitRoboter.getSelectedBaggageList().size());
        assertEquals(5, baggageSortingUnit.getFilledContainerList().size());

        for (Container container : baggageSortingUnit.getFilledContainerList()) {
            if (container.getType() == ContainerType.AKE) {
                assertEquals(75, container.getBaggageList().size());
                TicketClass ticketClass = ((NormalBaggage)container.getBaggageList().get(0)).getBaggageIdentificationTag().getBoardingPass().getTicketClass();
                for (Baggage baggage : container.getBaggageList()) {
                    assertTrue(((NormalBaggage)baggage).getBaggageIdentificationTag().getBoardingPass().getTicketClass() == ticketClass);
                }
            }

            if (container.getType() == ContainerType.AKH) {
                assertEquals(45, container.getBaggageList().size());
                for (Baggage baggage : container.getBaggageList()) {
                    assertTrue(baggage instanceof BulkyBaggage);
                }
            }
        }

    }

    /**
     * Done
     */
    @Test
    void loadContainer()
    {
        BaggageVehicle baggageVehicle = new BaggageVehicle("uuid", "id", "type", baggageSortingUnit);
        baggageSortingUnit.setBaggageVehicle(baggageVehicle);
        baggageSortingUnitRoboter.loadContainer();

        assertEquals(10, baggageVehicle.getContainer().getBaggageList().size());
    }
}