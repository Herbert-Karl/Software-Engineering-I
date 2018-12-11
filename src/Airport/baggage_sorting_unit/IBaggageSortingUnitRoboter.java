package Airport.baggage_sorting_unit;

import Airport.base.Baggage;

import java.util.ArrayList;

public interface IBaggageSortingUnitRoboter {
    void moveBaggageToDepot(ArrayList<Baggage> baggageArrayList);
    void selectBaggageFromDepot();
    void loadContainer();
}
