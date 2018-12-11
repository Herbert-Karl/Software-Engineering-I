package Airport.Ground_Operations;

import Airport.AirCargoPalletLifter.AirCargoPalletLifterReceipt;
import Airport.AirCargoPalletLifter.IAirCargoPalletLifter;
import Airport.Airport.Gate;
import Airport.Baggage_Sorting_Unit.Receipts.BaggageSortingUnitReceipt;
import Airport.Baggage_Sorting_Unit.Receipts.ContainerLifterReceipt;
import Airport.Baggage_Sorting_Unit.Vehicles.IBaggageVehicle;
import Airport.Baggage_Sorting_Unit.Vehicles.IContainerLifter;
import Airport.Boarding_Control.BoardingControlReceipt;
import Airport.Bulky_Baggage_Desk.BulkyBaggageDeskReceipt;
import Airport.Checkin_Desk.CheckInDeskReceipt;
import Airport.Customs.CustomsReceipt;
import Airport.Federal_Police.FederalPoliceReceipt;
import Airport.Pushback_Vehicle.PushBackVehicleReceipt;
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
    void receive(CheckInDeskReceipt checkInReceipt);
    void receive(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt);
    void receive(SecurityCheckReceipt securityCheckReceipt);
    void receive(FederalPoliceReceipt federalPoliceReceipt);
    void receive(CustomsReceipt customsReceipt);
    void receive(BaggageSortingUnitReceipt baggageSortingUnitReceipt);
    void receive(ServiceVehicleBaseReceipt serviceVehicleBaseReceipt);
    void receive(ServiceVehicleNitrogenOxygenReceipt serviceVehicleNitrogenOxygenReceipt);
    void receive(ServiceVehicleFreshWaterReceipt serviceVehicleFreshWaterReceipt);
    void receive(ServiceVehicleWasteWaterReceipt serviceVehicleWasteWaterReceipt);
    void receive(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt);
    void receive(ContainerLifterReceipt containerLifterReceipt);
    void receive(FuelReceipt fuelReceipt);
    void receive(BoardingControlReceipt boardingControlReceipt);
    void receive(PushBackVehicleReceipt pushBackVehicleReceipt);
}
