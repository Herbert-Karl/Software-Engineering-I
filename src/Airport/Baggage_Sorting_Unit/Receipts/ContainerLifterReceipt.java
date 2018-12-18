package Airport.Baggage_Sorting_Unit.Receipts;

import Airport.Baggage_Sorting_Unit.IBaggageSortingUnit;
import Airport.Base.Baggage;

import java.util.ArrayList;

public class ContainerLifterReceipt {

  private final String uuid;

  private final String id;

  private final String type;

  private final IBaggageSortingUnit baggageSortingUnit;

  private final ArrayList<Baggage> selectedBaggageList;

  public ContainerLifterReceipt(final String uuid, final String id, final String type,
      final IBaggageSortingUnit baggageSortingUnit, final ArrayList<Baggage> selectedBaggageList) {
    this.uuid = uuid;
    this.id = id;
    this.type = type;
    this.baggageSortingUnit = baggageSortingUnit;
    this.selectedBaggageList = selectedBaggageList;
  }

  @Override
  public String toString() {
    return ("UUID: " + uuid + "\nID: " + id + "\nType: " + type + "\nBaggage sorting unit: "
        + baggageSortingUnit + "\nList of selected bagagge: " + selectedBaggageList);
  }
}
