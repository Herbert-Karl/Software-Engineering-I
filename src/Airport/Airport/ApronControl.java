package Airport.Airport;

import Airplane.Aircraft.Airplane;

import java.util.ArrayList;

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
        return false;
    }

    public boolean approveRequestPushback(Airplane airplane){
        //TODO
        return false;
    }

    public RunwayCheckPointID requestRunwayCheckPointID(Airplane airplane){

        //TODO
        return null;
    }

    public TaxiWay search(TaxiCenterLine taxiCenterLine, GateID gateID, RunwayID runwayID){
        //TODO
        return null;
    }

    public boolean approveRequestTaxi(Airplane airplane, TaxiWay taxiWay){
        //TODO
        return false;
    }
}