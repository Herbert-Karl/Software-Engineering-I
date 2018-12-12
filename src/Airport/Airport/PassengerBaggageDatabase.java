package Airport.Airport;

import Airport.Base.Baggage;
import Airport.Base.Gender;
import Airport.Base.Passenger;
import Airport.Base.Passport;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;

import static Airport.Configuration.Configuration.DATAFILEPATH;

public class PassengerBaggageDatabase{
    private ArrayList<Passenger> passengerList;

    private Passenger createPassenger(String id){
        Passport passport = new Passport(id, "", null);
        ArrayList<Baggage> baggageList = new ArrayList<>();
        Passenger passenger = new Passenger("Max Mustermann", "","1.1.2000", Gender.Male, passport, baggageList, "", null );
        passport.setPassenger(passenger);
        return passenger;
    }

    public int loadPassengerData(String dataFilePath){
        File passengerData = new File(dataFilePath);
        int zeilenAnzahl = 0;
        if(!passengerData.canRead() || !passengerData.isFile()){System.out.println("Fehler beim Einlesen der Datei.");}
        BufferedReader inp = null;
        try{
            for(int nummer = 1; nummer <= 568; nummer++) {
                inp = new BufferedReader(new FileReader(dataFilePath + "/passenger_" + nummer + ".txt"));
                String zeile = null;
                zeile = inp.readLine();
                    zeilenAnzahl++;
                    //Noch was?
                    Passenger passenger = createPassenger("" + nummer);
                    passenger.setContent(zeile);
                    passengerList.add(passenger);
            }
        } catch(IOException ioException){
            ioException.printStackTrace();
        } finally {
            if(inp != null) try {
                inp.close();
            } catch(IOException ioE){
                ioE.printStackTrace();
            }
        }
        return passengerList.size();
    }

    public int loadAssignCabinBaggageData(String dataFilePath){
        File assignCabinBaggageData = new File(dataFilePath);
        int zeilenAnzahl = 0;
        if(!assignCabinBaggageData.canRead() || !assignCabinBaggageData.isFile()){System.out.println("Datei kann nicht gelesen werden");}
        BufferedReader input = null;
        try{
            input = new BufferedReader(new FileReader(dataFilePath + "/hand_baggage_" + nummer + ".txt"));
            String zeile = null;
            while((zeile = input.readLine()) != null){
                zeilenAnzahl++;
                //Noch was mit den Daten machen?
            }
        } catch(IOException ioExeption){
            ioExeption.printStackTrace();
        } finally {
            if(input != null) try {
                input.close();
            } catch(IOException ioE) {
                ioE.printStackTrace();
            }
        }

        return zeilenAnzahl;
    }

    public int loadAssignNormalBaggageData(String dataFilePath){
        File assignNormalBaggageData = new File(dataFilePath);
        int zeilenAnzahl = 0;
        if(!assignNormalBaggageData.canRead() || !assignNormalBaggageData.isFile()){System.out.println("Datei kann nicht gelesen werden");}
        BufferedReader input = null;
        try{
            input = new BufferedReader(new FileReader(dataFilePath + "/normal_baggage_" + nummer + ".txt"));
            String zeile = null;
            while((zeile = input.readLine()) != null){
                zeilenAnzahl++;
                //TODO: Noch was mit den Daten machen?
            }
        } catch(IOException ioExeption){
            ioExeption.printStackTrace();
        } finally {
            if(input != null) try {
                input.close();
            } catch(IOException ioE){
                ioE.printStackTrace();
            }
        }

        return zeilenAnzahl;
    }

    public int loadAssignBulkyBaggageData(String dataFilePath){
        File assignBulkyBaggageData = new File(dataFilePath);
        int zeilenAnzahl = 0;
        if(!assignBulkyBaggageData.canRead() || !assignBulkyBaggageData.isFile()){System.out.println("Datei kann nicht gelesen werden");}
        BufferedReader input = null;
        try{
            input = new BufferedReader(new FileReader(dataFilePath + "/bulky_baggage_" + nummer + ".txt"));
            String zeile = null;
            while((zeile = input.readLine()) != null){
                zeilenAnzahl++;
                //Noch was mit den Daten machen?
            }
        } catch(IOException ioExeption){
            ioExeption.printStackTrace();
        } finally {
            if(input != null) try {
                input.close();
            } catch(IOException ioE){
                ioE.printStackTrace();
            }
        }

        return zeilenAnzahl;
    }

    public PassengerBaggageDatabase(){
        loadPassengerData("");
        loadAssignBulkyBaggageData("");
        loadAssignCabinBaggageData("");
        loadAssignNormalBaggageData("");
    }

    ///
    /// Getter und Setter
    ///

    public ArrayList<Passenger> getPassengerList(){
        return passengerList;
    }
}