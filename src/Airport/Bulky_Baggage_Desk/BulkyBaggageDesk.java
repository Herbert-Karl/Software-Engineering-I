package Airport.Bulky_Baggage_Desk;

import Airport.Airport.Airport;
import Airport.Base.*;

import java.util.Random;

public class BulkyBaggageDesk {
    private String uuid;
    private int id;
    private Airport airport;
    private Employee employee;
    private ReadingDevice readingDevice = new ReadingDevice();
    private ArrayList<LuggageTub> luggageTubList = new ArrayList<>();
    private Passenger currentPassenger;
    private int numberOfPassenger = 0;
    private int numberOfBulkyBaggage = 0;
    private ArrayList<BaggageIdentificationTag> baggageIdentificationTagList = new ArrayList<>();
    private boolean isOpen = false;

    public BulkyBaggageDesk(Airport airport){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        Random random = new Random();
        id = random.nextInt(200) + 1;
        this.airport = airport;
    }

    public void open(){
        employee = airport.getResourcePool().takeResource("Employee");
        isOpen = true;
    }

    public void close(){
        airport.getResourcePool().returnResource(employee);
        employee = null;
        isOpen = false;
    }

    public double weight(Baggage baggage){
        return baggage.getWeight();
    }
}
