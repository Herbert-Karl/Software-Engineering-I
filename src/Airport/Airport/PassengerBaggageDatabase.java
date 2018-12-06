package Airport.Airport;

import java.io.File;
import java.io.FileReader;
import java.io.IOExeption;
import java.io.BufferedReader;

public class PassengerBaggageDatabase{
    private ArrayList<Passenger> passengerList;

    public int loadPassengerData(String dataFilePath){
        File passengerData = new File(dataFilePath);
        int zeilenAnzahl;

        if(!passengerData.canRead() || !passengerData.isFile()){System.out.println("Datei kann nicht gelesen werden");}

        BufferedReader input = null;
        try{
            input = new BufferedReader(new FileReader(dataFilePath));
            String Zeile = null;
            while((zeile = input.readLine()) != null){
                zeilenAnzahl++;
                //Noch was mit den Daten machen?
            }
        } catch(IOExeption ioExeption){
            e.printstackTrace();
        } finally {
            if(input != null) try {
                in.close();
            }
        }

        return zeilenAnzahl;
    }

    public int loadAssignCabinBaggageData(String dataFilePath){
        File assignCabinBaggageData = new File(dataFilePath);
        int zeilenAnzahl;

        if(!assignCabinBaggageData.canRead() || !assignCabinBaggageData.isFile()){System.out.println("Datei kann nicht gelesen werden");}

        BufferedReader input = null;
        try{
            input = new BufferedReader(new FileReader(dataFilePath));
            String Zeile = null;
            while((zeile = input.readLine()) != null){
                zeilenAnzahl++;
                //Noch was mit den Daten machen?
            }
        } catch(IOExeption ioExeption){
            e.printstackTrace();
        } finally {
            if(input != null) try {
                in.close();
            }
        }

        return zeilenAnzahl;
    }

    public int loadAssignNormalBaggageData(String dataFilePath){
        File assignNormalBaggageData = new File(dataFilePath);
        int zeilenAnzahl;

        if(!assignNormalBaggageData.canRead() || !assignNormalBaggageData.isFile()){System.out.println("Datei kann nicht gelesen werden");}

        BufferedReader input = null;
        try{
            input = new BufferedReader(new FileReader(dataFilePath));
            String Zeile = null;
            while((zeile = input.readLine()) != null){
                zeilenAnzahl++;
                //Noch was mit den Daten machen?
            }
        } catch(IOExeption ioExeption){
            e.printstackTrace();
        } finally {
            if(input != null) try {
                in.close();
            }
        }

        return zeilenAnzahl;
    }

    public int loadAssignBulkyBaggageData(String dataFilePath){
        File assignBulkyBaggageData = new File(dataFilePath);
        int zeilenAnzahl;

        if(!assignBulkyBaggageData.canRead() || !assignBulkyBaggageData.isFile()){System.out.println("Datei kann nicht gelesen werden");}

        BufferedReader input = null;
        try{
            input = new BufferedReader(new FileReader(dataFilePath));
            String Zeile = null;
            while((zeile = input.readLine()) != null){
                zeilenAnzahl++;
                //Noch was mit den Daten machen?
            }
        } catch(IOExeption ioExeption){
            e.printstackTrace();
        } finally {
            if(input != null) try {
                in.close();
            }
        }

        return zeilenAnzahl;
    }

    public PassengerBaggageDatabase(){
        //TODO
        //
    }
}