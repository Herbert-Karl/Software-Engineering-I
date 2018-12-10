package Airplane.management;

import Airplane.seat.ITouristClassSeat;
import Airport.base.Passenger;

import java.util.ArrayList;

public interface ISeatManagement {
    String version();
    boolean assign(Passenger passenger);
    int countAvailibleSeat();
    int countAvailibleSeat(String ticketClassString);
    ArrayList<ITouristClassSeat> searchSeatByPassengerName(String name);
    Passenger searchPassengerBySeatID();
    void pintPassengerList(SeatManagementSortCriteria sortCriteria);
}
