package Airport.Security_Check;

import Airport.Airport.Airport;
import Airport.Base.Employee;
import Airport.Base.IDCard;
import Airport.Base.Passenger;
import Airport.Base.TicketClass;
import Airport.Federal_Police.FederalPolice;
import Airport.Scanner.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class SecurityMediator {

    private HashMap<AutomaticBoardingPassControlID, IAutomaticBoardingPassControl> automaticBoardingPassControlHashMap;
    private HashMap<SecurityCheckID, ISecurityCheck> securityCheckHashMap;
    FederalPolice federalPolice;

    Airport airport;
    SecurityCheckReceipt securityCheckReceipt;

    private List<Passenger> passengerList;

    public SecurityMediator(Airport airport, FederalPolice federalPolice) {
        passengerList = new ArrayList<Passenger>();
        this.airport = airport;
        this.federalPolice = federalPolice;
    }

    public void build() {
        for (AutomaticBoardingPassControlID id : AutomaticBoardingPassControlID.values()) {
            automaticBoardingPassControlHashMap.put(id, new AutomaticBoardingPassControl(id, new ReadingDevice( "1", "test"), federalPolice));
        }
        for(SecurityCheckID id : SecurityCheckID.values()) {
            //Todo Initialize, fix securitychecks
        }
    }

    public void addPassengerToQueue(Passenger passenger) {
        passengerList.add(passenger);
    }

    public void executeRequest() {
        for (Passenger passenger : passengerList) {
            if (passenger.getBoardingPass().getTicketClass() == TicketClass.Economy) {
                performSecurityEconomyClass(passenger);
            } else if (passenger.getBoardingPass().getTicketClass() == TicketClass.Business) {
                performSecurityBusinessClass(passenger);
            } else if (passenger.getBoardingPass().getTicketClass() == TicketClass.First) {
                performSecurityFirstClass(passenger);
            }
            securityCheckReceipt.setNumberOfPassengerScanned(securityCheckReceipt.getNumberOfPassengerScanned() + 1);
        }
    }

    private void performSecurityEconomyClass(Passenger passenger) {
//TODO
    }

    private void performSecurityBusinessClass(Passenger passenger) {
//TODO
    }

    private void performSecurityFirstClass(Passenger passenger) {
//TODO
    }
}
