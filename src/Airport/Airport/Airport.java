package Airport.Airport;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import Airplane.Aircraft.Airplane;
import Airport.AirCargoPalletLifter.AirCargoPalletVehicle;
import Airport.ApronControl.ApronControl;
import Airport.ApronControl.Apron;
import Airport.Baggage_Sorting_Unit.BaggageSortingUnit;
import Airport.Base.Passenger;
import Airport.Checkin_Desk.CheckInMediator;
import Airport.Configuration.Configuration;
import Airport.Customs.Customs;
import Airport.Federal_Police.FederalPolice;
import Airport.Pushback_Vehicle.PushBackVehicle;
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
import static Airport.Configuration.Configuration.DATAFILEPATH;

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
    private Customs customs;
    private BaggageSortingUnit baggageSortingUnit;

    // Airport Singleton
    private static Airport instance;
    private Airport() { // Prevent creation of airport by other classes
    	
    }
    public static synchronized Airport getInstance() {
    	if (Airport.instance == null) {
    		Airport.instance = new Airport();
    	}
    	return Airport.instance;
    }
    
    /* toDo 
     * 
     */

    public void init(Airport airport) {
    	PassengerBaggageDatabase passengerBaggageDatabase = new PassengerBaggageDatabase(DATAFILEPATH.pathToString());
        passengerList = passengerBaggageDatabase.getPassengerList();

        resourcePool = new AirportResourcePool(50,50,50,50,50,50,50,50,50,50,50, airport);

        gateList = new ArrayList<Gate>(10);
        for(int number = 1; number <= 10; number++){
            Gate gate = new Gate(GATE_ID.getGateNumber(number), null);
            gateList.add(gate);
        }

        apronControl = new ApronControl();
        apronControl.setAirport(airport);
        apron = new Apron(airport, apronControl);
        apronControl.setApron(apron);

        groundOperationsCenter = new GroundOperationsCenter(airport, 100);

        bulkyBaggageDesk = new BulkyBaggageDesk(airport);

        checkInMediator = new CheckInMediator(bulkyBaggageDesk);

        FederalPolice police = new FederalPolice();
        //TODO: Übergabeparameter?
        securityMediator = new SecurityMediator(airport, police);

        tower = new Tower(airport, null, null);
        //TODO: replace null values
        IRunwayManagement runwayManagement = new RunwayManagement(null, null, tower);
        //TODO: replace null values
        tower.setRunwayManagement(runwayManagement);

        fuelTank = new AirportFuelTank();

        customs = new Customs();

        baggageSortingUnit = new BaggageSortingUnit(resourcePool.takeResource("Employee"), null, null, customs);
    }
    
    
    /*
     * public Airport(ArrayList<Passenger> passengerList, AirportResourcePool resourcePool, ArrayList<Gate> gateList,
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

        resourcePool = new AirportResourcePool(50,50,50,50,50,50,50,50, 50,50,50,airport);

        gateList = new ArrayList<Gate>(10);
        for(int number = 1; number <= 10; number++){
            Gate gate = new Gate(GATE_ID.getGateNumber(number), null);
            gateList.add(gate);
        }

        apronControl = new ApronControl();
        apronControl.setAirport(airport);
        apron = new Apron(airport, apronControl);
        apronControl.setApron(apron);

        groundOperationsCenter = new GroundOperationsCenter(airport, 100);

        bulkyBaggageDesk = new BulkyBaggageDesk(airport);

        checkInMediator = new CheckInMediator(bulkyBaggageDesk);

        FederalPolice police = new FederalPolice();
        //TODO: Übergabeparameter?
        securityMediator = new SecurityMediator(airport, police);

        tower = new Tower(airport, null, null);
        //TODO: replace null values
        IRunwayManagement runwayManagement = new RunwayManagement(null, null, tower);
        //TODO: replace null values
        tower.setRunwayManagement(runwayManagement);

        fuelTank = new AirportFuelTank();

        customs = new Customs();

        baggageSortingUnit = new BaggageSortingUnit(resourcePool.takeResource("Employee"), null, null, customs);
    }
    */
    
    
    
    // ToDo create configuration object get dataFilePath
    // ToDo insert configuration enum as parameter
    public int loadPassengerBaggageData(String dataFilePath){
    //public int loadPassengerBaggageData(Configuration){
        PassengerBaggageDatabase passengerBaggageDatabase = new PassengerBaggageDatabase(dataFilePath);
        passengerList = passengerBaggageDatabase.getPassengerList();
        return passengerList.size();
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
        serviceVehicle.executeRequest(gate.getGateID());
        serviceVehicle.returnToAirportResourcePool();
        return true;
    }

    public boolean executeCheckIn(Flight flight){
        checkInMediator.executeRequest(flight);
        return true;
    }

    public boolean executeSecurity(){
        securityMediator.executeRequest();
        return true;
    }

    public boolean executeCustoms(){
        //Dafür braucht man einen BaggageSortingUnitRoboter! Woher?
        customs.executeRequest(baggageSortingUnit.getBaggageSortingUnitRoboter());
        //TODO
        return true;
    }

    public boolean executeAirCargo(GateID gateID){
        AirCargoPalletVehicle airCargoPalletVehicle = resourcePool.takeResource("AirCargoPalletVehicle");
        airCargoPalletVehicle.executeRequest(gateID);
        airCargoPalletVehicle.returnToAirportResourcePool();
        return true;
    }

    public boolean executeBaggageSortingUnit(GateID gateID){
        baggageSortingUnit.executeRequest(gateID);
        return true;
    }

    public boolean executeServiceBase(GateID gateID){
        ServiceVehicleBase base = resourcePool.takeResource("ServiceVehicleBase");
        base.executeRequest(gateID);
        base.returnToAirportResourcePool();
        return true;
    }

    public boolean executeServiceFreshWater(GateID gateID){
        ServiceVehicleFreshWater freshWaterVehicle = resourcePool.takeResource("ServiceVehicleFreshWater");
        freshWaterVehicle.executeRequest(gateID);
        freshWaterVehicle.returnToAirportResourcePool();
        return true;
    }

    public boolean executeServiceNitrogenOxygen(GateID gateID){
        ServiceVehicleNitrogenOxygen nitrogenOxygenVehicle = resourcePool.takeResource("ServiceVehicleNitrogenOxygen");
        nitrogenOxygenVehicle.executeRequest(gateID);
        nitrogenOxygenVehicle.returnToAirportResourcePool();
        return true;
    }

    public boolean executeSkyTanking(GateID gateID){
        SkyTankingVehicle skyTankingVehicle = resourcePool.takeResource("SkyTankingVehicle");
        skyTankingVehicle.executeRequest(gateID);
        resourcePool.returnResource(skyTankingVehicle);
        return true;
    }

    public boolean executeBoardingControl(Gate gate){
        securityMediator.executeRequest();
        return true;
    }

    public boolean executePushback(Gate gate){
        PushBackVehicle pushBackVehicle = resourcePool.takeResource("PushBackVehicle");
        TaxiWay taxiway = apronControl.search(TaxiCenterLine.yellow, gate.getGateID(), RunwayID.R08L);
        //TODO: random parameters?
        //Where to get parameters?
        pushBackVehicle.execute(gate.getAirplane(), taxiway);
        resourcePool.returnResource(pushBackVehicle);
        return true;
    }

    public boolean executeGroundOperationsLogging(){
       groundOperationsCenter.logBaggageSortingUnit(groundOperationsCenter.getBaggageSortingUnitReceiptList());
       groundOperationsCenter.logBoardingControl(groundOperationsCenter.getBoardingControlReceiptList());
       groundOperationsCenter.logBulkyBaggageDesk(groundOperationsCenter.getBulkyBaggageDeskReceiptList());
       groundOperationsCenter.logCargoPalletLifter(groundOperationsCenter.getAirCargoPalletLifterReceiptList());
       groundOperationsCenter.logCheckIn(groundOperationsCenter.getCheckInReceiptList());
       groundOperationsCenter.logContainerLifter(groundOperationsCenter.getContainerLifterReceiptList());
       groundOperationsCenter.logCustoms(groundOperationsCenter.getCustomsReceiptList());
       groundOperationsCenter.logFederalPolice(groundOperationsCenter.getFederalPoliceReceiptList());
       groundOperationsCenter.logFuel(groundOperationsCenter.getFuelReceiptList());
       groundOperationsCenter.logPushbackVehicle(groundOperationsCenter.getPushBackVehicleReceiptList());
       groundOperationsCenter.logServiceVehicleBase(groundOperationsCenter.getServiceVehicleBaseReceiptList());
       groundOperationsCenter.logServiceVehicleFreshWater(groundOperationsCenter.getServiceVehicleFreshWaterReceiptList());
       groundOperationsCenter.logSecurityCheck(groundOperationsCenter.getSecurityCheckReceiptList());
       groundOperationsCenter.logServiceVehicleWasteWater(groundOperationsCenter.getServiceVehicleWasteWaterReceiptList());
       groundOperationsCenter.logServiceVehicleNitrogenOxygen(groundOperationsCenter.getServiceVehicleNitrogenOxygenReceiptList());
        return true;
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

    public BaggageSortingUnit getBaggageSortingUnit(){
        return this.baggageSortingUnit;
    }

    ///
    /// Gate von GateID
    ///

    public Gate getGatefromID(GateID gateid){
        for(Gate gate: gateList){
            if(gate.getGateID() == gateid){
                return gate;
            }
        }
        return null;
    }

}