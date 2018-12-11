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
}