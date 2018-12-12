package Airport.base;

import java.util.ArrayList;

public class DestinationBox {
    private String uuid;
    private Flight flight;
    private ArrayList<Baggage> baggageArrayList;
    private int maximumNumerOfBaggage;

    public DestinationBox(String uuid, Flight flight, ArrayList<Baggage> baggageArrayList) {
        this.uuid = uuid;
        this.flight = flight;
        this.baggageArrayList = baggageArrayList;
        this.maximumNumerOfBaggage = 50;
    }

    public void empty() {

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public ArrayList<Baggage> getBaggageArrayList() {
        return baggageArrayList;
    }

    public void setBaggageArrayList(ArrayList<Baggage> baggageArrayList) {
        this.baggageArrayList = baggageArrayList;
    }

    public int getMaximumNumerOfBaggage() {
        return maximumNumerOfBaggage;
    }

    public void setMaximumNumerOfBaggage(int maximumNumerOfBaggage) {
        this.maximumNumerOfBaggage = maximumNumerOfBaggage;
    }
}
