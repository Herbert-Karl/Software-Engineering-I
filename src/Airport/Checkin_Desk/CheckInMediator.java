package Airport.Checkin_Desk;

import Airport.Base.Flight;
import Airport.Bulky_Baggage_Desk.BulkyBaggageDesk;

public class CheckInMediator {
    private Flight flight;
    private ArrayList<CheckInDesk> checkinDeskList = new ArrayList<>();
    private BulkyBaggageDesk bulkyBaggageDesk;

    public CheckInMediator(BulkyBaggageDesk bulkyBaggageDesk){
        this.bulkyBaggageDesk = bulkyBaggageDesk;

    }


    public void executeRequest(Flight flight){

    }
}
