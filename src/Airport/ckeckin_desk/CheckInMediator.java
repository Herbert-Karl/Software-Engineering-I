package Airport.ckeckin_desk;

import Airport.base.Flight;
import Airport.bulky_baggage_desk.BulkyBaggageDesk;

import java.util.ArrayList;

public class CheckInMediator {
    private Flight flight;
    private ArrayList<ICheckInDesk> checkInDeskArrayList;
    private BulkyBaggageDesk bulkyBaggageDesk;

    public CheckInMediator(Flight flight, ArrayList<ICheckInDesk> checkInDeskArrayList, BulkyBaggageDesk bulkyBaggageDesk) {
        this.flight = flight;
        this.checkInDeskArrayList = checkInDeskArrayList;
        this.bulkyBaggageDesk = bulkyBaggageDesk;
    }

    public void build() {

    }

    public void executeRequest(Flight flight) {

    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public ArrayList<ICheckInDesk> getCheckInDeskArrayList() {
        return checkInDeskArrayList;
    }

    public void setCheckInDeskArrayList(ArrayList<ICheckInDesk> checkInDeskArrayList) {
        this.checkInDeskArrayList = checkInDeskArrayList;
    }

    public BulkyBaggageDesk getBulkyBaggageDesk() {
        return bulkyBaggageDesk;
    }

    public void setBulkyBaggageDesk(BulkyBaggageDesk bulkyBaggageDesk) {
        this.bulkyBaggageDesk = bulkyBaggageDesk;
    }
}
