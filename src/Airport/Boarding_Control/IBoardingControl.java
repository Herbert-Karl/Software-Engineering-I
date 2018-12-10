package Airport.Boarding_Control;

import Airport.Base.BoardingPass;
import Airport.Base.Passport;

public interface IBoardingControl {

    boolean inspect(Passport passport);
    boolean scan(BoardingPass boardingPass);
    void print(PassengerList passengerList);
    void notifyGroundOperations(BoardingControlReceipt boardingControlReceipt);

}
