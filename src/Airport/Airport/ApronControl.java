package Airport.Airport;

public class ApronControl{
    private Airport airport;
    private Apron apron;
    private String frequency;
    private ArrayList<TaxiWay> taxiWayList;

    public ApronControl(Airport airport, Apron apron, ArrayList<TaxiWay> taxiWayList){
        this.airport = airport;
        this.apron = apron;
        this.taxiWayList = taxiWayList;
        this.frequency = "121.5";
    }

    public boolean approveRequestStartEngines(Airplane aiplane){
        //TODO
    }

    public boolean approveRequestPushback(Airplane airplane){
        //TODO
    }

    public RunwayCheckPointID requestRunwayCheckPointID(Airplane airplane){

        //TODO
    }

    public TaxiWay search(TaxiCenterLine taxiCenterLine, GateID gateID, RunwayID runwayID){
        //TODO
    }

    public bloolean approveRequestTaxi(Airplane airplane, TaxiWay taxiWay){
        //TODO
    }
}