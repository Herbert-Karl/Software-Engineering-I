package Airplane.Management;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Body;
import Airport.Airport.Airport;
import Airport.Airport.GateID;
import Airport.Base.Passenger;
import Airport.Base.TicketClass;


public class SeatManagement implements ISeatManagement{

    private String manufacturer;
    private String type;
    private String id;


    public SeatManagement(String manufacturer, String type, String id) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;

    }

    public String version() {
        return "<"+id+"> - " + "<"+type+">" ;

    }

    @Override
    public int assign(ArrayList<Passenger> passengers) {
        String assign;
       // passengers.forEach(p -> p.getBoardingPass().getSeat());
        ArrayList<GateID> gateids = new ArrayList<GateID>();
        passengers.stream().forEach(p -> {
            GateID id = p.getBoardingPass().getGate();
            if(!gateids.contains(id))
                gateids.add(id);
        });


        return 0;
    }

    @Override
    public int countAvailableSeat() {
        int seats = (Airplane a1) -> a1.getBody().getFirstClassSeatArrayList().stream().count());
        return 0;
    }

    @Override
    public int countAvailableSeat(String ticketClassString) {

        return 0;
    }

    @Override
    public Passenger searchPassengerBySeatID(String seatID) {
        return null;
    }

    /*
        public boolean assign(ArrayList<Passenger> passengers) {
            String assign;
            ArrayList<String> allSeats = new ArrayList<String>();

            Body body  = new Body();
            allSeats.addAll(body.getFirstClassSeatArrayList());

            passengers.forEach(p -> p.getBoardingPass().getSeat());

            ArrayList<GateID> gateids = new ArrayList<GateID>();
            passengers.stream().forEach((Passenger p) ->
            {
               GateID id = p.getBoardingPass().getGate();
                if (!gateids.contains(id))
                    gateids.add(id);
            });




        }

        public int countAvailableSeat() {

        //Class Airplane legt an, wieviel First, Business und Touristclass Seats es gibt

        }

        public int countAvailableSeat(String ticketClassString) {


        }

        public Passenger searchSeatByPassengerName(String name) {
            //Passenger hat einen namen und besitzt
            ArrayList<Passenger> passenger = new ArrayList<Passenger>();


        }

        public Passenger searchPassengerBySeatID(String seatID) {
            //TODO

        }
    */
    public void printPassengerList(SeatManagementSortCriteria sortCriteria) {
        //TODO

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
/*
    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
*/
}
