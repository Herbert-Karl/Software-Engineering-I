package Airport.Baggage_Sorting_Unit.Storage;

import Airport.Baggage_Sorting_Unit.BaggageSortingUnit;
import Airport.Baggage_Sorting_Unit.Vehicles.BaggageVehicle;
import Airport.Base.*;
import Airport.Customs.Customs;
import Airport.Scanner.BaggageScanner;
import Airport.Scanner.StringSearchAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BaggageSortingUnitRoboterTest
{
    private BaggageSortingUnitRoboter baggageSortingUnitRoboter;
    private BaggageSortingUnit baggageSortingUnit;

    @BeforeEach
    void setup() {
        baggageSortingUnit = new BaggageSortingUnit(new ArrayList<Employee>(), new BaggageScanner("type", StringSearchAlgorithm.BITAP), new DestinationBox(null, new ArrayList<Baggage>(),
                100), new Customs());
        baggageSortingUnitRoboter = new BaggageSortingUnitRoboter(baggageSortingUnit, "uuid", "id", "type");

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