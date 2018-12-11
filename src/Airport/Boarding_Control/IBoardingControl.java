package Airport.Boarding_Control;

import Airport.Base.BoardingPass;
import Airport.Base.Passenger;
import Airport.Base.Passport;

import java.util.ArrayList;

public interface IBoardingControl {

    boolean inspect(Passport passport);
    boolean scan(BoardingPass boardingPass);
    void print(ArrayList<Passenger> passengerList);
    void notifyGroundOperations(BoardingControlReceipt boardingControlReceipt);

}
