package Airport.Baggage_Sorting_Unit.Storage;

import Airport.Baggage_Sorting_Unit.BaggageSortingUnit;
import Airport.Baggage_Sorting_Unit.IBaggageSortingUnit;
import Airport.Base.Baggage;
import Airport.Base.ContainerCategory;

import java.util.ArrayList;

public class BaggageSortingUnitRoboter implements IBaggageSortingUnitRoboter {

  private final String uuid;

  private final String id;

  private final String type;

  private final BaggageSortingUnit baggageSortingUnit;

  public ArrayList<Baggage> getSelectedBaggageList() {
    return selectedBaggageList;
  }

  private ArrayList<Baggage> selectedBaggageList;

  public BaggageSortingUnitRoboter(final BaggageSortingUnit baggageSortingUnit, final String uuid,
      final String id, final String type) {
    this.uuid = uuid;
    this.id = id;
    this.type = type;
    this.baggageSortingUnit = baggageSortingUnit;
    selectedBaggageList = new ArrayList<>();
  }

  public String toString() {
    String message = "UUID: " + uuid + "\nID: " + id + "\nType: " + type
        + "\nAssigned Baggage Sorting Unit: " + baggageSortingUnit
        + "\nCurrently selected baggage: ";

    for (final Baggage b : selectedBaggageList) {
      message += "\n    " + b;
    }
    return message;
  }

  public String getUuid() {
    return uuid;
  }

  public String getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  @Override
  public void addBaggage(final Baggage b) {
    selectedBaggageList.add(b);
  }

  /**
   * Adds parameter to internal list. Then stores it to the Depot and clears list.
   */
  @Override
  public void moveBaggageToDepot(final ArrayList<Baggage> baggageList) {
    selectedBaggageList.addAll(baggageList);
    baggageSortingUnit.getDepot().storeAll(moveBaggage());
  }

  /**
   * Adds normal baggage from depot to container with normal type and then adds  bulky baggage to
   * container with bulky type
   */
  @Override
  public void selectBaggageFromDepot() {
    final BaggageDepot depot = baggageSortingUnit.getDepot();
    selectedBaggageList = depot.selectNormalBaggage(
        "42 is always the correct ticketClass");//TODO add correct class string
    //baggageSortingUnit.selectEmptyContainer(ContainerCategory.Normal).setBaggageList(selectedBaggageList);TODO setBaggageList
    selectedBaggageList = depot.selectBulkyBaggage();
    //baggageSortingUnit.selectEmptyContainer(ContainerCategory.Bulky).setBaggageList(selectedBaggageList);TODO setBaggageList
  }

  /**
   * moves baggage to the container on the baggageVehicle
   * TODO: check
   */
  @Override
  public void loadContainer() {
    baggageSortingUnit.getVehicle().store(moveBaggage());
  }

  /**
   * clears selected baggage list
   *
   * @return content of selected baggage list
   */
  private ArrayList<Baggage> moveBaggage() {
    final ArrayList<Baggage> temp = selectedBaggageList;
    selectedBaggageList.clear();
    return temp;
  }
}
