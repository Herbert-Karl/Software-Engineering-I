package Airport.Security_Check;

import Airport.Airport.Airport;
import Airport.Base.IDCard;
import Airport.Base.Passenger;
import Airport.Scanner.BaggageScanner;
import Airport.Scanner.BodyScanner;
import Airport.Scanner.ExplosivesDetector;
import Airport.Scanner.ReadingDevice;

import java.util.ArrayList;
import java.util.List;

public class SecurityMediator {

    private List<IAutomaticBoardingPassControl> automaticBoardingPassControlList;
    private List<ISecurityCheck> securityCheckList;
    private List<IPassportControl> passportControlList;

    SecurityCheckReceipt securityCheckReceipt;

    private List<Passenger> passengerList;

    public SecurityMediator(Airport airport) {
        automaticBoardingPassControlList = new ArrayList<IAutomaticBoardingPassControl>();
        securityCheckList = new ArrayList<ISecurityCheck>();
        passportControlList = new ArrayList<IPassportControl>();

        passengerList = new ArrayList<Passenger>();

        securityCheckReceipt = new SecurityCheckReceipt();

        build(airport);
    }

    //TODO Variablen mit sinnvolleren Werten füllen
    public void build(Airport airport) {
        for(AutomaticBoardingPassControlID id :AutomaticBoardingPassControlID.values()) {
           // automaticBoardingPassControlList.add(new AutomaticBoardingPassControl(id.toString(), id, new ReadingDevice()));
        }
        for(SecurityCheckID id:SecurityCheckID.values()) {
            //securityCheckList.add(new SecurityCheck(id.toString(),id , airport, new BaggageScanner(), new BodyScanner(), new ExplosivesDetector()));
        }
        passportControlList.add(new PassportControl("1", "1", new ReadingDevice("1", "1", "1", new IDCard())));
    }

    public void addPassengerToQueue(Passenger passenger) {
        passengerList.add(passenger);
    }

    public void executeRequest() {

    }
}
