package Airport.Federal_Police;

import Airport.Airport.Runway;
import Airport.Base.AlarmType;
import Airport.Base.Baggage;
import Airport.Security_Check.IAutomaticBoardingPassControl;

import java.util.ArrayList;

public interface IFederalPolice {
    void alarm (Runway runway, AlarmType alarmType);
    void alarm (IAutomaticBoardingPassControl automaticBoardingPassControl);
    void assignFederalPoliceOfficer(IFederalPoliceCar federalPoliceCar);
    void receive(ArrayList<Baggage> baggageList);
    void notifyGroundOperations(FederalPoliceReceipt federalPoliceReceipt);
}
