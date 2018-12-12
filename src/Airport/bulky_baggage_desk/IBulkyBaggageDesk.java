package Airport.bulky_baggage_desk;

import Airport.base.*;

public interface IBulkyBaggageDesk {
    void open();
    boolean scan(Passport passport);
    boolean scan(BoardingPass boardingPass);
    double weight(Baggage baggage);
    BaggageIdentificationTag checkIn(BoardingPass boardingPass, Baggage baggage);
    BaggageIdentificationTag print();
    void place(BaggageIdentificationTag baggageIdentificationTag, Baggage baggage);
    void place(Baggage baggage, LuggageTube luggageTube);
    void sendLuggageTubeToBaggageSortingUnit(LuggageTube luggageTube);
    void refillLuggageTubeListFromCheckInDesk();
    void notifyGroundOperations(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt);
    void close();
}
