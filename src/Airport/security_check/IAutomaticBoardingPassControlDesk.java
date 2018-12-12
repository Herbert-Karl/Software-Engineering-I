package Airport.security_check;

import Airport.base.BoardingPass;

public interface IAutomaticBoardingPassControlDesk {
    boolean scan(BoardingPass boardingPass);
}
