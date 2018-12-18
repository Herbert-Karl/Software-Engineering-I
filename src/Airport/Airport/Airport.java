package Airport.Airport;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import Airplane.Aircraft.Airplane;
import Airport.AirCargoPalletLifter.AirCargoPalletVehicle;
import Airport.ApronControl.ApronControl;
import Airport.ApronControl.Apron;
import Airport.Base.Passenger;
import Airport.Checkin_Desk.CheckInMediator;
import Airport.Security_Check.SecurityMediator;
import Airport.Ground_Operations.GroundOperationsCenter;
import Airport.Bulky_Baggage_Desk.BulkyBaggageDesk;
import Airport.Base.Flight;
import Airport.Service_Vehicle.ServiceVehicleBase;
import Airport.Service_Vehicle.ServiceVehicleFreshWater;
import Airport.Service_Vehicle.ServiceVehicleNitrogenOxygen;
import Airport.Service_Vehicle.ServiceVehicleWasteWater;
import Airport.Sky_Tanking_Vehicle.SkyTankingVehicle;
import java.io.IOException;

import static Airport.Airport.GateID.A01;
import static Airport.Airport.GateID.GATE_ID;

public class Airport{
    private ArrayList<Passenger> passengerList;
    private AirportResourcePool resourcePool;
    private ArrayList<Gate> gateList;
    private Apron apron;
    private GroundOperationsCenter groundOperationsCenter;
    private CheckInMediator checkInMediator;
    private BulkyBaggageDesk bulkyBaggageDesk;
    private SecurityMediator securityMediator;
    private ApronControl apronControl;
    private Tower tower;
    private AirportFuelTank fuelTank;

