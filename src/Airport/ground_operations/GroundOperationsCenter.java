package Airport.ground_operations;

import Airport.air_cargo_pallet_lifter.AirCargoPalletLifterReceipt;
import Airport.air_cargo_pallet_lifter.IAirCargoPalletLifter;
import Airport.airport.Airport;
import Airport.airport.Gate;
import Airport.baggage_sorting_unit.BaggageSortingUnitReceipt;
import Airport.baggage_sorting_unit.ContainerLiftReceipt;
import Airport.baggage_sorting_unit.IBaggageVehicle;
import Airport.baggage_sorting_unit.IContainerLift;
import Airport.boarding_control.BoardingControlReceipt;
import Airport.bulky_baggage_desk.BulkyBaggageDeskReceipt;
import Airport.ckeckin_desk.CheckInDeskReceipt;
import Airport.customs.CustomsReceipt;
import Airport.federal_police.FederalPoliceReceipt;
import Airport.pushback_vehicle.PushBackVehicleReceipt;
import Airport.security_check.SecurityCheckReceipt;
import Airport.service_vehicle.*;
import Airport.sky_tanking_vehicle.FuelReceipt;
import Airport.sky_tanking_vehicle.ISkyTankingVehicle;

import java.util.ArrayList;

public class GroundOperationsCenter implements IGroundOperationsCenter, IGroundOperationsCenterLogEngine {
    private Airport airport;
    private ArrayList<ServiceVehicleWasteWaterReceipt> serviceVehicleWasteWaterReceiptArrayList;
    private ArrayList<CheckInDeskReceipt> checkInDeskReceiptArrayList;
    private ArrayList<BulkyBaggageDeskReceipt> bulkyBaggageDeskReceiptArrayList;
    private ArrayList<SecurityCheckReceipt> securityCheckReceiptArrayList;
    private ArrayList<FederalPoliceReceipt> federalPoliceReceiptArrayList;
    private ArrayList<CustomsReceipt> customsReceiptArrayList;
    private ArrayList<AirCargoPalletLifterReceipt> airCargoPalletLifterReceiptArrayList;
    private ArrayList<BaggageSortingUnitReceipt> baggageSortingUnitReceiptArrayList;
    private ArrayList<ContainerLiftReceipt> containerLiftReceiptArrayList;
    private ArrayList<ServiceVehicleBaseReceipt> serviceVehicleBaseReceiptArrayList;
    private ArrayList<ServiceVehicleNitrogenOxygenReceipt> serviceVehicleNitrogenOxygenReceiptArrayList;
    private ArrayList<ServiceVehicleFreshWaterReceipt> serviceVehicleFreshWaterReceiptArrayList;
    private ArrayList<FuelReceipt> fuelReceiptArrayList;
    private ArrayList<BoardingControlReceipt> boardingControlReceiptArrayList;
    private ArrayList<PushBackVehicleReceipt> pushBackVehicleReceiptArrayList;

    public GroundOperationsCenter(Airport airport) {
        this.airport = airport;
    }

    @Override
    public boolean assign(IServiceVehicleWasteWater serviceVehicleWasteWater, Gate gate) {
        return false;
    }

    @Override
    public boolean assign(IAirCargoPalletLifter airCargoPalletLifter, Gate gate) {
        return false;
    }

    @Override
    public boolean assign(IContainerLift containerLift, Gate gate) {
        return false;
    }

    @Override
    public boolean assign(IBaggageVehicle baggageVehicle, Gate gate) {
        return false;
    }

    @Override
    public boolean assign(IServiceVehicleBase serviceVehicleBase, Gate gate) {
        return false;
    }

    @Override
    public boolean assign(IServiceVehicleFreshWater serviceVehicleFreshWater, Gate gate) {
        return false;
    }

    @Override
    public boolean assign(IServiceVehicleNitrogenOxygen serviceVehicleNitrogenOxygen, Gate gate) {
        return false;
    }

    @Override
    public boolean assign(ISkyTankingVehicle skyTankingVehicle, Gate gate) {
        return false;
    }

    @Override
    public void recieve(CheckInDeskReceipt checkInDeskReceipt) {

    }

    @Override
    public void recieve(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt) {

    }

    @Override
    public void recieve(SecurityCheckReceipt securityCheckReceipt) {

    }

    @Override
    public void recieve(FederalPoliceReceipt federalPoliceReceipt) {

    }

    @Override
    public void recieve(CustomsReceipt customsReceipt) {

    }

    @Override
    public void recieve(BaggageSortingUnitReceipt baggageSortingUnitReceipt) {

    }

    @Override
    public void recieve(ServiceVehicleBaseReceipt serviceVehicleBaseReceipt) {

    }

    @Override
    public void recieve(ServiceVehicleNitrogenOxygenReceipt serviceVehicleNitrogenOxygenReceipt) {

    }

    @Override
    public void recieve(ServiceVehicleFreshWaterReceipt serviceVehicleFreshWaterReceipt) {

    }

    @Override
    public void recieve(ServiceVehicleWasteWaterReceipt serviceVehicleWasteWaterReceipt) {

    }

    @Override
    public void recieve(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt) {

    }

    @Override
    public void recieve(ContainerLiftReceipt containerLiftReceipt) {

    }

    @Override
    public void recieve(FuelReceipt fuelReceipt) {

    }

    @Override
    public void recieve(BoardingControlReceipt boardingControlReceipt) {

    }

    @Override
    public void recieve(PushBackVehicleReceipt pushBackVehicleReceipt) {

    }

    @Override
    public void log(ArrayList<?> ReceiptList) {

    }
}
