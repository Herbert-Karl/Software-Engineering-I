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

    // Initialize passengers and passports from csv
    public int loadPassengerData(String dataFilePath){ // path with passenger data and csv files
        String csvFile = dataFilePath + "/passenger_base_baggage_assignment.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) { // iterate through file lines
                String[] dataFields = line.split(cvsSplitBy);
                String ticketClass = dataFields[1];
                String name = dataFields[2];
                String birthDate = dataFields[3];
                String genderString = dataFields[4];
                String passportString = dataFields[5];
                String passportPictureTemp = dataFields[6];
                String passportPicture = dataFields[7];
                String numberHandBaggages = dataFields[8];
                String numberNormalBaggages = dataFields[9];
                String numberBulkyBaggages = dataFields[10];
                String handBaggageID = dataFields[11];
                String normalBaggageID = dataFields[12];
                String bulkyBaggageID = dataFields[13];
                Gender gender = Gender.Female;               
                if (genderString == "m") { // Get Gender
                    gender = Gender.Male;
                }
                int counter = 1;
                String content = "";
                String passengerDataPath = dataFilePath + "/passenger_" + counter + ".txt";
                String linePassengerData = "";

                Passport passport = new Passport(passportString, passportPicture, null);
                ArrayList<Baggage> baggageList = new ArrayList<>();
            	// Read passenger data to get passenger content
                try (BufferedReader brPassengerData = new BufferedReader(new FileReader(passengerDataPath))) {
                    while ((linePassengerData = brPassengerData.readLine()) != null) {
                		content = linePassengerData;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                counter++;
                Passenger passenger = new Passenger(name, content, birthDate, gender, passport, baggageList, ticketClass, PassengerStatus.Initialized);
                passport.setPassenger(passenger);
                passengerList.add(passenger);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return passengerList.size();
    }

    public int loadAssignCabinBaggageData(String dataFilePath){
        // Assign certain amount of hand baggages (amount from csv) to baggageList of all passengers
        // and create instances of baggage with content and weight
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
                    Baggage baggage = new NormalBaggage(content, 20.0);
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
                    Baggage baggage = new BulkyBaggage(content, 20.0);
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