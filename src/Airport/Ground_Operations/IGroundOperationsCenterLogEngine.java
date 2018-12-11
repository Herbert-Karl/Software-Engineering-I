package Airport.Ground_Operations;

import Airport.AirCargoPalletLifter.AirCargoPalletLifterReceipt;
import Airport.Baggage_Sorting_Unit.Receipts.BaggageSortingUnitReceipt;
import Airport.Baggage_Sorting_Unit.Receipts.ContainerLifterReceipt;
import Airport.Boarding_Control.BoardingControlReceipt;
import Airport.Bulky_Baggage_Desk.BulkyBaggageDeskReceipt;
import Airport.Customs.CustomsReceipt;
import Airport.Federal_Police.FederalPoliceReceipt;
import Airport.Pushback_Vehicle.PushBackVehicleReceipt;
import Airport.Security_Check.SecurityCheckReceipt;
import Airport.Service_Vehicle.ServiceVehicleBaseReceipt;
import Airport.Service_Vehicle.ServiceVehicleFreshWaterReceipt;
import Airport.Service_Vehicle.ServiceVehicleNitrogenOxygenReceipt;
import Airport.Service_Vehicle.ServiceVehicleWasteWaterReceipt;
import Airport.Checkin_Desk.CheckInDeskReceipt;
import Airport.Sky_Tanking_Vehicle.FuelReceipt;

import java.util.ArrayList;

public interface IGroundOperationsCenterLogEngine {
    void logServiceVehicleWasteWater(ArrayList<ServiceVehicleWasteWaterReceipt> serviceVehicleWasteWaterReceiptList);
    void logCheckIn(ArrayList<CheckInDeskReceipt> checkInDeskReceiptList);
    void logBulkyBaggageDesk(ArrayList<BulkyBaggageDeskReceipt> bulkyBaggageDeskReceiptList);
    void logSecurityCheck(ArrayList<SecurityCheckReceipt> securityCheckReceiptList);
    void logFederalPolice(ArrayList<FederalPoliceReceipt> federalPoliceReceiptList);
    void logCustoms(ArrayList<CustomsReceipt> customsReceiptList);
    void logCargoPalletLifter(ArrayList<AirCargoPalletLifterReceipt> airCargoPalletLifterReceiptList);
    void logBaggageSortingUnit(ArrayList<BaggageSortingUnitReceipt> baggageSortingUnitReceiptList);
    void logContainerLifter(ArrayList<ContainerLifterReceipt> containerLifterReceiptList);
    void logServiceVehicleBase(ArrayList<ServiceVehicleBaseReceipt> serviceVehicleBaseReceiptList);
    void logServiceVehicleNitrogenOxygen(ArrayList<ServiceVehicleNitrogenOxygenReceipt> serviceVehicleNitrogenOxygenReceiptList);
    void logServiceVehicleFreshWater(ArrayList<ServiceVehicleFreshWaterReceipt> serviceVehicleFreshWaterReceiptList);
    void logFuel(ArrayList<FuelReceipt> fuelReceiptList);
    void logBoardingControl(ArrayList<BoardingControlReceipt> boardingControlReceiptList);
    void logPushbackVehicle(ArrayList<PushBackVehicleReceipt> pushBackVehicleReceiptList);
}
