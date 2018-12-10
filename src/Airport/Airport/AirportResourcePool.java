package Airport.Airport;

import Airport.AirCargoPalletLifter.AirCargoPalletLifter;
import Airport.AirCargoPalletLifter.AirCargoPalletLifter;
import Airport.AirCargoPalletLifter.AirCargoPalletVehicel;
import Airport.AirCargoPalletLifter.AirCargoPalletVehicle;
import Airport.Baggage_Sorting_Unit.Vehicles.IBaggageVehicle;
import Airport.Baggage_Sorting_Unit.Vehicles.IContainerLifter;
import Airport.Base.Employee;
import Airport.Base.IDCard;
import Airport.Service_Vehicle.*;
import Airport.Sky_Tanking_Vehicle.ISkyTankingVehicle;
import Airport.Base.Gender;
import Airport.Baggage_Sorting_Unit.Vehicles.ContainerLifter;
import Airport.Baggage_Sorting_Unit.Vehicles.BaggageVehicle;
import Airport.Sky_Tanking_Vehicle.SkyTankingVehicle;

import java.util.ArrayList;
import java.util.UUID;

import static Airport.Base.Gender.Female;
import static Airport.Base.Gender.Male;

public class AirportResourcePool{
    private ArrayList<IDCard> idCardList;
    private ArrayList<Employee> employeeList;
    private ArrayList<AirCargoPalletLifter> airCargoPalletLifterList;
    private ArrayList<AirCargoPalletVehicle> airCargoPalletVehicleList;
    private ArrayList<IContainerLifter> containerLifterList;
    private ArrayList<IBaggageVehicle> baggageVehicleList;
    private ArrayList<IServiceVehicleBase> serviceVehicleBaseList;
    private ArrayList<IServiceVehicleFreshWater> serviceVehicleFreshWaterList;
    private ArrayList<IServiceVehicleNitrogenOxygen> serviceVehicleNitrogenOxigenList;
    private ArrayList<IServiceVehicleWasteWater> serviceVehicleWasteWaterList;
    private ArrayList<ISkyTankingVehicle> skyTankingVehicleList;

    AirportResourcePool(int anzahlEmployees, int anzahlAirCargoPalletLifter, int anzahlAirCargoPalletVehicle, int anzahlContainerLifter,
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
        Gender gender;
       //generate anzahl
        for(int i = 0; i<anzahl; i++){
            //Generate Employee and IDCard
            if((zaehler%2) != 0){gender = Female;} else {gender = Male; }  //Abwechselnd MALE und FEMALE
            IDCard idCard = new IDCard();
            Employee employee = new Employee(zaehler, name, gender);
            idCard.setEmployee(employee);
            employee.setIdCard(idCard);
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
            String id = "" + zaehler;
            //NEED TO SET PARAMETERS
           AirCargoPalletLifter lifter = new AirCargoPalletLifter(palletLifterUUID.toString(), id, "", 0, false, null, 0, null,null, null);
            airCargoPalletLifterList.add(lifter);
            zaehler++;
        }
    }

    private void generateAirCargoPalletVehicle(int anzahl){

        airCargoPalletVehicleList = new ArrayList(anzahl);
        int zaehler = 2000;
        //Mit Schleife generieren
        for(int i = 0; i<anzahl; i++){
            UUID uuid = UUID.randomUUID();
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
       //TODO
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
            UUID uuid = UUID.randomUUID();
            String id = "" + zaehler;
            ServiceVehicleBase vehicleBase = new ServiceVehicleBase(uuid.toString(), id, "", 0, false, null, null, null);
            serviceVehicleBaseList.add(vehicleBase);
            zaehler++;
        }
        //TODO
    }

    private void generateServiceVehicleFreshWater(int anzahl){
        serviceVehicleFreshWaterList = new ArrayList(anzahl);
        int zaehler = 4000;
        for(int i = 0; i<anzahl; i++){
           //NEED TO SET PARAMETERS
            UUID uuid = UUID.randomUUID();
            String id = "" + zaehler;
           ServiceVehicleFreshWater freshWater = new ServiceVehicleFreshWater(uuid.toString(), id, "", 0, false, null, null, null);
           serviceVehicleFreshWaterList.add(freshWater);
           zaehler++;
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
            UUID uuid = UUID.randomUUID();
            String id = "" + zaehler;
           ServiceVehicleNitrogenOxygen nitrogenOxygen = new ServiceVehicleNitrogenOxygen(uuid.toString(), id, "", 0, false, false, null, null, null);
           serviceVehicleNitrogenOxigenList.add(nitrogenOxygen);
           zaehler++;
        }
        //TODO
    }

    private void generateServiceVehicleWasteWater(int anzahl){
        //set length of list
        serviceVehicleWasteWaterList = new ArrayList(anzahl);
        int zaehler = 5000;
        for(int i = 0; i<anzahl; i++){
            //NEED TO SET PARAMETERS
            UUID uuid = UUID.randomUUID();
            String id = "" + zaehler;
            ServiceVehicleWasteWater wasteWater = new ServiceVehicleWasteWater(uuid.toString(), id, "", 0, false, 0, null, null, null);
            serviceVehicleWasteWaterList.add(wasteWater);
            zaehler++;
        }
        //TODO
    }

