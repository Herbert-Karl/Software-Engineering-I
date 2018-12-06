package src.Airport.Baggage_Sorting_Unit.Storage;

import java.util.ArrayList;

import Airport.Base.Baggage;
import src.Airport.Baggage_Sorting_Unit.IBaggageSortingUnit;

public class BaggageSortingUnitRoboter implements IBaggageSortingUnitRoboter {

  private String uuid;

  private String id;

  private String type;

  private IBaggageSortingUnit baggageSortingUnit;

  private ArrayList<Baggage> selectedBaggageList;

  public BaggageSortingUnitRoboter(IBaggageSortingUnit baggageSortingUnit){
    this.baggageSortingUnit=baggageSortingUnit;
    selectedBaggageList= new ArrayList<>();
  }

  @Override
  public void addBaggage(Baggage b) {
    selectedBaggageList.add(b);
  }

  /**
   * Adds parameter to internal list. Then stores it to the Depot and clears list.
   * @param baggageList
   */
  @Override
  public void moveBaggageToDepot(@SuppressWarnings("CollectionDeclaredAsConcreteClass") ArrayList<Baggage> baggageList) {
    selectedBaggageList.addAll(baggageList);
    baggageSortingUnit.getDepot().storeAll(moveBaggage());
  }

  /**
   * TODO: Welches Baggage muss man holen
   */
  @Override
  public void selectBaggageFromDepot() {

  }

  /**
   * TODO: check
   */
  @Override
  public void loadContainer() {
    baggageSortingUnit.getVehicle().store(moveBaggage());
  }

  @SuppressWarnings("CollectionDeclaredAsConcreteClass")
  private ArrayList<Baggage> moveBaggage() {
    ArrayList<Baggage> temp = selectedBaggageList;
    selectedBaggageList.clear();
    return temp;
  }
}
