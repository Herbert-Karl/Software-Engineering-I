package Airport.Airport;

import Airport.AirCargoPalletLifter.AirCargoPalletLifter;
import Airport.AirCargoPalletLifter.IAirCargoPalletLifter;
import Airport.Baggage_Sorting_Unit.Vehicles.IBaggageVehicle;
import Airport.Baggage_Sorting_Unit.Vehicles.IContainerLifter;
import Airport.Base.Employee;
import Airport.Base.IDCard;
import Airport.Service_Vehicle.IServiceVehicleBase;
import Airport.Service_Vehicle.IServiceVehicleFreshWater;
import Airport.Service_Vehicle.IServiceVehicleNitrogenOxygen;
import Airport.Service_Vehicle.IServiceVehicleWasteWater;
import Airport.Base.*;
import Airport.Sky_Tanking_Vehicle.ISkyTankingVehicle;

import java.util.ArrayList;
import java.util.UUID;

public class AirportRecourcePool{
    private ArrayList<IDCard> idCardList;
    private ArrayList<Employee> employeeList;
    private ArrayList<IAirCargoPalletLifter> airCargoPalletLifterList;
    private ArrayList<IAirCargoPalletVehicle> airCargoPalletVehicleList;
    private ArrayList<IContainerLifter> containerLifterList;
    private ArrayList<IBaggageVehicle> baggageVehicleList;
    private ArrayList<IServiceVehicleBase> serviceVehicleBaseList;
    private ArrayList<IServiceVehicleFreshWater> serviceVehicleFreshWaterList;
    private ArrayList<IServiceVehicleNitrogenOxygen> serviceVehicleNitrogenOxigenList;
    private ArrayList<IServiceVehicleWasteWater> serviceVehicleWasteWaterList;
    private ArrayList<ISkyTankingVehicle> skyTankingVehicleList;

    public AirportResourcePool(int anzahlEmployees, int anzahlAirCargoPalletLifter, int anzahlAirCargoPalletVehicle, int anzahlContainerLifter,
                               int anzahlBaggageVehicle, int anzahlServiceVehicleBase, int anzahlServiceVehicleFreshWater, int anzahlServiceVehicleNitogenOxygen,
                               int anzahlServiceVehicleWasteWater, int anzahlSkyTankingVehicle){
        build(anzahlEmployees, anzahlAirCargoPalletLifter, anzahlAirCargoPalletVehicle, anzahlContainerLifter, anzahlBaggageVehicle,
                anzahlServiceVehicleBase, anzahlServiceVehicleFreshWater, anzahlServiceVehicleNitogenOxygen, anzahlServiceVehicleWasteWater,
                anzahlSkyTankingVehicle);
    }

    //
    // Generate Methoden
    //

