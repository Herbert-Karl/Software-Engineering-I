package Airplane.Management;

import java.util.ArrayList;

public interface ISeatManagement {
    String version();
    int assign(ArrayList<Passenger> passengers);
    int countAvailableSeat();
    int countAvailableSeat(String ticketClassString);
    ArrayList<Seat> searchSeatByPassengerName(String name);
    Passenger searchPassengerBySeatID(String seatID);
    void printPassengerList(SeatManagementSortCriteria sortCriteria);
}
