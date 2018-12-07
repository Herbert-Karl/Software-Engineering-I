package Airport.Airport;

import Airport.Base.Employee;
import Airport.Base.IDCard;
import Airport.Service_Vehicle.IServiceVehicleBase;
import Airport.Service_Vehicle.IServiceVehicleFreshWater;
import Airport.Service_Vehicle.IServiceVehicleWasteWater;
import Airport.Base.*;

import java.util.ArrayList;
import java.util.UUID;

public class AirportRecourcePool{
    private ArrayList<IDCard> idCardList;
    private ArrayList<Employee> employeeList;
    private Arraylist<IAirCargoPalletLifter> airCargoPalletLifterList;
    private ArrayList<IAirCargoPalletVehicle> airCargoPalletVehicleList;
    private ArrayList<IContainerLifter> containerLifterList;
    private ArrayList<IBaggageVehicle> baggageVehicleList;
    private ArrayList<IServiceVehicleBase> serviceVehicleBaseList;
    private ArrayList<IServiceVehicleFreshWater> serviceVehicleFreshWaterList;
    private ArrayList<IServiceVehicleNitrogenOxigen> serviceVehicleNitrogenOxigenList;
    private ArrayList<IServiceVehicleWasteWater> serviceVehicleWasteWaterList;
    private ArrayList<ISkyTankingVehicle> skyTankingVehicleList;

    public AirportResourcePool(){

    }

    private void generateEmployeesAndIDCards(int anzahl){
        //set length lists
        idCardList = new ArrayList(anzahl);
        employeeList = new ArrayList(anzahl);
        //set "constants"
        int zaehler = 1000;
        UUID employeeUUID = null;
        UUID idCardUUID = null;
        String name = "Max Mustermann";
/       //generate anzahl
        for(int i = 0; i<anzahl; i++){
            //Generate Employee and IDCard
            employeeUUID = UUID.randomUUID();
            idCardUUID = UUID.randomUUID();
            String uuid_employee = employeeUUID.toString();
            String uuid_card = idCardUUID.toString();
            if((zaehler%2 != 0)){gender = FEMALE;} else {gender = MALE; }  //Abwechselnd MALE und FEMALE
            IDCard idCard = new IDCard(uuid_card);
            Employee employee = new Employee(uuid_employee, zähler, name, gender);
            idCard.setEmployee(employee);
            employee.setIDCard(idCard);
            // Put Employee and IDCard on ArrayList
            employeeList.add(employee);
            idCardList.add(idCard);
            zaehler++;
        }
    }

    private void generateAirCargoPalletLifter(int anzahl){
        //set length of lists
        airCargoPalletLifterList = new ArrayList(anzahl);
        int zaehler = 2000;
        UUID palletLifterUUID = null;
        //TODO
        //Type?
        //Mit for-Schleife generieren
        //Put on ArrayList
    }

    private void generateAirCargoPalletVehicle(int anzahl){
        //set length of list
        airCargoPalletVehicleList = new ArrayList(anzahl);
        //TODO
    }

    private void generateContainerLifter(int anzahl){
        //set length of list
        containerLifterList = new ArrayList(anzahl);
/       //TODO
    }

    private void generateBaggageVehicle(int anzahl){
        //set length of list
        baggageVehicleList = new ArrayList(anzahl);
        //TODO
    }

    private void generateServiceVehicleBase(int anzahl){
        //set length of list
        serviceVehicleBaseList = new ArrayList(anzahl);
        //TODO
    }

    private void generateServiceVehicleFreshWater(int anzahl){
        //set length of list
        serviceVehicleFreshWaterList = new ArrayList(anzahl);
        //TODO
    }

    private void generateServiceVehicleNitrogenOxygen(int anzahl){
        //set length of list
        serviceVehicleNitrogenOxigenList = new ArrayList(anzahl);
        //TODO
    }

    private void generateServiceVehicleWasteWater(int anzahl){
        //set length of list
        serviceVehicleWasteWaterList = new ArrayList(anzahl);
        //TODO
    }

    private void generateSkyTankingVehicle(int anzahl){
        //set length of list
        skyTankingVehicleList = new ArraylList(anzahl);
        //TODO
    }

    public void build(){
        generateEmployeesAndIDCards(50);
        generateAirCargoPalletLifter(50);
        generateAirCargoPalletVehicle(50);
        generateContainerLifter(50);
        generateBaggageVehicle(50);
        generateServiceVehicleBase(50);
        generateServiceVehicleFreshWater(50);
        generateServiceVehicleNitrogenOxygen(50);
        generateServiceVehicleWasteWater(50);
        generateSkyTankingVehicle(50);
        //TODO
    }
}