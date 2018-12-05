import java.util.ArrayList;

public interface ISeatManagement {
    public String version();
    public int assign(ArrayList<Passenger> passengers);
    public int countAvailableSeat();
    public int countAvailableSeat(String ticketClassString);
    public ArrayList<Seat> searchSeatByPassengerName(String name);
    public Passenger searchPassengerBySeatID(String seatID);
    public void printPassengerList(SeatManagementSortCriteria sortCriteria);
}
