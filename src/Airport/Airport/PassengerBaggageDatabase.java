package Airport.Airport;

import Airport.Base.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
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
        // Assign certain amount of hand baggages (amount from csv) to baggageList of all passengers
        // and create instances of baggage with content, weight and identification tag
        int i = 0;
        int filenumber = 0;
        String[] amountOfBaggages;
        String line;
        ArrayList<Baggage> baggageList = new ArrayList<>();
        File assignCabinBaggageData = new File(dataFilePath);

        if(!assignCabinBaggageData.canRead() || !assignCabinBaggageData.isFile()){System.out.println("Datei kann nicht gelesen werden");}
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(dataFilePath + "/passenger_number_of_hand_baggage.csv"));
            line = input.readLine();
            amountOfBaggages = line.split(",");
            for (Passenger name: passengerList) { // iterate through passengers
                for (int j = 1; j <= Integer.valueOf(amountOfBaggages[i]); j++) { // Add baggages to baggageList
                    String content = null;
                    try{ // get baggage content from file
                        input = new BufferedReader(new FileReader(dataFilePath + "/cabin_baggage_" + filenumber + ".txt"));
                        while((content = input.readLine()) != null){
                            content = content + input.readLine(); // append lines to content
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
                    filenumber++;
                    Baggage baggage = new CabinBaggage(content, 20.0);
                    baggageList.add(baggage);
                }
                i++;
                name.setBaggageList(baggageList);
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
        return filenumber;
    }


    public int loadAssignNormalBaggageData(String dataFilePath) {
        // Assign certain amount of Normal baggages (amount from csv) to baggageList of all passengers
        // and create instances of baggage with content, weight and identification tag
        int i = 0;
        int filenumber = 0;
        String[] amountOfBaggages;
        String line;
        ArrayList<Baggage> baggageList = new ArrayList<>();
        File assignNormalBaggageData = new File(dataFilePath);

        if(!assignNormalBaggageData.canRead() || !assignNormalBaggageData.isFile()){System.out.println("Datei kann nicht gelesen werden");}
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(dataFilePath + "/passenger_number_of_normal_baggage.csv"));
            line = input.readLine();
            amountOfBaggages = line.split(",");
            for (Passenger name: passengerList) { // iterate through passengers
                for (int j = 1; j <= Integer.valueOf(amountOfBaggages[i]); j++) { // Add baggages to baggageList
                    String content = null;
                    try{ // get baggage content from file
                        input = new BufferedReader(new FileReader(dataFilePath + "/normal_baggage_" + filenumber + ".txt"));
                        while((content = input.readLine()) != null){
                            content = content + input.readLine(); // append lines to content
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
                    filenumber++;
                    //ToDo get baggageIdentificationTag
                    // Baggage baggage = new NormalBaggage(content, 20.0, baggageIdentificationTag);
                    //baggageList.add(baggage);
                }
                i++;
                name.setBaggageList(baggageList);
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
        return filenumber;
    }

    public int loadAssignBulkyBaggageData(String dataFilePath){
        // Assign certain amount of Normal baggages (amount from csv) to baggageList of all passengers
        // and create instances of baggage with content, weight and identification tag
        int i = 0;
        int filenumber = 0;
        String[] amountOfBaggages;
        String line;
        ArrayList<Baggage> baggageList = new ArrayList<>();
        File assignBulkyBaggageData = new File(dataFilePath);

        if(!assignBulkyBaggageData.canRead() || !assignBulkyBaggageData.isFile()){System.out.println("Datei kann nicht gelesen werden");}
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(dataFilePath + "/passenger_number_of_bulky_baggage.csv"));
            line = input.readLine();
            amountOfBaggages = line.split(",");
            for (Passenger name: passengerList) { // iterate through passengers
                for (int j = 1; j <= Integer.valueOf(amountOfBaggages[i]); j++) { // Add baggages to baggageList
                    String content = null;
                    try{ // get baggage content from file
                        input = new BufferedReader(new FileReader(dataFilePath + "/bulky_baggage_" + filenumber + ".txt"));
                        while((content = input.readLine()) != null){
                            content = content + input.readLine(); // append lines to content
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
                    filenumber++;
                    //ToDo get baggageIdentificationTag
                    // Baggage baggage = new BulkyBaggage(content, 20.0, baggageIdentificationTag);
                    //baggageList.add(baggage);
                }
                i++;
                name.setBaggageList(baggageList);
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
        return filenumber;
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