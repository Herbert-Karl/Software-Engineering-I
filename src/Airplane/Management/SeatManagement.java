package Airplane.Management;

import java.util.ArrayList;

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

    public int assign(ArrayList<Passenger> passengers) {
        int a = 0;

        return a;
    }

    public int countAvailableSeat() {
        return seats.size();
    }

    public int countAvailableSeat(String ticketClassString) {
        int a = 0;

        return a;

    }

    public ArrayList<Seat> searchSeatByPassengerName(String name) {
        //TODO

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
