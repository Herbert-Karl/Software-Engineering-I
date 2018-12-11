package Airport.boarding_control;

import Airport.base.BoardingPass;
import Airport.base.Passport;

public interface IBoardingControl {
    boolean inspect(Passport passport);
    boolean scan(BoardingPass boardingPass);
    void print();
    void notifyGroundOperations(BoardingControlReceipt boardingControlReceipt);
}
