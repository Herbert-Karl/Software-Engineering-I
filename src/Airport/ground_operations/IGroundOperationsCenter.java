package Airport.ground_operations;

import Airport.air_cargo_pallet_lifter.AirCargoPalletLifterReceipt;
import Airport.air_cargo_pallet_lifter.IAirCargoPalletLifter;
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

public interface IGroundOperationsCenter {
    boolean assign(IServiceVehicleWasteWater serviceVehicleWasteWater, Gate gate);
    boolean assign(IAirCargoPalletLifter airCargoPalletLifter, Gate gate);
    boolean assign(IContainerLift containerLift, Gate gate);
    boolean assign(IBaggageVehicle baggageVehicle, Gate gate);
    boolean assign(IServiceVehicleBase serviceVehicleBase, Gate gate);
    boolean assign(IServiceVehicleFreshWater serviceVehicleFreshWater, Gate gate);
    boolean assign(IServiceVehicleNitrogenOxygen serviceVehicleNitrogenOxygen, Gate gate);
    boolean assign(ISkyTankingVehicle skyTankingVehicle, Gate gate);
    void recieve(CheckInDeskReceipt checkInDeskReceipt);
    void recieve(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt);
    void recieve(SecurityCheckReceipt securityCheckReceipt);
    void recieve(FederalPoliceReceipt federalPoliceReceipt);
    void recieve(CustomsReceipt customsReceipt);
    void recieve(BaggageSortingUnitReceipt baggageSortingUnitReceipt);
    void recieve(ServiceVehicleBaseReceipt serviceVehicleBaseReceipt);
    void recieve(ServiceVehicleNitrogenOxygenReceipt serviceVehicleNitrogenOxygenReceipt);
    void recieve(ServiceVehicleFreshWaterReceipt serviceVehicleFreshWaterReceipt);
    void recieve(ServiceVehicleWasteWaterReceipt serviceVehicleWasteWaterReceipt);
    void recieve(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt);
    void recieve(ContainerLiftReceipt containerLiftReceipt);
    void recieve(FuelReceipt fuelReceipt);
    void recieve(BoardingControlReceipt boardingControlReceipt);
    void recieve(PushBackVehicleReceipt pushBackVehicleReceipt);
}
