package Airport.Bulky_Baggage_Desk;

import Airport.Airport.Airport;
import Airport.Base.*;

import java.util.Random;

public class BulkyBaggageDesk implements IBulkyBaggageDesk{
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

    public BulkyBaggageDesk(){}

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

    public boolean scan(Passport passport){
        //TODO
        return false;
    }

    public boolean scan(BoardingPass boardingPass){
        //TODO
        return false;
    }

    public BaggageIdentificationTag checkIn(BoardingPass boardingPass, Baggage baggage){
        //TODO
        return null;
    }

    public BaggageIdentificationTag printBaggageIdentificationTag(){
        BaggageIdentificationTag baggageIdentificationTag = new BaggageIdentificationTag();
        //TODO
        return baggageIdentificationTag;
    }

    public void place(Baggage baggage, LuggageTub luggageTub){
        luggageTub.setBaggage(baggage);
    }

    public void place(BaggageIdentificationTag baggageIdentificationTag, Baggage baggage){
        //TODO
    }

    public void sendLuggageTubToBaggageSortingUnit(LuggageTub luggageTub){
        //TODO
    }

    public void refillLuggageTubListFromCheckInDesk(){
        //TODO
    }

    public void notifyGroundOperations(){
        //TODO
    }
}
