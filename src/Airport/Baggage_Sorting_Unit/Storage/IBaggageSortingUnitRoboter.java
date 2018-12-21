package Airport.Baggage_Sorting_Unit.Storage;

import Airport.Base.Baggage;
import Airport.Base.ContainerCategory;

import java.util.ArrayList;

public interface IBaggageSortingUnitRoboter {

    void moveBaggageToDepot(ArrayList<Baggage> baggageList);

    void selectBaggageFromDepot();

    void loadContainer(ContainerCategory category);

    void addBaggage(Baggage b);
}
