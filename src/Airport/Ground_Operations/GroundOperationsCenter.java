package Airport.Ground_Operations;

import Airport.AirCargoPalletLifter.AirCargoPalletLifterReceipt;
import Airport.Airport.Airport;
import Airport.Baggage_Sorting_Unit.Receipts.BaggageSortingUnitReceipt;
import Airport.Baggage_Sorting_Unit.Receipts.ContainerLifterReceipt;
import Airport.Customs.CustomsReceipt;
import Airport.Federal_Police.FederalPoliceReceipt;
import Airport.Security_Check.SecurityCheckReceipt;
import Airport.Service_Vehicle.ServiceVehicleBaseReceipt;
import Airport.Boarding_Control.BoardingControlReceipt;
import Airport.Service_Vehicle.ServiceVehicleFreshWaterReceipt;
import Airport.Service_Vehicle.ServiceVehicleNitrogenOxygenReceipt;
import Airport.Service_Vehicle.ServiceVehicleWasteWaterReceipt;
import Airport.Checkin_Desk.CheckInDeskReceipt;
import Airport.Bulky_Baggage_Desk.BulkyBaggageDeskReceipt;
import Airport.Sky_Tanking_Vehicle.FuelReceipt;

import java.util.ArrayList;

public class GroundOperationsCenter implements IGroundOperationsCenter, IGroundOperationsCenterLogEngine{
    private Airport airport;
    private ArrayList<ServiceVehicleWasteWaterReceipt> serviceVehicleWasteWaterReceiptList;
    private ArrayList<CheckInDeskReceipt> checkInReceiptList;
    private ArrayList<BulkyBaggageDeskReceipt> bulkyBaggageDeskReceiptList;
    private ArrayList<SecurityCheckReceipt> securityCheckReceiptList;
    private ArrayList<FederalPoliceReceipt> federalPoliceReceiptList;
    private ArrayList<CustomsReceipt> customsReceiptList;
    private ArrayList<AirCargoPalletLifterReceipt> airCargoPalletLifterReceiptList;
    private ArrayList<BaggageSortingUnitReceipt> baggageSortingUnitReceiptList;
    private ArrayList<ContainerLifterReceipt> containerLifterReceiptList;
    private ArrayList<ServiceVehicleBaseReceipt> serviceVehicleBaseReceiptLis;
    private ArrayList<ServiceVehicleNitrogenOxygenReceipt> serviceVehicleNitrogenOxygenReceiptList;
    private ArrayList<ServiceVehicleFreshWaterReceipt> serviceVehicleFreshWaterReceiptList;
    private ArrayList<FuelReceipt> fuelReceiptList;
    private ArrayList<src.Airport.Boarding_Control.BoardingControlReceipt> boardingControlReceiptList;
    private ArrayList<src.Airport.PushBack_Vehicle.PushBackVehicleReceipt> pushBackVehicleReceiptList;
}
