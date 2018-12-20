package Airport.Security_Check;

import Airport.Airport.Airport;
import Airport.Base.*;
import Airport.Federal_Police.FederalPolice;

import java.util.*;

public class SecurityMediator {

    private HashMap<AutomaticBoardingPassControlID, IAutomaticBoardingPassControl> automaticBoardingPassControlHashMap;
    private AutomaticBoardingPassControlDesk automaticBoardingPassControlDesk;
    private HashMap<SecurityCheckID, ISecurityCheck> securityCheckHashMap;
    PassportControl passportControl;
    private FederalPolice federalPolice;

    Airport airport;

    private List<Passenger> passengerList;

    public SecurityMediator(Airport airport, FederalPolice federalPolice) {
        passengerList = new ArrayList<>();
        this.airport = airport;
        this.federalPolice = federalPolice;
        automaticBoardingPassControlHashMap = new HashMap<>();
        securityCheckHashMap = new HashMap<>();
        build();
    }

    public void build() {
        for (AutomaticBoardingPassControlID id : AutomaticBoardingPassControlID.values()) {
            automaticBoardingPassControlHashMap.put(id, new AutomaticBoardingPassControl(id, federalPolice));
        }
        automaticBoardingPassControlDesk = new AutomaticBoardingPassControlDesk();

        for (SecurityCheckID id : SecurityCheckID.values()) {
            securityCheckHashMap.put(id, new SecurityCheck(id, airport));
        }

        passportControl = new PassportControl("Control");
    }

    public void addPassengerToQueue(Passenger passenger) {
        passengerList.add(passenger);
    }

    public void executeRequest() {
        for (Passenger passenger : passengerList) {
            if (passenger.getBoardingPass().getTicketClass() == TicketClass.Economy || passenger.getBoardingPass().getTicketClass() == TicketClass.Business) {
                performSecurityEconomyBusinessClass(passenger);
            } else if (passenger.getBoardingPass().getTicketClass() == TicketClass.First) {
                performSecurityFirstClass(passenger);
            }
        }
        for (SecurityCheckID securityCheckID : securityCheckHashMap.keySet()) {
            securityCheckHashMap.get(securityCheckID).notifyGroundOperation();
        }
    }

    private void performSecurityEconomyBusinessClass(Passenger passenger) {
        int switchQueueInt;
        if (passenger.getBoardingPass().getTicketClass() == TicketClass.Economy) {
            switchQueueInt = randomInt(1, 4);
        } else {
            switchQueueInt = randomInt(5, 6);
        }
        AutomaticBoardingPassControlID automaticBoardingPassControlID;
        SecurityCheckID securityCheckID;
        switch (switchQueueInt) {
            case 1:
                automaticBoardingPassControlID = AutomaticBoardingPassControlID.ABC_01;
                securityCheckID = SecurityCheckID.S01;
                break;
            case 2:
                automaticBoardingPassControlID = AutomaticBoardingPassControlID.ABC_02;
                securityCheckID = SecurityCheckID.S02;
                break;
            case 3:
                automaticBoardingPassControlID = AutomaticBoardingPassControlID.ABC_03;
                securityCheckID = SecurityCheckID.S03;
                break;
            case 4:
                automaticBoardingPassControlID = AutomaticBoardingPassControlID.ABC_04;
                securityCheckID = SecurityCheckID.S04;
                break;
            case 5:
                automaticBoardingPassControlID = AutomaticBoardingPassControlID.ABC_05;
                securityCheckID = SecurityCheckID.S05;
                break;
            case 6:
                automaticBoardingPassControlID = AutomaticBoardingPassControlID.ABC_06;
                securityCheckID = SecurityCheckID.S06;
                break;
            default:
                automaticBoardingPassControlID = AutomaticBoardingPassControlID.ABC_01;
                securityCheckID = SecurityCheckID.S01;
                break;
        }
        IAutomaticBoardingPassControl automaticBoardingPassControl = automaticBoardingPassControlHashMap.get(automaticBoardingPassControlID);
        if (!automaticBoardingPassControl.scan(passenger.getBoardingPass())) {
            passenger.setStatus(PassengerStatus.Arrested);
            passengerList.remove(passenger);
            return;
        }
        ISecurityCheck securityCheck = securityCheckHashMap.get(securityCheckID);
        for (Baggage baggage : passenger.getBaggageList()) {
            if (!securityCheck.scan(baggage)) {
                passenger.setStatus(PassengerStatus.Arrested);
                passengerList.remove(passenger);
                return;
            }
        }
        if (!securityCheck.scan(passenger)) {
            if (!securityCheck.scan(new CottonPad(passenger.getContent()))) {
                passenger.setStatus(PassengerStatus.Arrested);
                passengerList.remove(passenger);
                return;
            }
        }
        if (!passportControl.verify(passenger.getPassport())) {
            passenger.setStatus(PassengerStatus.Arrested);
            passengerList.remove(passenger);
            return;
        }
        passenger.setStatus(PassengerStatus.SecurityCheckPassed);
        passengerList.remove(passenger);
    }

    private void performSecurityFirstClass(Passenger passenger) {
        if (!automaticBoardingPassControlDesk.scan(passenger.getBoardingPass())) {
            passenger.setStatus(PassengerStatus.Arrested);
            passengerList.remove(passenger);
            return;
        }
        int switchQueueInt = randomInt(7, 8);
        SecurityCheckID securityCheckID;
        switch (switchQueueInt) {
            case 7:
                securityCheckID = SecurityCheckID.S07;
                break;
            case 8:
                securityCheckID = SecurityCheckID.S08;
                break;
            default:
                securityCheckID = SecurityCheckID.S07;
                break;
        }
        ISecurityCheck securityCheck = securityCheckHashMap.get(securityCheckID);
        for (Baggage baggage : passenger.getBaggageList()) {
            if (!securityCheck.scan(baggage)) {
                passenger.setStatus(PassengerStatus.Arrested);
                passengerList.remove(passenger);
                return;
            }
        }
        if (!securityCheck.scan(passenger)) {
            if (!securityCheck.scan(new CottonPad(passenger.getContent()))) {
                passenger.setStatus(PassengerStatus.Arrested);
                passengerList.remove(passenger);
                return;
            }
        }
        if (!passportControl.verify(passenger.getPassport())) {
            passenger.setStatus(PassengerStatus.Arrested);
            passengerList.remove(passenger);
            return;
        }
        passenger.setStatus(PassengerStatus.SecurityCheckPassed);
        passengerList.remove(passenger);
    }

    private int randomInt(int min, int max) {
        Random random = new Random();
        return (random.nextInt() % (max - min)) + min;
    }
}
