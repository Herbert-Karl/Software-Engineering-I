package Airport.ApronControl;/*
group 17
*/

import Airplane.Aircraft.Airplane;
import Airport.Airport.*;

import java.util.ArrayList;

import static Airport.Airport.RunwayCheckPointID.*;
import static Airport.Airport.TaxiCheckPoint.*;
import static java.lang.Math.abs;

public class ApronControl{

    private Airport airport;
    private Apron apron;
    private String             frequency; /*121,5*/
    private ArrayList<TaxiWay> taxiWayList;

    public ApronControl()
    {
        frequency =  "121.5";
    }

    public boolean approveRequestStartEngines(Airplane airplane)
    {
        // criteria?
        return true;
    }

    public boolean approveRequestPushback(Airplane airplane)
    {
        // criteria?
        return true;
    }

    public RunwayCheckPointID requestRunwayCheckPointID(Airplane airplane)
    {
        // S1 to S4
        // woher weiß man das
    }

    public TaxiWay search(TaxiCenterLine taxiCenterLine, GateID gateID, RunwayID runwayID) {
        // get shortest path for taxi
        // l oder r runwayids, taxi center line ist farbe, gateid a bis b

        // Anfangspunkte der Linien entpsrechend runwayid
        String[] L26 3] = {O6;N6;S3}
        String[] L08 3] = {L1;M1;S2}
        String[] R26 3] = {O1;S1;N1}
        String[] R08 3] = {M6;S4;L6}

        // wenn GateID A muss taxicenterline gelb oder grün sein
        if (gateID.toString().charAt(0) == 'A' && (taxiCenterLine.toString() == "yellow" || taxiCenterLine.toString() == "green"))
        {
            if (taxiCenterLine.toString() == "yellow")
            {
                int startRunway = 6;
                char runwayLetter = 'O';
                int gate = Character.getNumericValue(gateID.toString().charAt(2));
                // Betrag
                int difference = abs(startRunway - gate);
                int endRunway = startRunway - difference;


            }
        }

        // wenn gateid b muss blau oder rot sein
        if (gateID.toString().charAt(0) == 'B' && (taxiCenterLine.toString() == 'blue' || taxiCenterLine.toString() == 'red'))
        {

        }
    }

    public boolean approveRequestTaxi(Airplane airplane, TaxiWay taxiWay)
    {
        // is taxi way free?
        // is airplane there?
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
