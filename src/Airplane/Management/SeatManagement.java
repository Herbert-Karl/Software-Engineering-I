package Airplane.Management;

import java.util.ArrayList;

public class SeatManagement implements ISeatManagement{

    private String manufacturer;
    private String type;
    private String id;
    private ArrayList<Seat> seats;
    private int numberOfPassengersFirstClassAssigned;
    private int numberOfPassengersBusinessClassAssigned;
    private int numberOFPassengersEconomyClassAssigned;

    public SeatManagement(String manufacturer, String type, String id, ArrayList<Seat> seats,
                          int numberOfPassengersFirstClassAssigned, int numberOfPassengersBusinessClassAssigned,
                          int numberOFPassengersEconomyClassAssigned) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.seats = seats;
        this.numberOfPassengersFirstClassAssigned = numberOfPassengersFirstClassAssigned;
        this.numberOfPassengersBusinessClassAssigned = numberOfPassengersBusinessClassAssigned;
        this.numberOFPassengersEconomyClassAssigned = numberOFPassengersEconomyClassAssigned;
    }

    public String version() {
        return "<"+id+"> - " + "<"+type+">" ;

    }

    public int assign(ArrayList<Passenger> passengers) {
        //TODO
    }

    public int countAvailableSeat() {
        //TODO
    }

    public int countAvailableSeat(String ticketClassString) {
        //TODO

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

    public int getNumberOfPassengersFirstClassAssigned() {
        return numberOfPassengersFirstClassAssigned;
    }

    public void setNumberOfPassengersFirstClassAssigned(int numberOfPassengersFirstClassAssigned) {
        this.numberOfPassengersFirstClassAssigned = numberOfPassengersFirstClassAssigned;
    }

    public int getNumberOfPassengersBusinessClassAssigned() {
        return numberOfPassengersBusinessClassAssigned;
    }

    public void setNumberOfPassengersBusinessClassAssigned(int numberOfPassengersBusinessClassAssigned) {
        this.numberOfPassengersBusinessClassAssigned = numberOfPassengersBusinessClassAssigned;
    }

    public int getNumberOFPassengersEconomyClassAssigned() {
        return numberOFPassengersEconomyClassAssigned;
    }

    public void setNumberOFPassengersEconomyClassAssigned(int numberOFPassengersEconomyClassAssigned) {
        this.numberOFPassengersEconomyClassAssigned = numberOFPassengersEconomyClassAssigned;
    }
}
