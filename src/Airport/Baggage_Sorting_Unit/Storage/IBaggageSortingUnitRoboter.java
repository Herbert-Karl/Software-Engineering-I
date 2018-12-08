package src.Airport.Baggage_Sorting_Unit.Storage;

import java.util.ArrayList;

public interface IBaggageSortingUnitRoboter {

    void moveBaggageToDepot(ArrayList<Airport.Base.Baggage> baggageList);

    void selectBaggageFromDepot();

    void loadContainer();

    void addBaggage(Airport.Base.Baggage b);
}
