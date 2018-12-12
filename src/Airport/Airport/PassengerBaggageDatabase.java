package Airport.Airport;

import Airport.Base.Passenger;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;

import static Airport.Configuration.Configuration.DATAFILEPATH;

public class PassengerBaggageDatabase{
    private ArrayList<Passenger> passengerList;

    public int loadPassengerData(String dataFilePath){
        File passengerData = new File(dataFilePath);
        int zeilenAnzahl = 0;
        if(!passengerData.canRead() || !passengerData.isFile()){System.out.println("Fehler beim Einlesen der Datei.");}
        BufferedReader inp = null;
        try{
            inp = new BufferedReader(new FileReader(dataFilePath));
            String zeile = null;
            while((zeile = inp.readLine()) != null){
                zeilenAnzahl++;
                //Noch was?
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
        return zeilenAnzahl;
    }

    public int loadAssignCabinBaggageData(String dataFilePath){
        File assignCabinBaggageData = new File(dataFilePath);
        int zeilenAnzahl = 0;
        if(!assignCabinBaggageData.canRead() || !assignCabinBaggageData.isFile()){System.out.println("Datei kann nicht gelesen werden");}
        BufferedReader input = null;
        try{
            input = new BufferedReader(new FileReader(dataFilePath));
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
            input = new BufferedReader(new FileReader(dataFilePath));
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

    public int loadAssignBulkyBaggageData(String dataFilePath){
        File assignBulkyBaggageData = new File(dataFilePath);
        int zeilenAnzahl = 0;
        if(!assignBulkyBaggageData.canRead() || !assignBulkyBaggageData.isFile()){System.out.println("Datei kann nicht gelesen werden");}
        BufferedReader input = null;
        try{
            input = new BufferedReader(new FileReader(dataFilePath));
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
        loadAssignBulkyBaggageData(DATAFILEPATH.pathToString());
        loadAssignCabinBaggageData(DATAFILEPATH.pathToString());
        loadAssignNormalBaggageData(DATAFILEPATH.pathToString());
        loadPassengerData(DATAFILEPATH.pathToString());
    }

    ///
    /// Getter und Setter
    ///

    public ArrayList<Passenger> getPassengerList(){
        return passengerList;
    }
}