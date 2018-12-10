package Airport.Security_Check;

import Airport.Base.BoardingPass;

public interface IAutomaticBoardingPassControlDesk {
    boolean scan(BoardingPass boardingPass);
}
