package Airport.ckeckin_desk;

import Airport.base.*;

public interface ICheckInDesk {
    void open();
    boolean validatePassport(Passenger passenger);
    BoardingPass checkIn(Passenger passenger);
    void print(BoardingPass boardingPass);
    double weight(Baggage baggage);
    BaggageIdentificationTag checkIn(Baggage baggage);
    void print(BaggageIdentificationTag baggageIdentificationTag);
    void place(BaggageIdentificationTag baggageIdentificationTag, Baggage baggage);
    void place(Baggage baggage, LuggageTube luggageTube);
    void sendLuggageTubeToBaggageSortingUnit(LuggageTube luggageTube);
    void notifyGroundOperations(CheckInDeskReceipt checkInDeskReceipt);
    void close();
}
