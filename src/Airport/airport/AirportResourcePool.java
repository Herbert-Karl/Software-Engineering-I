package Airport.airport;

import Airport.air_cargo_pallet_lifter.IAirCargoPalletLifter;
import Airport.air_cargo_pallet_lifter.IAirCargoPalletVehicle;
import Airport.baggage_sorting_unit.IBaggageVehicle;
import Airport.baggage_sorting_unit.IContainerLift;
import Airport.base.Employee;
import Airport.base.IDCard;
import Airport.service_vehicle.IServiceVehicleBase;
import Airport.service_vehicle.IServiceVehicleFreshWater;
import Airport.service_vehicle.IServiceVehicleNitrogenOxygen;
import Airport.service_vehicle.IServiceVehicleWasteWater;
import Airport.sky_tanking_vehicle.ISkyTankingVehicle;

import java.util.ArrayList;

public class AirportResourcePool {
    private ArrayList<IDCard> idCardArrayList;
    private ArrayList<Employee> employeeArrayList;
    private ArrayList<IAirCargoPalletLifter> airCargoPalletLifterArrayList;
    private ArrayList<IAirCargoPalletVehicle> airCargoPalletVehicleArrayList;
    private ArrayList<IContainerLift> containerLiftArrayList;
    private ArrayList<IBaggageVehicle> baggageVehicleArrayList;
    private ArrayList<IServiceVehicleBase> serviceVehicleBaseArrayList;
    private ArrayList<IServiceVehicleFreshWater> serviceVehicleFreshWaterArrayList;
    private ArrayList<IServiceVehicleNitrogenOxygen> serviceVehicleNitrogenOxygenArrayList;
    private ArrayList<IServiceVehicleWasteWater> serviceVehicleWasteWaterArrayList;
    private ArrayList<ISkyTankingVehicle> skyTankingVehicleArrayList;

    public AirportResourcePool() {
    }

    public void build() {

    }

    public ArrayList<IDCard> getIdCardArrayList() {
        return idCardArrayList;
    }

    public void setIdCardArrayList(ArrayList<IDCard> idCardArrayList) {
        this.idCardArrayList = idCardArrayList;
    }

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void setEmployeeArrayList(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
    }

    public ArrayList<IAirCargoPalletLifter> getAirCargoPalletLifterArrayList() {
        return airCargoPalletLifterArrayList;
    }

    public void setAirCargoPalletLifterArrayList(ArrayList<IAirCargoPalletLifter> airCargoPalletLifterArrayList) {
        this.airCargoPalletLifterArrayList = airCargoPalletLifterArrayList;
    }

    public ArrayList<IAirCargoPalletVehicle> getAirCargoPalletVehicleArrayList() {
        return airCargoPalletVehicleArrayList;
    }

    public void setAirCargoPalletVehicleArrayList(ArrayList<IAirCargoPalletVehicle> airCargoPalletVehicleArrayList) {
        this.airCargoPalletVehicleArrayList = airCargoPalletVehicleArrayList;
    }

    public ArrayList<IContainerLift> getContainerLiftArrayList() {
        return containerLiftArrayList;
    }

    public void setContainerLiftArrayList(ArrayList<IContainerLift> containerLiftArrayList) {
        this.containerLiftArrayList = containerLiftArrayList;
    }

    public ArrayList<IBaggageVehicle> getBaggageVehicleArrayList() {
        return baggageVehicleArrayList;
    }

    public void setBaggageVehicleArrayList(ArrayList<IBaggageVehicle> baggageVehicleArrayList) {
        this.baggageVehicleArrayList = baggageVehicleArrayList;
    }

    public ArrayList<IServiceVehicleBase> getServiceVehicleBaseArrayList() {
        return serviceVehicleBaseArrayList;
    }

    public void setServiceVehicleBaseArrayList(ArrayList<IServiceVehicleBase> serviceVehicleBaseArrayList) {
        this.serviceVehicleBaseArrayList = serviceVehicleBaseArrayList;
    }

    public ArrayList<IServiceVehicleFreshWater> getServiceVehicleFreshWaterArrayList() {
        return serviceVehicleFreshWaterArrayList;
    }

    public void setServiceVehicleFreshWaterArrayList(ArrayList<IServiceVehicleFreshWater> serviceVehicleFreshWaterArrayList) {
        this.serviceVehicleFreshWaterArrayList = serviceVehicleFreshWaterArrayList;
    }

    public ArrayList<IServiceVehicleNitrogenOxygen> getServiceVehicleNitrogenOxygenArrayList() {
        return serviceVehicleNitrogenOxygenArrayList;
    }

    public void setServiceVehicleNitrogenOxygenArrayList(ArrayList<IServiceVehicleNitrogenOxygen> serviceVehicleNitrogenOxygenArrayList) {
        this.serviceVehicleNitrogenOxygenArrayList = serviceVehicleNitrogenOxygenArrayList;
    }

    public ArrayList<IServiceVehicleWasteWater> getServiceVehicleWasteWaterArrayList() {
        return serviceVehicleWasteWaterArrayList;
    }

    public void setServiceVehicleWasteWaterArrayList(ArrayList<IServiceVehicleWasteWater> serviceVehicleWasteWaterArrayList) {
        this.serviceVehicleWasteWaterArrayList = serviceVehicleWasteWaterArrayList;
    }

    public ArrayList<ISkyTankingVehicle> getSkyTankingVehicleArrayList() {
        return skyTankingVehicleArrayList;
    }

    public void setSkyTankingVehicleArrayList(ArrayList<ISkyTankingVehicle> skyTankingVehicleArrayList) {
        this.skyTankingVehicleArrayList = skyTankingVehicleArrayList;
    }
}
