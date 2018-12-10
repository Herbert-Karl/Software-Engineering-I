package src.Airport.Boarding_Control;

public interface IBoardingControl {

    boolean inspect(Passport passport);
    boolean scan(BoardingPass boardingPass);
    void print(PassengerList passengerList);
    void notifyGroundOperations(BoardingControlReceipt boardingControlReceipt);

}