    private void generateEmployeesAndIDCards(int anzahl){
        //set length lists
        idCardList = new ArrayList(anzahl);
        employeeList = new ArrayList(anzahl);
        //set "constants"
        int zaehler = 1000;
        String name = "Max Mustermann";
/       //generate anzahl
        for(int i = 0; i<anzahl; i++){
            //Generate Employee and IDCard
            if((zaehler%2) != 0){gender = FEMALE;} else {gender = MALE; }  //Abwechselnd MALE und FEMALE
            IDCard idCard = new IDCard();
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
        airCargoPalletLifterList = new ArrayList(anzahl);

        int zaehler = 1500;
        UUID palletLifterUUID = null;
        //Type?
        for(int i = 0; i<anzahl; i++){
            palletLifterUUID = UUID.randomUUID();
            String uuidLifter = palletLifterUUID.toString();
            //NEED TO SET PARAMETERS
           AirCargoPalletLifter lifter = new AirCargoPalletLifter();
            airCargoPalletLifterList.add(lifter);
        }
    }

    private void generateAirCargoPalletVehicle(int anzahl){

        airCargoPalletVehicleList = new ArrayList(anzahl);
        int zaehler = 2000;
        UUID palletVehicleUUID = null;
        //Mit Schleife generieren
        for(int i = 0; i<anzahl; i++){
            palletVehicleUUID = UUID.randomUUID;
            String uuidPalletVehicle = palletVehicleUUID.toString();
            //NEED TO SET PARAMETERS
           AirCargoPalletVehicle palletVehicle = new AirCargoPalletVehicle();
           //In Liste schreiben
        }
        //TODO
    }

    private void generateContainerLifter(int anzahl){
        containerLifterList = new ArrayList(anzahl);
        int zaehler = 2500;
        //type?
        for(int i = 0; i<anzahl; i++){
           //NEED TO SET PARAMETERS
           ContainerLifter containerLifter = new ContainerLifter();
            containerLifterList.add(containerLifter);
        }
/       //TODO
    }

    private void generateBaggageVehicle(int anzahl){
        baggageVehicleList = new ArrayList(anzahl);
        int zaehler = 3000;
        //type?
        for(int i = 0; i<anzahl; i++){
           //NEED TO SET PARAMETERS
            BaggageVehicle baggageVehicle = new BaggageVehicle();
            baggageVehicleList.add(baggageVehicle);
        }
        //TODO
    }

    private void generateServiceVehicleBase(int anzahl){
        serviceVehicleBaseList = new ArrayList(anzahl);
        int zaehler = 3500;
        for(int i = 0; i<anzahl; i++){
            //NEED TO SET PARAMETERS
            ServiceVehicleBase vehicleBase = new ServiceVehicleBase();
            serviceVehicleBaseList.add(vehicleBase);
        }
        //TODO
    }

    private void generateServiceVehicleFreshWater(int anzahl){
        serviceVehicleFreshWaterList = new ArrayList(anzahl);
        int zaehler = 4000;
        for(int i = 0; i<anzahl; i++){
           //NEED TO SET PARAMETERS
           ServiceVehicleFreshWater freshWater = new ServiceVehicleFreshWater();
           serviceVehicleFreshWaterList.add(freshWater);
        }
        //TODO
    }

    private void generateServiceVehicleNitrogenOxygen(int anzahl){
        //set length of list
        serviceVehicleNitrogenOxigenList = new ArrayList(anzahl);
        int zaehler = 4500;
        //type?
        for(int i = 0; i<anzahl; i++){
            //NEED TO SET PARAMETERS
           ServiceVehicleNitrogenOxygen nitrogenOxygen = new ServiceVehicleNitrogenOxygen();
           serviceVehicleNitrogenOxigenList.add(nitrogenOxygen);
        }
        //TODO
    }

    private void generateServiceVehicleWasteWater(int anzahl){
        //set length of list
        serviceVehicleWasteWaterList = new ArrayList(anzahl);
        int zaehler = 5000;
        for(int i = 0; i<anzahl; i++){
            //NEED TO SET PARAMETERS
            ServiceVehicleWasteWater wasteWater = new serviceVehicleWastewater();
            serviceVehicleWasteWaterList.add(wasteWater);
        }
        //TODO
    }

    private void generateSkyTankingVehicle(int anzahl){
        //set length of list
        skyTankingVehicleList = new ArraylList(anzahl);
        int zaehler = 5500;
        for(int i = 0; i<anzahl; i++){
            //NEED TO SET PARAMETERS
            SkyTankingVehicle skyTankingVehicle = new SkyTankingVehicle();
            skyTankingVehicleList.add(skyTankingVehicle);
        }
        //TODO
    }

    //
    // Getter und Setter / Take und Return
    //

    public <E> takeResource(String resourceClass){
        //TODO
        switch(resourceClass){
            case "Employee":
                return employeeList.remove(0);
                break;
            case "AirCargoPalletLifter":
                return airCargoPalletLifterList.remove(0);
                break;
            case "AirCargoPalletVehicle":
                return airCargoPalletLifterList.remove(0);
                break;
            case "ContainerLifter":
                return containerLifterList.remove(0);
                break;
            case "BaggageVehicle":
                return baggageVehicleList.remove(0);
                break;
            case "ServiceVehicleBase":
                return serviceVehicleBaseList.remove(0);
                break;
            case "ServiceVehicleFreshWater":
                return serviceVehicleFreshWaterList.remove(0);
                break;
            case "ServiceVehicleNitrogenOxygen":
                return serviceVehicleNitrogenOxigenList.remove(0);
                break;
            case "ServiceVehicleWasteWater":
                return serviceVehicleWasteWaterList.remove(0);
                break;
            case "SkyTankingVehicle":
                return skyTankingVehicleList.remove(0);
                break;
        }
    }

    public <E>void returnResource(E resource){
        if(resource instanceof Employee){
            employeeList.add(resource);
        } else if(resource instanceof AirCargoPalletLifter){
            airCargoPalletLifterList.add(resource);
        } else if (resource instanceof AirCargoPalletVehicle){
            airCargoPalletVehicleList.add(resource);
        } else if(resource instanceof ContainerLifter){
            containerLifterList.add(resource);
        } else if(resouce instanceof BaggageVehicle){
            baggageVehicleList.add(resource);
        } else if(resource instanceof ServiceVehicleBase){
            serviceVehicleBaseList.add(resource);
        } else if(resource instanceof ServiceVehicleFreshWater){
            serviceVehicleFreshWaterList.add(resource);
        } else if(resource instanceof ServiceVehicleNitrogenOxygen){
            serviceVehicleNitrogenOxigenList.add(resource);
        } else if(resource instanceof ServiceVehicleWasteWater){
            serviceVehicleWasteWaterList.add(resource);
        } else if(resource instanceof SkyTankingVehicle){
            skyTankingVehicleList.add(resource);
        }

    }

    public void build(int anzahlEmployees, int anzahlAirCargoPalletLifter, int anzahlAirCargoPalletVehicle, int anzahlContainerLifter,
                      int anzahlBaggageVehicle, int anzahlServiceVehicleBase, int anzahlServiceVehicleFreshWater, int anzahlServiceVehicleNitogenOxygen,
                      int anzahlServiceVehicleWasteWater, int anzahlSkyTankingVehicle){
        generateEmployeesAndIDCard(anzahlEmployees);
        generateAirCargoPalletLifter(anzahlAirCargoPalletLifter);
        generateAirCargoPalletVehicle(anzahlAirCargoPalletVehicle);
        generateContainerLifter(anzahlContainerLifter);
        generateBaggageVehicle(anzahlBaggageVehicle);
        generateServiceVehicleBase(anzahlServiceVehicleBase);
        generateServiceVehicleFreshWater(anzahlServiceVehicleFreshWater);
        generateServiceVehicleNitrogenOxygen(anzahlServiceVehicleNitogenOxygen);
        generateServiceVehicleWasteWater(anzahlServiceVehicleWasteWater);
        generateSkyTankingVehicle(anzahlSkyTankingVehicle);
    }
}