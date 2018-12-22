package Airport.Federal_Police;

import Airport.Airport.Runway;
import Airport.Base.AlarmType;
import Airport.Base.Baggage;
import Airport.Security_Check.IAutomaticBoardingPassControl;

import java.util.ArrayList;

public interface IFederalPolice {
    void alarm(IAutomaticBoardingPassControl automaticBoardingPassControl);
    void alarm(Runway runway, AlarmType alarmType);
    void assignFederalPoliceOfficer(FederalPoliceCar federalPoliceCar, FederalPoliceOfficer federalPoliceOfficer);
    void notifyGroundOperations(FederalPoliceReceipt federalPoliceReceipt);
}
