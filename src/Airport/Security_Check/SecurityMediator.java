package Airport.Security_Check;

import Airport.Airport.Airport;
import Airport.Base.Employee;
import Airport.Base.IDCard;
import Airport.Base.Passenger;
import Airport.Base.TicketClass;
import Airport.Scanner.BaggageScanner;
import Airport.Scanner.BodyScanner;
import Airport.Scanner.ExplosivesDetector;
import Airport.Scanner.ReadingDevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SecurityMediator {

   /* private List<IAutomaticBoardingPassControl> automaticBoardingPassControlList;
    private List<ISecurityCheck> securityCheckList;
    private List<IPassportControl> passportControlList;
    */

   private HashMap<AutomaticBoardingPassControlID, IAutomaticBoardingPassControl> automaticBoardingPassControlHashMap;
   private HashMap<SecurityCheckID, ISecurityCheck> securityCheckHashMap;
   Airport airport;


    SecurityCheckReceipt securityCheckReceipt;

    private List<Passenger> passengerList;

    public SecurityMediator(Airport airport) {
       /* automaticBoardingPassControlList = new ArrayList<IAutomaticBoardingPassControl>();
        securityCheckList = new ArrayList<ISecurityCheck>();
        passportControlList = new ArrayList<IPassportControl>();
*/
        passengerList = new ArrayList<Passenger>();
        //securityCheckReceipt = new SecurityCheckReceipt();
        this.airport = airport;
        build();
    }

    //TODO Variablen mit sinnvolleren Werten füllen
    public void build() {
        for(AutomaticBoardingPassControlID id : AutomaticBoardingPassControlID.values()) {
            automaticBoardingPassControlHashMap.put(id, new AutomaticBoardingPassControl(id.toString(), id, new ReadingDevice("1", "1", "test", null)));
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
