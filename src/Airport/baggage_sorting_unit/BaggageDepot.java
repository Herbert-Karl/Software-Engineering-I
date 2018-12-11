package Airport.baggage_sorting_unit;

import Airport.base.Baggage;

import java.util.ArrayList;

public class BaggageDepot {
    private String uuid;
    private ArrayList<Baggage> baggageArrayList;

    public BaggageDepot(String uuid, ArrayList<Baggage> baggageArrayList) {
        this.uuid = uuid;
        this.baggageArrayList = baggageArrayList;
    }

    public void store(Baggage baggage) {

    }

    public ArrayList<Baggage> selectNormalBaggage(String ticketClassString) {
        return null;
    }

    public ArrayList<Baggage> selectBulkyBaggage() {
        return null;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ArrayList<Baggage> getBaggageArrayList() {
        return baggageArrayList;
    }

    public void setBaggageArrayList(ArrayList<Baggage> baggageArrayList) {
        this.baggageArrayList = baggageArrayList;
    }
}
