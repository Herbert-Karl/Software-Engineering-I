package Airport.Baggage_Sorting_Unit.Vehicles;

import Airport.Baggage_Sorting_Unit.BaggageSortingUnit;
import Airport.Baggage_Sorting_Unit.Storage.BaggageSortingUnitRoboter;
import Airport.Base.*;
import Airport.Customs.Customs;
import Airport.Scanner.BaggageScanner;
import Airport.Scanner.StringSearchAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class BaggageVehicleTest
{
    private BaggageSortingUnit baggageSortingUnit;
    private BaggageVehicle baggageVehicle;
    private ArrayList<Baggage> baggageList;

    @BeforeEach
    void setup() {
        baggageList = new ArrayList<Baggage>();

        for (int i = 0; i < 10; i++) {
            baggageList.add(new NormalBaggage("content"));
        }

        baggageSortingUnit = new BaggageSortingUnit(new ArrayList<Employee>(), new BaggageScanner("type", StringSearchAlgorithm.BITAP), new DestinationBox(null, baggageList,
                100), new Customs(), new BaggageSortingUnitRoboter(baggageSortingUnit, "type"));
        baggageVehicle = new BaggageVehicle("type", baggageSortingUnit);
    }

    /**
     * Done
     */
    @Test
    void store()
    {
        Container container = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null, "barCodeIDCatagory",
                "qrCodeIDCatagory", new Stack<Baggage>());
        baggageVehicle.store(container);
        assertEquals(container, baggageVehicle.getContainer());
    }

    /**
     * TODO for public void store(final Collection<Baggage> b)
     */
    @Test
    void store1()
    {
    }

    /**
     * Done
     */
    @Test
    void connect()
    {
        ContainerLifter containerLifter = new ContainerLifter("type");
        baggageVehicle.connect(containerLifter);
        assertEquals(containerLifter, baggageVehicle.getContainerLifter());
    }

    /**
     * Done
     */
    @Test
    void transferContainerToLifter()
    {
        Container container = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null, "barCodeIDCatagory",
                "qrCodeIDCatagory", new Stack<Baggage>());
        ContainerLifter containerLifter = new ContainerLifter("type");
        baggageVehicle.setContainerLifter(containerLifter);
        baggageVehicle.store(container);
        baggageVehicle.transferContainerToLifter();
        assertNull(baggageVehicle.getContainer());
        assertEquals(container, containerLifter.getContainer());
    }

    /**
     * Done
     */
    @Test
    void disconnect()
    {
        baggageVehicle.disconnect();
        assertNull(baggageVehicle.getContainerLifter());
    }

    /**
     * Done
     */
    @Test
    void returnToBaggageSortingUnit()
    {
        baggageVehicle.returnToBaggageSortingUnit();
        assertEquals(baggageVehicle, baggageSortingUnit.getVehicle());
        assertFalse(baggageVehicle.isFlashingLightOn());
        assertEquals(0, baggageVehicle.getSpeedInMPH());
    }

    /**
     * TODO
     */
    @Test
    void executeRequest()
    {
    }

    /**
     * Done
     */
    @Test
    void setFlashingLightOn()
    {
        baggageVehicle.setFlashingLightOn();
        assertTrue(baggageVehicle.isFlashingLightOn());
    }

    /**
     * Done
     */
    @Test
    void move()
    {
        baggageVehicle.move(10);
        assertEquals(10, baggageVehicle.getSpeedInMPH());
    }

    /**
     * Done
     */
    @Test
    void stop()
    {
        baggageVehicle.move(10);
        baggageVehicle.stop();
        assertEquals(0, baggageVehicle.getSpeedInMPH());
    }

    /**
     * Done
     */
    @Test
    void setFlashingLightOff()
    {
        baggageVehicle.setFlashingLightOff();
        assertFalse(baggageVehicle.isFlashingLightOn());
    }
}