package Airport.Airport;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import Airplane.Aircraft.Airplane;
import Airport.Base.Passenger;
import Airport.Security_Check.SecurityMediator;
import Airport.Ground_Operations.GroundOperationsCenter;

public class Airport{
    private ArrayList<Passenger> passengerList;
    private AirportResourcePool resourcePool;
    private ArrayList<Gate> gateList;
    private Apron apron;
    private GroundOperationsCenter groundOperationsCenter;
    private CheckInMediator checkInMediator;
    private IBulkyBaggageDesk bulkyBaggageDesk;
    private SecurityMediator securityMediator;
    private ApronControl apronControl;
    private Tower tower;

    public Airport(ArrayList<Passenger> passengerList, AirportResourcePool resourcePool, ArrayList<Gate> gateList,
                   Apron apron, GroundOperationsCenter groundOperationsCenter, CheckInMediator checkInMediator, IBulkyBaggageDesk bulkyBaggageDesk,
                   SecurityMediator securityMediator, ApronControl apronControl, Tower tower){
        this.passengerList = passengerList;
        this.resourcePool = resourcePool;
        this.gateList = gateList;
        this.apron = apron;
        this.groundOperationsCenter = groundOperationsCenter;
        this.checkInMediator = checkInMediator;
        this.bulkyBaggageDesk =bulkyBaggageDesk;
        this.securityMediator = securityMediator;
        this.apronControl = apronControl;
        this.tower = tower;
    }

    public int loadPassengerBaggageData(String dataFilePath){
        File passengerBaggageData = new File(dataFilePath);
        int zeilenAnzahl;
        if(!passengerBaggageData.canRead() || !passengerBaggageData.isFile()){System.out.println("Datei kann nicht gelesen werden");}
        BufferedReader input = null;
        try{
            input = new BufferedReader(new FileReader(dataFilePath));
            String Zeile = null;
            while((zeile = input.readLine()) != null){
                zeilenAnzahl++;
                //Noch was mit den Daten machen?
            }
        } catch(IOExeption ioExeption){
            ioExeption.printstackTrace();
        } finally {
            if(input != null) try {
                in.close();
            }
        }
        return zeilenAnzahl;
    }

    public int connectAirplane(Airplane airplane, Gate gate){
        gate.connect(airplane);
    }

    public boolean disconnectAirplane(Airplane airplane, Gate gate){
        gate.disconnectAirplane();
    }

    public boolean executeServiceWasteWater(GateID gateID){
        //TODO
    }

    public boolean executeCheckIn(Flight flight){
        //TODO
    }

    public boolean executeSecurity(){
        //TODO
    }

    public boolean executeCustoms(){
        //TODO
    }

    public boolean executeAirCargo(GateID gateID){
        //TODO
    }

    public boolean executeBaggageSortingUnit(GateID gateID){
        //TODO
    }

    public boolean executeServiceBase(GateID gateID){
        //TODO
    }

    public boolean executeServiceFreshWater(GateID gateID){
        //TODO
    }

    public boolean executeServiceNitrogenOxygen(GateID gateID){
        //TODO
    }

    public boolean executeSkyTanking(GateID gateID){
        //TODO
        return false;
    }

    public boolean executeBoardingControl(Gate gate){
        //TODO
        return false;
    }

    public boolean executePushback(Gate gate){
        //TODO
        return false;
    }

    public boolean executeGroundOperationsLogging(){
        //TODO
        return false;
    }

    public ArrayList<Gate> getGateList() {
        return this.gateList;
    }
}