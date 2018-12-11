package Airport.Ground_Operations;

import Airport.AirCargoPalletLifter.AirCargoPalletLifterReceipt;
import Airport.AirCargoPalletLifter.IAirCargoPalletLifter;
import Airport.Airport.Gate;
import Airport.Baggage_Sorting_Unit.Receipts.BaggageSortingUnitReceipt;
import Airport.Baggage_Sorting_Unit.Receipts.ContainerLifterReceipt;
import Airport.Baggage_Sorting_Unit.Vehicles.IBaggageVehicle;
import Airport.Baggage_Sorting_Unit.Vehicles.IContainerLifter;
import Airport.Bulky_Baggage_Desk.BulkyBaggageDeskReceipt;
import Airport.Checkin_Desk.CheckInDeskReceipt;
import Airport.Customs.CustomsReceipt;
import Airport.Federal_Police.FederalPoliceReceipt;
import Airport.Security_Check.SecurityCheckReceipt;
import Airport.Service_Vehicle.*;
import Airport.Sky_Tanking_Vehicle.FuelReceipt;
import Airport.Sky_Tanking_Vehicle.ISkyTankingVehicle;

public interface IGroundOperationsCenter {
    boolean assign(IServiceVehicleWasteWater serviceVehicleWasteWater, Gate gate);
    boolean assign(IAirCargoPalletLifter airCargoPalletLifter, Gate gate);
    boolean assign(IContainerLifter containerLifter, Gate gate);
    boolean assign(IBaggageVehicle baggageVehicle, Gate gate);
    boolean assign(IServiceVehicleBase serviceVehicleBase, Gate gate);
    boolean assign(IServiceVehicleFreshWater serviceVehicleFreshWater, Gate gate);
    boolean assign(IServiceVehicleNitrogenOxygen serviceVehicleNitrogenOxygen, Gate gate);
    boolean assign(ISkyTankingVehicle skyTankingVehicle, Gate gate);
    void recieve(CheckInDeskReceipt checkInReceipt);
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
    void recieve(ContainerLifterReceipt containerLifterReceipt);
    void recieve(FuelReceipt fuelReceipt);
    void recieve(src.Airport.Boarding_Control.BoardingControlReceipt boardingControlReceipt);
    void recieve(src.Airport.PushBack_Vehicle.PushBackVehicleReceipt pushBackVehicleReceipt);
}