    private void generateSkyTankingVehicle(int anzahl){
        //set length of list
        skyTankingVehicleList = new ArrayList(anzahl);
        int zaehler = 5500;
        for(int i = 0; i<anzahl; i++){
            //NEED TO SET PARAMETERS
            UUID uuid = UUID.randomUUID();
            String id = "" + zaehler;
            SkyTankingVehicle skyTankingVehicle = new SkyTankingVehicle(uuid.toString(), id, "", 0, null, null, flase);
            skyTankingVehicleList.add(skyTankingVehicle);
            zaehler++;
        }
        //TODO
    }

    //
    // Getter und Setter / Take und Return
    //

    public <T> T takeResource(String resourceClass){
        //TODO
        switch(resourceClass){
            case "Employee":
                T element= (T)employeeList.get(0);
                employeeList.remove(0);
                return element;
                break;
            case "AirCargoPalletLifter":
                T element1 = (T)airCargoPalletLifterList.get(0);
                airCargoPalletLifterList.remove(0);
                return element1;
                break;
            case "AirCargoPalletVehicle":
                T element2 = (T) airCargoPalletLifterList.get(0);
                airCargoPalletLifterList.remove(0);
                return element2;
                break;
            case "ContainerLifter":
                T element3 = (T) containerLifterList.get(0);
                containerLifterList.remove(0);
                return element3;
                break;
            case "BaggageVehicle":
                T element4 = (T) baggageVehicleList.get(0);
                baggageVehicleList.remove(0);
                return element4;
                break;
            case "ServiceVehicleBase":
                T element5 = (T) serviceVehicleBaseList.get(0);
                serviceVehicleBaseList.remove(0);
                return element5;
                break;
            case "ServiceVehicleFreshWater":
                T element6 = (T) serviceVehicleFreshWaterList.get(0);
                serviceVehicleFreshWaterList.remove(0);
                return element6;
                break;
            case "ServiceVehicleNitrogenOxygen":
                T element7 = (T) serviceVehicleNitrogenOxigenList.get(0);
                serviceVehicleNitrogenOxigenList.remove(0);
                return element7;
                break;
            case "ServiceVehicleWasteWater":
                T element8 = (T) serviceVehicleWasteWaterList.get(0);
                serviceVehicleWasteWaterList.remove(0);
                return element8;
                break;
            case "SkyTankingVehicle":
                T element9 = (T) skyTankingVehicleList.get(0);
                skyTankingVehicleList.remove(0);
                return element9;
                break;
        }
    }

    public <E>void returnResource(E resource){
        if(resource instanceof Employee){
            Employee employee = (Employee) resource;
            employeeList.add(employee);
        } else if(resource instanceof AirCargoPalletLifter){
            AirCargoPalletLifter airCargoPalletLifter = (AirCargoPalletLifter) resource;
            airCargoPalletLifterList.add(airCargoPalletLifter);
        } else if (resource instanceof AirCargoPalletVehicle){
            AirCargoPalletVehicle airCargoPalletVehicle = (AirCargoPalletVehicle) resource;
            airCargoPalletVehicleList.add(airCargoPalletVehicle);
        } else if(resource instanceof ContainerLifter){
            ContainerLifter containerLifter = (ContainerLifter) resource;
            containerLifterList.add(containerLifter);
        } else if(resource instanceof BaggageVehicle){
            BaggageVehicle baggageVehicle = (BaggageVehicle) resource;
            baggageVehicleList.add(baggageVehicle);
        } else if(resource instanceof ServiceVehicleBase){
            ServiceVehicleBase serviceVehicleBase = (ServiceVehicleBase) resource;
            serviceVehicleBaseList.add(serviceVehicleBase);
        } else if(resource instanceof ServiceVehicleFreshWater){
            ServiceVehicleFreshWater serviceVehicleFreshWater = (ServiceVehicleFreshWater) resource;
            serviceVehicleFreshWaterList.add(serviceVehicleFreshWater);
        } else if(resource instanceof ServiceVehicleNitrogenOxygen){
            ServiceVehicleNitrogenOxygen serviceVehicleNitrogenOxygen = (ServiceVehicleNitrogenOxygen) resource;
            serviceVehicleNitrogenOxigenList.add(serviceVehicleNitrogenOxygen);
        } else if(resource instanceof ServiceVehicleWasteWater){
            ServiceVehicleWasteWater serviceVehicleWasteWater = (ServiceVehicleWasteWater) resource;
            serviceVehicleWasteWaterList.add(serviceVehicleWasteWater);
        } else if(resource instanceof SkyTankingVehicle){
            SkyTankingVehicle skyTankingVehicle = (SkyTankingVehicle) resource;
            skyTankingVehicleList.add(skyTankingVehicle);
        }

    }

    public void build(int anzahlEmployees, int anzahlAirCargoPalletLifter, int anzahlAirCargoPalletVehicle, int anzahlContainerLifter,
                      int anzahlBaggageVehicle, int anzahlServiceVehicleBase, int anzahlServiceVehicleFreshWater, int anzahlServiceVehicleNitogenOxygen,
                      int anzahlServiceVehicleWasteWater, int anzahlSkyTankingVehicle){
        generateEmployeesAndIDCards(anzahlEmployees);
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