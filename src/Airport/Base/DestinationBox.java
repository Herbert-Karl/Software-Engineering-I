package Airport.Base;

import java.util.ArrayList;
import java.util.Arrays;

public class DestinationBox {
    private string uuid;
    private Flight flight;
    private ArrayList<Baggage> baggageList;
    private int maximumNumberOfBaggages = 50;

    public DestinationBox(String uuid, Flight flight, ArrayList<Baggage> baggageList, int maximumNumberOfBaggages) {
        this.uuid = uuid;
        this.flight = flight;
        this.baggageList = baggageList;
        this.maximumNumberOfBaggages = maximumNumberOfBaggages;
    }

    public ArrayList<Baggage> getBaggageList() {
        return baggageList;
    }

    public void empty() { //empties the DestinationBox
        baggageList.clear();
    }
}