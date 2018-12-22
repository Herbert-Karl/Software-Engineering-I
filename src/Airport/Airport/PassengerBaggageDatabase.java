package Airport.Airport;

import Airport.Base.*;
import Airport.Configuration.Configuration;

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
    	
    	String assignmentCsvFile = dataFilePath + "/passenger_base_baggage_assignment.csv";
    	String numberCsvFile = dataFilePath + "/passenger_number_of_hand_baggage.csv";
        String lineAssignment = "";
        String lineNumber = "";
        String cvsSplitBy = ",";
        String[] numberOfBaggages = null;
        int passengerCounter = 0;
    	
        File passengerData = new File(dataFilePath);
        if(!passengerData.canRead() || !passengerData.isFile()){System.out.println("Der Pfad konnte nicht geöffnet werden.");}
        
        // Open csv with number of baggages
    	try (BufferedReader brNumber = new BufferedReader(new FileReader(numberCsvFile))) {
              while ((lineNumber = brNumber.readLine()) != null) {
                  numberOfBaggages = lineNumber.split(cvsSplitBy);
              }
          } catch (IOException e) {
              e.printStackTrace();
          }    
        
        // Open assignment csv
        try (BufferedReader brPassengerData = new BufferedReader(new FileReader(assignmentCsvFile))) {
            while ((lineAssignment = brPassengerData.readLine()) != null) { // iterate through passengers
            	String[] dataFields = lineAssignment.split(cvsSplitBy);
            	String[] handBaggageID = dataFields[11].split(" ");
            	ArrayList<Baggage> baggageList = new ArrayList<>();
            	
            	for (int i = 1; i <= Integer.parseInt(numberOfBaggages[passengerCounter]); i++) { // assign content foreach baggage
            		if (handBaggageID[i-1] != "-") {
            		String baggageContent = "";
            		String contentFile = dataFilePath + "/cabin_baggage_" + handBaggageID[i-1] + ".txt";
            		try (BufferedReader brBaggageContent = new BufferedReader(new FileReader(contentFile))) { // open baggage content
        				while ((baggageContent = brBaggageContent.readLine()) != null) { // Read baggage content
        					baggageContent = brBaggageContent.readLine();
        					Baggage baggage = new CabinBaggage(baggageContent);
        					baggageList.add(baggage);
        	            }
        	        } catch (IOException e) {
        	            e.printStackTrace();
        	        }
            		}
            	}
            	passengerList.get(passengerCounter).setBaggageList(baggageList); 
            	passengerCounter++;
        	} 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberOfBaggages.length;    	
    }

    public int loadAssignNormalBaggageData(String dataFilePath) {
    	// Assign certain amount of normal baggages (amount from csv) to baggageList of all passengers
        // and create instances of baggage with content
    	
    	String assignmentCsvFile = dataFilePath + "/passenger_base_baggage_assignment.csv";
    	String numberCsvFile = dataFilePath + "/passenger_number_of_normal_baggage.csv";
        String lineAssignment = "";
        String lineNumber = "";
        String cvsSplitBy = ",";
        String[] numberOfBaggages = null;
        int passengerCounter = 0;
    	
        File passengerData = new File(dataFilePath);
        if(!passengerData.canRead() || !passengerData.isFile()){System.out.println("Der Pfad konnte nicht geöffnet werden.");}
        
        // Open csv with number of baggages
    	try (BufferedReader brNumber = new BufferedReader(new FileReader(numberCsvFile))) {
              while ((lineNumber = brNumber.readLine()) != null) {
                  numberOfBaggages = lineNumber.split(cvsSplitBy);
              }
          } catch (IOException e) {
              e.printStackTrace();
          }    
        
        // Open assignment csv
        try (BufferedReader brPassengerData = new BufferedReader(new FileReader(assignmentCsvFile))) {
            while ((lineAssignment = brPassengerData.readLine()) != null) { // iterate through passengers
            	String[] dataFields = lineAssignment.split(cvsSplitBy);
            	String[] normalBaggageID = dataFields[12].split(" ");
            	ArrayList<Baggage> baggageList = new ArrayList<>();
            	
            	for (int i = 1; i <= Integer.parseInt(numberOfBaggages[passengerCounter]); i++) { // assign content foreach baggage
            		if (normalBaggageID[i-1] != "-") {
            		String baggageContent = "";
            		String contentFile = dataFilePath + "/normal_baggage_" + normalBaggageID[i-1] + ".txt";
            		try (BufferedReader brBaggageContent = new BufferedReader(new FileReader(contentFile))) { // open baggage content
        				while ((baggageContent = brBaggageContent.readLine()) != null) { // Read baggage content
        					baggageContent = brBaggageContent.readLine();
        					Baggage baggage = new NormalBaggage(baggageContent);
        					baggageList.add(baggage);
        	            }
        	        } catch (IOException e) {
        	            e.printStackTrace();
        	        }
            		}
            	}
            	passengerList.get(passengerCounter).setBaggageList(baggageList);  
            	passengerCounter++;
        	} 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberOfBaggages.length;  
    }

    public int loadAssignBulkyBaggageData(String dataFilePath){
    	// Assign certain amount of bulky baggages (amount from csv) to baggageList of all passengers
        // and create instances of baggage with content
    	
    	String assignmentCsvFile = dataFilePath + "/passenger_base_baggage_assignment.csv";
    	String numberCsvFile = dataFilePath + "/passenger_number_of_bulky_baggage.csv";
        String lineAssignment = "";
        String lineNumber = "";
        String cvsSplitBy = ",";
        String[] numberOfBaggages = null;
        int passengerCounter = 0;
    	
        File passengerData = new File(dataFilePath);
        if(!passengerData.canRead() || !passengerData.isFile()){System.out.println("Der Pfad konnte nicht geöffnet werden.");}
        
        // Open csv with number of baggages
    	try (BufferedReader brNumber = new BufferedReader(new FileReader(numberCsvFile))) {
              while ((lineNumber = brNumber.readLine()) != null) {
                  numberOfBaggages = lineNumber.split(cvsSplitBy);
              }
          } catch (IOException e) {
              e.printStackTrace();
          }    
        
        // Open assignment csv
        try (BufferedReader brPassengerData = new BufferedReader(new FileReader(assignmentCsvFile))) {
            while ((lineAssignment = brPassengerData.readLine()) != null) { // iterate through passengers
            	String[] dataFields = lineAssignment.split(cvsSplitBy);
            	String[] bulkyBaggageID = dataFields[13].split(" ");
            	ArrayList<Baggage> baggageList = new ArrayList<>();
            	
            	for (int i = 1; i <= Integer.parseInt(numberOfBaggages[passengerCounter]); i++) { // assign content foreach baggage
            		if (bulkyBaggageID[i-1] != "-") {
            		String baggageContent = "";
            		String contentFile = dataFilePath + "/bulky_baggage_" + bulkyBaggageID[i-1] + ".txt";
            		try (BufferedReader brBaggageContent = new BufferedReader(new FileReader(contentFile))) { // open baggage content
        				while ((baggageContent = brBaggageContent.readLine()) != null) { // Read baggage content
        					baggageContent = brBaggageContent.readLine();
        					Baggage baggage = new BulkyBaggage(baggageContent);
        					baggageList.add(baggage);
        	            }
        	        } catch (IOException e) {
        	            e.printStackTrace();
        	        }
            		}
            	}
            	passengerList.get(passengerCounter).setBaggageList(baggageList);  
            	passengerCounter++;
        	} 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberOfBaggages.length;  
    }

    public PassengerBaggageDatabase(String filepath){
        loadPassengerData(filepath);
        loadAssignBulkyBaggageData(filepath);
        loadAssignCabinBaggageData(filepath);
        loadAssignNormalBaggageData(filepath);
    }

    ///
    /// Getter und Setter
    ///

    public ArrayList<Passenger> getPassengerList(){
        return passengerList;
    }
}