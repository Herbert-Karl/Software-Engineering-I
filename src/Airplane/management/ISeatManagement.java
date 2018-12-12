package Airplane.management;

import Airplane.seat.Seat;
import Airport.base.Passenger;

import java.util.ArrayList;

public interface ISeatManagement {
    String version();
    boolean assign(Passenger passenger);
    int countAvailibleSeat();
    int countAvailibleSeat(String ticketClassString);
    ArrayList<Seat> searchSeatByPassengerName(String name);
    Passenger searchPassengerBySeatID();
    void pintPassengerList(SeatManagementSortCriteria sortCriteria);
}
