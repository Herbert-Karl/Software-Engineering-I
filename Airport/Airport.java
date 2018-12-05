import java.util.ArrayList;

public class Airport{
    private ArrayList<Passenger> passengerList;
    private AirportResourcePool resourcePool;
    private ArrayList<Gate> gateList;
    private Apron apron;
    private IGroundOperationsCenter groundOperationsCenter;
    private CheckInMediator checkInMediator;
    private IBulkyBaggageDesk bulkyBaggageDesk;
    private SecurityMediator securityMediator;
    private ApronControl apronControl;
    private Tower tower;

    public Airport(ArrayList<Passenger> passengerList, AirportRecourcePool recourcePool, ArrayList<Gate> gateList,
                   Apron apron, IGroundOperationsCenter groundOperationsCenter, CheckInMediator checkInMediator, IBulkyBaggageDesk bulkyBaggageDesk,
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
        //TODO
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
    }

    public boolean executeBoardingControl(Gate gate){
        //TODO
    }

    public boolean executePushback(Gate gate){
        //TODO
    }

    public boolean executeGroundOperationsLogging(){
        //TODO
    }
}