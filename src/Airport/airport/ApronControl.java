package Airport.airport;

import Airplane.Aircraft.Airplane;

import java.util.ArrayList;

public class ApronControl {
    private Airport airport;
    private Apron apron;
    private String frequency;
    private ArrayList<TaxiWay> taxiWayArrayList;

    public ApronControl(Airport airport, Apron apron, ArrayList<TaxiWay> taxiWayArrayList) {
        this.airport = airport;
        this.apron = apron;
        this.taxiWayArrayList = taxiWayArrayList;
        this.frequency = "121.5";
    }

    public boolean approveRequestStartEngines(Airplane airplane) {
        return false;
    }

    public boolean approveRequestPushback(Airplane airplane) {
        return false;
    }

    public RunwayCheckPointID requestRunwayCheckPointID(Airplane airplane) {
        return null;
    }

    public TaxiWay search(TaxiCenterLine taxiCenterLine, GateID gateID, RunwayID runwayID) {
        return null;
    }

    public  boolean approveRequestTaxi(Airplane airplane, TaxiWay taxiWay) {
        return false;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public Apron getApron() {
        return apron;
    }

    public void setApron(Apron apron) {
        this.apron = apron;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public ArrayList<TaxiWay> getTaxiWayArrayList() {
        return taxiWayArrayList;
    }

    public void setTaxiWayArrayList(ArrayList<TaxiWay> taxiWayArrayList) {
        this.taxiWayArrayList = taxiWayArrayList;
    }
}
