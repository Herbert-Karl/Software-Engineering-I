package Airplane.Management;

import Airplane.Aircraft.Airplane;
import Airport.Base.Passenger;

import java.util.ArrayList;

public interface ISeatManagement {
    String version();
  //  int assign(ArrayList<Passenger> passengers);
    int countAvailableSeat(Airplane airplane);
    int countAvailableSeat(String ticketClassString, Airplane airplane);
  //  ArrayList<Seat> searchSeatByPassengerName(String name);
  //  Passenger searchPassengerBySeatID(String seatID);
   // void printPassengerList(SeatManagementSortCriteria sortCriteria);
}
