package Airport.Baggage_Sorting_Unit.Storage;

import Airport.Base.Baggage;
import Airport.Base.BulkyBaggage;
import Airport.Base.NormalBaggage;

import java.util.ArrayList;

public class BaggageDepot {

  private final String uuid;

  private final ArrayList<Baggage> baggageList;

  public BaggageDepot(final String uuid) {
    this.uuid = uuid;
    baggageList = new ArrayList<>();
  }

  void store(final Baggage baggage) {
    baggageList.add(baggage);
  }

  void storeAll(final Iterable<Baggage> baggage) {
    for (final Baggage b : baggage) {
      store(b);
    }
  }

  /**
   * @param ticketClassString What does this do?
   */
  ArrayList<Baggage> selectNormalBaggage(final String ticketClassString) {

    final ArrayList<Baggage> normal = new ArrayList<>();
    for (final Baggage b : baggageList) {
      if (b instanceof NormalBaggage) {
        normal.add(b);
      }
    }
    return normal;
  }

  /**
   *
   */
  ArrayList<Baggage> selectBulkyBaggage() {

    final ArrayList<Baggage> bulky = new ArrayList<>();
    for (final Baggage b : baggageList) {
      if (b instanceof BulkyBaggage) {
        bulky.add(b);
      }
    }
    return bulky;
  }
}
