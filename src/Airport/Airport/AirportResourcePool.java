package Airport.Airport;

import Airport.Base.Employee;
import Airport.Base.IDCard;
import Airport.Service_Vehicle.IServiceVehicleBase;
import Airport.Service_Vehicle.IServiceVehicleFreshWater;
import Airport.Service_Vehicle.IServiceVehicleWasteWater;
import Airport.Base.Employee;

import java.util.ArrayList;

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

    private void generateEmployees(){
        for(int i = 0; i<50; i++){
           //Generate Employee
            // Put Employee on ArrayList
        }
    }

    public void build(){

        //TODO
    }
}