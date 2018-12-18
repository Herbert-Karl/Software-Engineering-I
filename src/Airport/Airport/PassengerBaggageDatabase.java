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

        File passengerData = new File(dataFilePath);
        if(!passengerData.canRead() || !passengerData.isFile()){System.out.println("Der Pfad konnte nicht geöffnet werden.");}
        
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
        // and create instances of baggage with content
    	// ToDo: assign correct baggages by baggage ID (from central csv)
        int i = 0;
        int filenumber = 1;
        String[] amountOfBaggages;
        String numberOfBaggages;
        ArrayList<Baggage> baggageList = new ArrayList<>();
        String csvFile = dataFilePath + "/passenger_number_of_hand_baggage.csv";
        
        File cabinBaggageData = new File(dataFilePath);
        if(!cabinBaggageData.canRead() || !cabinBaggageData.isFile()){System.out.println("Der Pfad konnte nicht geöffnet werden.");}
        
        try (BufferedReader brNumberOfBaggages = new BufferedReader(new FileReader(csvFile))) {
            while ((numberOfBaggages = brNumberOfBaggages.readLine()) != null) {
            	amountOfBaggages = numberOfBaggages.split(",");
            	for (Passenger name: passengerList) { // iterate through passengers
            		for (int j = 1; j <= Integer.valueOf(amountOfBaggages[i]); j++) { // Add baggages to baggageList
            			String baggageContent = null;
            			String contentFile = dataFilePath + "/cabin_baggage_" + filenumber + ".txt";
            			try (BufferedReader brBaggageContent = new BufferedReader(new FileReader(contentFile))) {
            				while ((baggageContent = brBaggageContent.readLine()) != null) { // Read baggage content
            					baggageContent = brBaggageContent.readLine();
            					Baggage baggage = new CabinBaggage(baggageContent);
            					baggageList.add(baggage);
            	            }
            	        } catch (IOException e) {
            	            e.printStackTrace();
            	        }
                		filenumber++; // next contentfile
            		}
            		i++; // baggagenumber of next passenger
            		name.setBaggageList(baggageList);
            	}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filenumber;
    }

    public int loadAssignNormalBaggageData(String dataFilePath) {
    	// Assign certain amount of normal baggages (amount from csv) to baggageList of all passengers
        // and create instances of baggage with content
        int i = 0;
        int filenumber = 1;
        String[] amountOfBaggages;
        String numberOfBaggages;
        ArrayList<Baggage> baggageList = new ArrayList<>();
        String csvFile = dataFilePath + "/passenger_number_of_normal_baggage.csv";
        
        File normalBaggageData = new File(dataFilePath);
        if(!normalBaggageData.canRead() || !normalBaggageData.isFile()){System.out.println("Der Pfad konnte nicht geöffnet werden.");}
        
        try (BufferedReader brNumberOfBaggages = new BufferedReader(new FileReader(csvFile))) {
            while ((numberOfBaggages = brNumberOfBaggages.readLine()) != null) {
            	amountOfBaggages = numberOfBaggages.split(",");
            	for (Passenger name: passengerList) { // iterate through passengers
            		for (int j = 1; j <= Integer.valueOf(amountOfBaggages[i]); j++) { // Add baggages to baggageList
            			String baggageContent = null;
            			String contentFile = dataFilePath + "/normal_baggage_" + filenumber + ".txt";
            			try (BufferedReader brBaggageContent = new BufferedReader(new FileReader(contentFile))) {
            				while ((baggageContent = brBaggageContent.readLine()) != null) { // Read baggage content
            					Baggage baggage = new NormalBaggage(baggageContent);
            					baggageList.add(baggage);
            	            }
            	        } catch (IOException e) {
            	            e.printStackTrace();
            	        }
                		filenumber++; // next contentfile
            		}
            		i++; // baggagenumber of next passenger
            		name.setBaggageList(baggageList);
            	}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filenumber;
    }

    public int loadAssignBulkyBaggageData(String dataFilePath){
    	// Assign certain amount of bulky baggages (amount from csv) to baggageList of all passengers
        // and create instances of baggage with content
        int i = 0;
        int filenumber = 1;
        String[] amountOfBaggages;
        String numberOfBaggages;
        ArrayList<Baggage> baggageList = new ArrayList<>();
        String csvFile = dataFilePath + "/passenger_number_of_bulky_baggage.csv";
        
        File bulkyBaggageData = new File(dataFilePath);
        if(!bulkyBaggageData.canRead() || !bulkyBaggageData.isFile()){System.out.println("Der Pfad konnte nicht geöffnet werden.");}
        
        try (BufferedReader brNumberOfBaggages = new BufferedReader(new FileReader(csvFile))) {
            while ((numberOfBaggages = brNumberOfBaggages.readLine()) != null) {
            	amountOfBaggages = numberOfBaggages.split(",");
            	for (Passenger name: passengerList) { // iterate through passengers
            		for (int j = 1; j <= Integer.valueOf(amountOfBaggages[i]); j++) { // Add baggages to baggageList
            			String baggageContent = null;
            			String contentFile = dataFilePath + "/bulky_baggage_" + filenumber + ".txt";
            			try (BufferedReader brBaggageContent = new BufferedReader(new FileReader(contentFile))) {
            				while ((baggageContent = brBaggageContent.readLine()) != null) { // Read baggage content
            					Baggage baggage = new BulkyBaggage(baggageContent);
            					baggageList.add(baggage);
            	            }
            	        } catch (IOException e) {
            	            e.printStackTrace();
            	        }
                		filenumber++; // next contentfile
            		}
            		i++; // baggagenumber of next passenger
            		name.setBaggageList(baggageList);
            	}
            }
        } catch (IOException e) {
            e.printStackTrace();
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