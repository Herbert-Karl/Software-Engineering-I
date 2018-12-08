package Airport.Security_Check;

import Airport.Base.Baggage;
import Airport.Base.BoardingPass;
import Airport.Base.Employee;
import Airport.Base.Passenger;

public interface IAutomaticBoardingPassControl {
    boolean openDoors();
    boolean closeDoors();
    boolean scan(BoardingPass boardingPass);
    void alarm();
}
