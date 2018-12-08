package Airport.Airport;

import java.util.ArrayList;

puclic class TaxiWay{
    private TaxiCenterLine taxiCenterLine;
    private GateID gateID;
    private RunwayID runwayID;
    private Arraylist<TaxiCheckPonit> taxiCheckPonitList;
    private RunwayCheckPointID runwayCheckPoint;

    public TaxiWay(TaxiCenterLine taxiCenterLine, GateID gateID, RunwayID runwayID,
                   ArrayList<TaxiCheckPoint> taxiCheckPointList, RunwayCheckpointID runwayCheckPoint){
        this.taxiCenterLine = taxiCenterLine;
        this.gateID = gateID;
        this.runwayID = runwayID;
        this.taxiCheckPonitList = taxiCheckPointList;
        this.runwayCheckPoint = runwayCheckPoint;
    }
}