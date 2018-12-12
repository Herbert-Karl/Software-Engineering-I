package Airport.federal_police;

import Airport.airport.Runway;
import Airport.base.AlarmType;
import Airport.base.Baggage;
import Airport.security_check.IAutomaticBoardingPassControl;

import java.util.ArrayList;

public interface IFederalPolice {
    void alarm(IAutomaticBoardingPassControl automaticBoardingPassControl);
    void alarm(Runway runway, AlarmType alarmType);
    void assignFederalPoliceOfficer(IFederalPoliceCar federalPoliceCar);
    void receive(ArrayList<Baggage> baggageArrayList);
    void notifyGroundOperations(FederalPoliceReceipt federalPoliceReceipt);
}
