package Airplane.Management;

import java.util.ArrayList;


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

    @Override
    public int assign(ArrayList<Passenger> passengers) {
        return 0;
    }

    public int countAvailableSeat(Airplane airplane) {
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

    @Override
    public ArrayList<Seat> searchSeatByPassengerName(String name) {
        return null;
    }

    @Override
    public Passenger searchPassengerBySeatID(String seatID) {
        return null;
    }

    @Override
    public void printPassengerList(SeatManagementSortCriteria sortCriteria) {

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

}
