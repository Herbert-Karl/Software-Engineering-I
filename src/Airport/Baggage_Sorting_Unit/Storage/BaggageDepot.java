package src.Airport.Baggage_Sorting_Unit.Storage;

import Airport.Base.Baggage;
import Airport.Base.NormalBaggage;
import Airport.Base.BulkyBaggage;

import java.util.ArrayList;

@SuppressWarnings("CollectionDeclaredAsConcreteClass")
public class BaggageDepot {

  private String uuid;

  private ArrayList<Baggage> baggageList;

  void store(Baggage baggage) {
    baggageList.add(baggage);
  }

  void storeAll(Iterable<Baggage> baggage) {
    for (Baggage b : baggage) {
      store(b);
    }
  }

  /**
   * TODO: check
   *
   * @param ticketClassString What does this do?
   */
  ArrayList<Baggage> selectNormalBaggage(String ticketClassString) {

    ArrayList<Baggage> normal = new ArrayList<>();
    for (Baggage b : baggageList) {
      if (b instanceof NormalBaggage) {
        normal.add(b);
      }
    }
    return normal;
  }

  /**
   * TODO: check
   */
  ArrayList<Baggage> selectBulkyBaggage() {

    ArrayList<Baggage> bulky = new ArrayList<>();
    for (Baggage b : baggageList) {
      if (b instanceof BulkyBaggage) {
        bulky.add(b);
      }
    }
    return bulky;
  }
}