    public Airport(ArrayList<Passenger> passengerList, AirportResourcePool resourcePool, ArrayList<Gate> gateList,
                   Apron apron, GroundOperationsCenter groundOperationsCenter, CheckInMediator checkInMediator, BulkyBaggageDesk bulkyBaggageDesk,
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

    public Airport(){

    }

    public void init(Airport airport){
        PassengerBaggageDatabase passengerBaggageDatabase = new PassengerBaggageDatabase();
        this.passengerList = passengerBaggageDatabase.getPassengerList();

        resourcePool = new AirportResourcePool(50,50,50,50,50,50,50,50,50,50,airport);

        gateList = new ArrayList<Gate>(10);
        for(int number = 1; number <= 10; number++){
            Gate gate = new Gate(GATE_ID.getGateNumber(number), null);
            gateList.add(gate);
        }
        //TODO: create Gates and put in list

        apronControl = new ApronControl();
        apronControl.setAirport(airport);
        apron = new Apron(airport, apronControl);

        groundOperationsCenter = new GroundOperationsCenter(airport, 100);

        checkInMediator = new CheckInMediator();
        // TODO: Übergabeparameter?

        bulkyBaggageDesk = new BulkyBaggageDesk();
        //TODO: Übergabeparameter?

        securityMediator = new SecurityMediator();
        //TODO: Übergabeparameter?

        tower = new Tower(airport, null, null);
        //TODO: replace null values
        IRunwayManagement runwayManagement = new RunwayManagement(null, null, tower);
        //TODO: replace null values
        tower.setRunwayManagement(runwayManagement);

        fuelTank = new AirportFuelTank();
    }

    public int loadPassengerBaggageData(String dataFilePath){
        File passengerBaggageData = new File(dataFilePath);
        int zeilenAnzahl = 0;
        if(!passengerBaggageData.canRead() || !passengerBaggageData.isFile()){System.out.println("Kann Datei nicht lesen.");}
        BufferedReader input = null;
        try{
            input = new BufferedReader(new FileReader(dataFilePath));
            String zeile = null;
            while((zeile = input.readLine()) != null){
                zeilenAnzahl++;
                //Noch was mit den Daten machen?
            }
        } catch(IOException ioExeption){
            ioExeption.printStackTrace();
        } finally {
            if(input != null) try {
                input.close();
            } catch (IOException ioException){
                ioException.printStackTrace();
            }
        }
        return zeilenAnzahl;
    }

    public boolean connectAirplane(Airplane airplane, Gate gate){
        if(gate.getAirplane() == null) {
            gate.connect(airplane);
            return true;
        } else {
            System.out.println("Flugzeug kann nicht connected werden. Gate ist bereits belegt.");
            return false;
        }
    }

    public boolean disconnectAirplane(Airplane airplane, Gate gate){
        if ((gate.getAirplane() != null) && (gate.getAirplane() == airplane)) {
            gate.disconnectAirplane();
            return true;
        }
        else {
            System.out.println("Flugzeug kann nicht disconnected werden.");
            return false;}
    }

    public boolean executeServiceWasteWater(Gate gate){
        ServiceVehicleWasteWater serviceVehicle = resourcePool.takeResource("ServiceVehicleWasteWater");
        boolean b = groundOperationsCenter.assign(serviceVehicle, gate);
        serviceVehicle.executeRequest(gate.getGateID());
        //TODO: get Receipt from Ground Operations
        resourcePool.returnResource(serviceVehicle);
        return b;
    }

    public boolean executeCheckIn(Flight flight){
        checkInMediator.executeRequest(flight);
        //get Receipt from Ground operations
        return true;
    }

    public boolean executeSecurity(){
        securityMediator.executeRequest();
        //TODO: get Receipt from Ground Operations
        return true;
    }

    public boolean executeCustoms(){
        //TODO
        return false;
    }

    public boolean executeAirCargo(GateID gateID){
        AirCargoPalletVehicle airCargoPalletVehicle = resourcePool.takeResource("AirCargoPalletVehicle");
        //TODO
        resourcePool.returnResource(airCargoPalletVehicle);
        return false;
    }

    public boolean executeBaggageSortingUnit(GateID gateID){
        //TODO
        return false;
    }

    public boolean executeServiceBase(GateID gateID){
        ServiceVehicleBase base = resourcePool.takeResource("ServiceVehicleBase");
        base.executeRequest(gateID);
        //TODO: get receipt from ground operations
        resourcePool.returnResource(base);
        return true;
    }

    public boolean executeServiceFreshWater(GateID gateID){
        ServiceVehicleFreshWater freshWaterVehicle = resourcePool.takeResource("ServiceVehicleFreshWater");
        freshWaterVehicle.executeRequest(gateID);
        //TODO: get receipt from ground operations
        resourcePool.returnResource(freshWaterVehicle);
        return false;
    }

    public boolean executeServiceNitrogenOxygen(GateID gateID){
        ServiceVehicleNitrogenOxygen nitrogenOxygenVehicle = resourcePool.takeResource("ServiceVehicleNitrogenOxygen");
        nitrogenOxygenVehicle.executeRequest(gateID);
        //TODO: get receipt from ground operations
        resourcePool.returnResource(nitrogenOxygenVehicle);
        return true;
    }

    public boolean executeSkyTanking(GateID gateID){
        SkyTankingVehicle skyTankingVehicle = resourcePool.takeResource("SkyTankingVehicle");
        skyTankingVehicle.executeRequest(gateID);
        //TODO get receipt from ground operations
        resourcePool.returnResource(skyTankingVehicle);
        return false;
    }

    public boolean executeBoardingControl(Gate gate){
        securityMediator.executeRequest();
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

    //
    // Getter und Setter
    //

    public AirportFuelTank getFuelTank(){
        return this.fuelTank;
    }

    public AirportResourcePool getResourcePool(){
        return this.resourcePool;
    }

    public CheckInMediator getCheckInMediator() {
        return checkInMediator;
    }

    public GroundOperationsCenter getGroundOperationsCenter() {
        return groundOperationsCenter;
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public ArrayList<Gate> getGateList() {
        return this.gateList;
    }

}