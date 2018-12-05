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

    }

    public int countAvailableSeat() {

    }

    public int countAvailableSeat(String ticketClassString) {

    }

    public ArrayList<Seat> searchSeatByPassengerName(String name) {

    }

    public Passenger searchPassengerBySeatID(String seatID) {

    }

    public void printPassengerList(SeatManagementSortCriteria sortCriteria) {

    }
}
