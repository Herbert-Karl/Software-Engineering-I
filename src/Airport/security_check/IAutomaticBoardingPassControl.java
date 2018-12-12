package Airport.security_check;

import Airport.base.BoardingPass;

public interface IAutomaticBoardingPassControl {
    boolean openDoors();
    boolean closeDoors();
    boolean scan(BoardingPass boardingPass);
    void alarm();
}
