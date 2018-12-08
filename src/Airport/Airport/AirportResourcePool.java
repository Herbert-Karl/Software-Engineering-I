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

    public AirportResourcePool(ArrayList<IDCard> idCardList, ArrayList<Employee> employeeList, ArrayList<IAirCargoPalletLifter> containerLifterList,
                               ArrayList<IAirCargoPalletVehicle> airCargoPalletVehicleList, ArrayList<IContainerLifter> containerLifterList,
                               ArrayList<IBaggageVehicle> baggageVehicleList, ArrayList<IServiceVehicleBase> serviceVehicleBaseList,
                               ArrayList<IServiceVehicleFreshWater> serviceVehicleFreshWaterList,
                               ArrayList<IServiceVehicleNitrogenOxigen> serviceVehicleNitrogenOxigenList,
                               ArrayList<IServiceVehicleWasteWater> serviceVehicleWasteWaterList, ArrayList<ISkyTankingVehicle> skyTankingVehicleList){
        this.idCardList = idCardList;
        this.employeeList = employeeList;
        this.airCargoPalletLifterList = airCargoPalletLifterList;
        this.airCargoPalletVehicleList = airCargoPalletVehicleList;
        this.containerLifterList = containerLifterList;
        this.baggageVehicleList = baggageVehicleList;
        this.serviceVehicleBaseList = serviceVehicleBaseList;
        this.serviceVehicleFreshWaterList = serviceVehicleFreshWaterList;
        this.serviceVehicleNitrogenOxigenList = serviceVehicleNitrogenOxigenList;
        this.serviceVehicleWasteWaterList = serviceVehicleWasteWaterList;
        this.skyTankingVehicleList = skyTankingVehicleList;
    }

    private void generateEmployeesAndIDCards(){
        int zähler = 1000;
        UUID employeeUUID = null;
        UUID idCardUUID = null;
        String name = "Max Mustermann";

        for(int i = 0; i<50; i++){
            //Generate Employee and IDCard
            employeeUUID = UUID.randomUUID();
            idCardUUID = UUID.randomUUID();
            String uuid_employee = employeeUUID.toString();
            String uuid_card = idCardUUID.toString();
            if((zähler%2 != 0)){gender = FEMALE;} else {gender = MALE; }  //Abwechselnd MALE und FEMALE
            IDCard idCard = new IDCard(uuid_card);
            Employee employee = new Employee(uuid_employee, zähler, name, gender);
            idCard.setEmployee(employee);
            employee.setIDCard(idCard);
            // Put Employee and IDCard on ArrayList
            employeeList.add(employee);
            idCardList.add(idCard);
            zähler++;
        }
    }

    public void build(){
        //Set lengh of lists
        idCardList = new ArrayList(50);
        employeeList = new ArrayList(50);
        airCargoPalletLifterList = new ArrayList(50);
        airCargoPalletVehicleList = new ArrayList(50);
        containerLifterList = new ArrayList(50);
        baggageVehicleList = new ArrayList(50);
        serviceVehicleBaseList = new ArrayList(50);
        serviceVehicleFreshWaterList = new ArrayList(50);
        serviceVehicleNitrogenOxigenList = new ArrayList(50);
        serviceVehicleWasteWaterList = new ArrayList(50);
        skyTankingVehicleList = new ArraylList(50);
        //build IDCards and Employyees
        generateEmployeesAndIDCards();
        //
        //TODO
    }
}