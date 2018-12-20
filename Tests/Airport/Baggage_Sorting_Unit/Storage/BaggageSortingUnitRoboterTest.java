package Airport.Baggage_Sorting_Unit.Storage;

import Airport.Baggage_Sorting_Unit.BaggageSortingUnit;
import Airport.Baggage_Sorting_Unit.Vehicles.BaggageVehicle;
import Airport.Base.Baggage;
import Airport.Base.DestinationBox;
import Airport.Base.Employee;
import Airport.Base.NormalBaggage;
import Airport.Customs.Customs;
import Airport.Scanner.BaggageScanner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BaggageSortingUnitRoboterTest {
    private BaggageSortingUnitRoboter baggageSortingUnitRoboter;
    private BaggageSortingUnit baggageSortingUnit;

    @BeforeEach
    void setup() {
        baggageSortingUnit = new BaggageSortingUnit(new ArrayList<Employee>(), new BaggageScanner(), new DestinationBox(null, new ArrayList<Baggage>(),
                100), new Customs());
        baggageSortingUnitRoboter = new BaggageSortingUnitRoboter(baggageSortingUnit, "type");

        for (int i = 0; i < 10; i++) {
            baggageSortingUnitRoboter.addBaggage(new NormalBaggage("content"));
        }
    }

    /**
     * Done
     */
    @Test
    void moveBaggageToDepot() {
        baggageSortingUnitRoboter.moveBaggageToDepot(baggageSortingUnitRoboter.getSelectedBaggageList());
        assertEquals(baggageSortingUnitRoboter.getSelectedBaggageList(), baggageSortingUnit.getBaggageDepot().getBaggageList());
    }

    /**
     * TODO
     */
    @Test
    void selectBaggageFromDepot() {
    }

    /**
     * Done
     */
    @Test
    void loadContainer() {
        BaggageVehicle baggageVehicle = new BaggageVehicle("type", baggageSortingUnit);
        baggageSortingUnit.setBaggageVehicle(baggageVehicle);
        baggageSortingUnitRoboter.loadContainer();

        assertEquals(10, baggageVehicle.getContainer().getBaggageList().size());
    }
}