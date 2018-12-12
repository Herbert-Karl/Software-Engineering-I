package Airport.airport;

import java.util.ArrayList;

public class TaxiWay {
    private TaxiCenterLine taxiCenterLine;
    private GateID gateID;
    private RunwayID runwayID;
    private ArrayList<TaxiCheckPoint> taxiCheckPointArrayList;
    private RunwayCheckPointID runwayCheckPointID;

    public TaxiWay(TaxiCenterLine taxiCenterLine, GateID gateID, RunwayID runwayID, ArrayList<TaxiCheckPoint> taxiCheckPointArrayList, RunwayCheckPointID runwayCheckPointID) {
        this.taxiCenterLine = taxiCenterLine;
        this.gateID = gateID;
        this.runwayID = runwayID;
        this.taxiCheckPointArrayList = taxiCheckPointArrayList;
        this.runwayCheckPointID = runwayCheckPointID;
    }

    public TaxiCenterLine getTaxiCenterLine() {
        return taxiCenterLine;
    }

    public void setTaxiCenterLine(TaxiCenterLine taxiCenterLine) {
        this.taxiCenterLine = taxiCenterLine;
    }

    public GateID getGateID() {
        return gateID;
    }

    public void setGateID(GateID gateID) {
        this.gateID = gateID;
    }

    public RunwayID getRunwayID() {
        return runwayID;
    }

    public void setRunwayID(RunwayID runwayID) {
        this.runwayID = runwayID;
    }

    public ArrayList<TaxiCheckPoint> getTaxiCheckPointArrayList() {
        return taxiCheckPointArrayList;
    }

    public void setTaxiCheckPointArrayList(ArrayList<TaxiCheckPoint> taxiCheckPointArrayList) {
        this.taxiCheckPointArrayList = taxiCheckPointArrayList;
    }

    public RunwayCheckPointID getRunwayCheckPointID() {
        return runwayCheckPointID;
    }

    public void setRunwayCheckPointID(RunwayCheckPointID runwayCheckPointID) {
        this.runwayCheckPointID = runwayCheckPointID;
    }
}
