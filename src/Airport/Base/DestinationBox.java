package Airport.Base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public class DestinationBox {
    private String uuid;
    private Flight flight;
    private ArrayList<Baggage> baggageList;
    private int maximumNumberOfBaggages = 50;

    public DestinationBox(Flight flight, ArrayList<Baggage> baggageList, int maximumNumberOfBaggages) {
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        this.flight = flight;
        this.baggageList = baggageList;
        this.maximumNumberOfBaggages = maximumNumberOfBaggages;
    }

    public ArrayList<Baggage> getBaggageList() {
        return this.baggageList;
    }

    public void empty() { //empties the DestinationBox
        baggageList.clear();
    }

    public boolean isempty(){
        return baggageList.isEmpty();
    }

    public boolean isFull(){
        return baggageList.size() >= maximumNumberOfBaggages;
    }
}