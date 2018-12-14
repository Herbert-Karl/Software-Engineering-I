package Airport.Security_Check;

import Airport.Base.BoardingPass;
import Airport.Base.Employee;

public interface IAutomaticBoardingPassControlDesk {
    boolean scan(BoardingPass boardingPass);
    public boolean login(Employee employee);
    public void logout();
}
