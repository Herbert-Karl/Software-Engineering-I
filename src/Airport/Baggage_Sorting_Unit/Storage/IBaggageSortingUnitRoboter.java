package Airport.Baggage_Sorting_Unit.Storage;

import Airport.Base.Baggage;

import java.util.ArrayList;

public interface IBaggageSortingUnitRoboter {

  void moveBaggageToDepot(ArrayList<Baggage> baggageList);

  void selectBaggageFromDepot();

  void loadContainer();

  void addBaggage(Baggage b);
}
