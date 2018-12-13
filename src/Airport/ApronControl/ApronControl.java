/*
group 17
*/

package Airport.ApronControl;

import Airport.Airport.*;
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

        // S1 to S4
    }

    public TaxiWay search(TaxiCenterLine taxiCenterLine, GateID gateID, RunwayID runwayID) {
        // get shortest path for taxi
        // l oder r runwayids, taxi center line ist farbe, gateid a bis b

        // Anfangspunkte der Linien entpsrechend runwayid
        String []L26 = {"O6","N6","S3"};
        String []L08 = {"L1","M1","S2"};
        String []R26 = {"O1","S1","N1"};
        String []R08 = {"M6","S4","L6"};

        // wenn GateID A muss taxicenterline gelb oder grün sein

        if (gateID.toString().charAt(0) == 'A' && (taxiCenterLine.toString().equals("yellow") || taxiCenterLine.equals("green")))
        {
            if (taxiCenterLine.toString().equals("yellow"))
            {
                int startRunway = 6;
                char runwayLetter = 'O';
                int gate = Character.getNumericValue(gateID.toString().charAt(2));
                // Betrag
                int difference = Math.abs(startRunway - gate);
                int endRunway = startRunway - difference;

                String end = runwayLetter + String.valueOf(endRunway);

                //List of Points needed to go to Destination
                List <TaxiCheckPoint> taxiCheckPointList = new ArrayList <TaxiCheckPoint> ();
                RunwayCheckPointID runwayCheckPoint = new RunwayCheckPointID();

                TaxiWay taxiWay = new TaxiWay(taxiCenterLine,gateID,runwayID,taxiCheckPointList,runwayCheckPoint);

                for ( int i = 0; i < endRunway; i++) {

                }
            }
        }

        // wenn gateid b muss blau oder rot sein
        if (gateID.toString().charAt(0) == 'B' && (taxiCenterLine.toString().equals('blue') || taxiCenterLine.toString().equals('red')))
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
