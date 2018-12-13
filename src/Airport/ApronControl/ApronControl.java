/*
group 17
*/

package Airport.ApronControl;

import Airport.Airport.*;

import java.lang.reflect.Array;
import java.util.*;
import Airplane.Aircraft.*;
import java.lang.*;

public class ApronControl{


    private Airport            airport;
    private Apron              apron;
    private String             frequency; /*121,5*/
    private ArrayList<TaxiWay> taxiWayList;

    public ApronControl()
    {
        this.frequency =  "121.5";
    }

    public boolean approveRequestStartEngines(Airplane airplane)
    {
        // always true
        return true;
    }

    public boolean approveRequestPushback(Airplane airplane)
    {
        // always true
        return true;
    }

    public RunwayCheckPointID requestRunwayCheckPointID(Airplane airplane)
    {
        return ( RunwayCheckPointID.S1);
        // todo: herausfinden, was Aiplane übergibt
        // S1 to S4
    }

    public TaxiWay search(TaxiCenterLine taxiCenterLine, GateID gateID, RunwayID runwayID) {

            if (gateID.toString().charAt(0) == 'A' && (taxiCenterLine.toString().equals("yellow") || taxiCenterLine.equals("green")))
            {
                if (taxiCenterLine.toString().equals("yellow")) {
                    return (taxiWayByColor(gateID,runwayID,taxiCenterLine,'O'));
                }
                else {
                    return (taxiWayByColor(gateID,runwayID,taxiCenterLine,'N'));
                }
            }

            // wenn gateid b muss blau oder rot sein
            else if (gateID.toString().charAt(0) == 'B' && (taxiCenterLine.toString().equals("blue") || taxiCenterLine.toString().equals("red")))
            {
                if (taxiCenterLine.toString().equals("blue")) {
                    return (taxiWayByColor(gateID,runwayID,taxiCenterLine,'M'));
                }
                else {
                    return (taxiWayByColor(gateID,runwayID,taxiCenterLine,'L'));
                }
        }
    }


    private TaxiWay taxiWayByColor(GateID gateID,RunwayID runwayID,TaxiCenterLine taxiCenterLine,char colorLetter){
        //int startRunway = 6;
        //char runwayLetter = 'O';
        int gate = Character.getNumericValue(gateID.toString().charAt(2));
        // Betrag
        //int difference = Math.abs(startRunway - gate);
        //int endRunway = startRunway - difference;

        //List of Points needed to go to Destination
        ArrayList<TaxiCheckPoint> taxiCheckPointList = new ArrayList <TaxiCheckPoint> ();



        for ( int i = 6; i >= gate; i-- ) {
            String checkPoint = colorLetter + Integer.toString(i);
            taxiCheckPointList.add(TaxiCheckPoint.valueOf(checkPoint));
        }

        //load default
        RunwayCheckPointID runwayCheckPoint = RunwayCheckPointID.S1;

        if ( runwayID.equals("26R") ) {
            runwayCheckPoint = RunwayCheckPointID.S1;
        }
        else if ( runwayID.equals("26L") ) {
            runwayCheckPoint = RunwayCheckPointID.S3;
        }
        else if ( runwayID.equals("08L") ) {
            runwayCheckPoint = RunwayCheckPointID.S2;
        }
        else if ( runwayID.equals("08R") ) {
            runwayCheckPoint = RunwayCheckPointID.S4;
        }

        TaxiWay taxiWay = new TaxiWay(taxiCenterLine,gateID,runwayID,taxiCheckPointList,runwayCheckPoint);
        return taxiWay;
    }

    public boolean approveRequestTaxi(Airplane airplane, TaxiWay taxiWay)
    {
        return true;
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

    public ArrayList<TaxiWay> getTaxiWayList() {
        return taxiWayList;
    }

    public void setTaxiWayList(ArrayList<TaxiWay> taxiWayList) {
        this.taxiWayList = taxiWayList;
    }
}
