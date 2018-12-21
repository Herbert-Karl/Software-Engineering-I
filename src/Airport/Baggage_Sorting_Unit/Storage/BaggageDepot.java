package Airport.Baggage_Sorting_Unit.Storage;

import Airport.Base.Baggage;
import Airport.Base.BulkyBaggage;
import Airport.Base.NormalBaggage;
import Airport.Base.TicketClass;

import java.util.ArrayList;
import java.util.UUID;

public class BaggageDepot {

    private final String uuid;

    private final ArrayList<Baggage> baggageList;

    public BaggageDepot() {
        this.uuid = UUID.randomUUID().toString();
        baggageList = new ArrayList<>();
    }

    @Override
    public String toString() {
        String content = "UUID: " + uuid + "\nStored Baggage: ";
        for (final Baggage b : baggageList) {
            content += "\n    " + b;
        }
        return content;
    }

    public String getUuid() {
        return uuid;
    }

    public ArrayList<Baggage> getBaggageList() {
        return baggageList;
    }

    /**
     * adds baggage to baggageList
     */
    private void store(final Baggage baggage) {
        baggageList.add(baggage);
    }

    /**
     * adds a collection of baggage to BaggageList
     */
    void storeAll(final Iterable<Baggage> baggage) {
        for (final Baggage b : baggage) {
            store(b);
        }
    }

    /**
     * returns all instances of NormalBaggage from the baggageList
     * * Does not remove the instances
     */
    ArrayList<Baggage> selectNormalBaggage(TicketClass ticketClass) {

        final ArrayList<Baggage> normal = new ArrayList<>();
        for (final Baggage b : baggageList) {
            if (b instanceof NormalBaggage) {
                if (((NormalBaggage) b).getBaggageIdentificationTag().getBoardingPass().getTicketClass() == ticketClass) {
                    normal.add(b);
                }
            }
        }
        return normal;
    }

    /**
     * returns all instances of BulkyBaggage from the baggageList
     * * Does not remove the instances
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
