package Airport.Airport;

import java.util.ArrayList;

public class TaxiWay{
    private TaxiCenterLine taxiCenterLine;
    private GateID gateID;
    private RunwayID runwayID;
    private ArrayList<TaxiCheckPoint> taxiCheckPointList;
    private RunwayCheckPointID runwayCheckPoint;

    public TaxiWay(TaxiCenterLine taxiCenterLine, GateID gateID, RunwayID runwayID,
                   ArrayList<TaxiCheckPoint> taxiCheckPointList, RunwayCheckPointID runwayCheckPoint){
        this.taxiCenterLine = taxiCenterLine;
        this.gateID = gateID;
        this.runwayID = runwayID;
        this.taxiCheckPointList = taxiCheckPointList;
        this.runwayCheckPoint = runwayCheckPoint;
    }

    ///
    /// Getter:
    ///


    public GateID getGateID() {
        return gateID;
    }

    public RunwayID getRunwayID() {
        return runwayID;
    }

    public TaxiCenterLine getTaxiCenterLine() {
        return taxiCenterLine;
    }

    public RunwayCheckPointID getRunwayCheckPoint() {
        return runwayCheckPoint;
    }

    public ArrayList<TaxiCheckPoint> getTaxiCheckPointList() {
        return taxiCheckPointList;
    }

    ///
    /// Setter:
    ///


    public void setGateID(GateID gateID) {
        this.gateID = gateID;
    }

    public void setRunwayCheckPoint(RunwayCheckPointID runwayCheckPoint) {
        this.runwayCheckPoint = runwayCheckPoint;
    }

    public void setRunwayID(RunwayID runwayID) {
        this.runwayID = runwayID;
    }

    public void setTaxiCenterLine(TaxiCenterLine taxiCenterLine) {
        this.taxiCenterLine = taxiCenterLine;
    }

    public void setTaxiCheckPointList(ArrayList<TaxiCheckPoint> taxiCheckPointList) {
        this.taxiCheckPointList = taxiCheckPointList;
    }
}