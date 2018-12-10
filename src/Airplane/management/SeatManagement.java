package Airplane.management;

import Airplane.seat.ITouristClassSeat;

import java.util.ArrayList;

public class SeatManagement implements ISeatManagement {
    String manufacturer;
    String type;
    String id;

    public SeatManagement(String manufacturer, String type, String id) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public boolean assign(Passenger passenger) {
        return false;
    }

    @Override
    public int countAvailibleSeat() {
        return 0;
    }

    @Override
    public int countAvailibleSeat(String ticketClassString) {
        return 0;
    }

    @Override
    public ArrayList<ITouristClassSeat> searchSeatByPassengerName(String name) {
        return null;
    }

    @Override
    public Passenger searchPassengerBySeatID() {
        return null;
    }

    @Override
    public void pintPassengerList(SeatManagementSortCriteria sortCriteria) {

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
}
