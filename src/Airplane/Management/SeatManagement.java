package Airplane.Management;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;


import Airplane.Aircraft.Airplane;
import Airport.Base.Passenger;


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

    public boolean assign(ArrayList<Passenger> passengers) {
        ArrayList<String> allSeats = new ArrayList<String>();
        (Airplane a1) -> a1.getBody().getFirstClassSeatArrayList().forEach(s -> allSeats.add(s.id));
        AtomicBoolean ret = new AtomicBoolean(true);
        passengers.forEach(p ->
        {
            if(!allSeats.contains(p.getBoardingPass().getSeat()))
                ret.set(false);
        });
        return ret.get();




    }

    public int countAvailableSeat(Airplane airplane) {
      //  ArrayList<String> seats = new ArrayList<>();
      //  seats.add((Airplane a1) -> a1.getBody().getFirstClassSeatArrayList().forEach(s -> seats));
        int seats = airplane.getBody().getFirstClassSeatArrayList().size();
        seats += airplane.getBody().getBusinessClassSeatArrayList().size();
        seats += airplane.getBody().getTouristClassSeatArrayList().size();

        return seats;

    //Class Airplane legt an, wieviel First, Business und Touristclass Seats es gibt

    }

    public int countAvailableSeat(String ticketClassString, Airplane airplane) {
        int seats = 0;
        if(airplane.getBody().getFirstClassSeatArrayList().contains(ticketClassString))
            seats++;
        if(airplane.getBody().getBusinessClassSeatArrayList().contains(ticketClassString))
            seats++;
        if(airplane.getBody().getTouristClassSeatArrayList().contains(ticketClassString))
            seats++;

        return seats;

    }

    public Passenger searchSeatByPassengerName(String name) {
        //Passenger hat einen namen und besitzt
        ArrayList<Passenger> passenger = new ArrayList<Passenger>();


    }

    public Passenger searchPassengerBySeatID(String seatID) {
        //TODO

    }

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

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

}
