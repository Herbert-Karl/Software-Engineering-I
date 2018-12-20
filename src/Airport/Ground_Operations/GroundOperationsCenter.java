package Airport.Ground_Operations;

import Airport.AirCargoPalletLifter.AirCargoPalletLifterReceipt;
import Airport.AirCargoPalletLifter.IAirCargoPalletLifter;
import Airport.Airport.Airport;
import Airport.Airport.Gate;
import Airport.Baggage_Sorting_Unit.Receipts.BaggageSortingUnitReceipt;
import Airport.Baggage_Sorting_Unit.Receipts.ContainerLifterReceipt;
import Airport.Baggage_Sorting_Unit.Vehicles.IBaggageVehicle;
import Airport.Baggage_Sorting_Unit.Vehicles.IContainerLifter;
import Airport.Customs.CustomsReceipt;
import Airport.Federal_Police.FederalPoliceReceipt;
import Airport.Pushback_Vehicle.PushBackVehicleReceipt;
import Airport.Security_Check.SecurityCheckReceipt;
import Airport.Service_Vehicle.*;
import Airport.Boarding_Control.BoardingControlReceipt;
import Airport.Checkin_Desk.CheckInDeskReceipt;
import Airport.Bulky_Baggage_Desk.BulkyBaggageDeskReceipt;
import Airport.Sky_Tanking_Vehicle.FuelReceipt;
import Airport.Sky_Tanking_Vehicle.ISkyTankingVehicle;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static Airport.Configuration.Configuration.LOGFILEPATH;

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
    private ArrayList<ServiceVehicleBaseReceipt> serviceVehicleBaseReceiptList;
    private ArrayList<ServiceVehicleNitrogenOxygenReceipt> serviceVehicleNitrogenOxygenReceiptList;
    private ArrayList<ServiceVehicleFreshWaterReceipt> serviceVehicleFreshWaterReceiptList;
    private ArrayList<FuelReceipt> fuelReceiptList;
    private ArrayList<BoardingControlReceipt> boardingControlReceiptList;
    private ArrayList<PushBackVehicleReceipt> pushBackVehicleReceiptList;

    ///
    ///  Konstruktor
    ///

    public GroundOperationsCenter(Airport airport, int listSize){
        this.airport = airport;
        this.serviceVehicleWasteWaterReceiptList = new ArrayList<>(listSize);
        this.checkInReceiptList = new ArrayList<>(listSize);
        this.bulkyBaggageDeskReceiptList = new ArrayList<>(listSize);
        this.securityCheckReceiptList = new ArrayList<>(listSize);
        this.federalPoliceReceiptList = new ArrayList<>(listSize);
        this.customsReceiptList = new ArrayList<>(listSize);
        this.airCargoPalletLifterReceiptList = new ArrayList<>(listSize);
        this.baggageSortingUnitReceiptList = new ArrayList<>(listSize);
        this.containerLifterReceiptList = new ArrayList<>(listSize);
        this.serviceVehicleBaseReceiptList = new ArrayList<>(listSize);
        this.serviceVehicleNitrogenOxygenReceiptList = new ArrayList<>(listSize);
        this.serviceVehicleFreshWaterReceiptList = new ArrayList<>(listSize);
        this.fuelReceiptList = new ArrayList<>(listSize);
        this.boardingControlReceiptList = new ArrayList<>(listSize);
        this.pushBackVehicleReceiptList = new ArrayList<>(listSize);
    }

    public GroundOperationsCenter(){}

    ///
    ///  Getter und Setter
    ///

    public void setAirport(Airport airport){
        this.airport = airport;
    }

    public ArrayList<ServiceVehicleWasteWaterReceipt> getServiceVehicleWasteWaterReceiptList() {
        return serviceVehicleWasteWaterReceiptList;
    }

    public ArrayList<CustomsReceipt> getCustomsReceiptList() {
        return customsReceiptList;
    }

    public ArrayList<ContainerLifterReceipt> getContainerLifterReceiptList() {
        return containerLifterReceiptList;
    }

    public ArrayList<FederalPoliceReceipt> getFederalPoliceReceiptList() {
        return federalPoliceReceiptList;
    }

    public ArrayList<FuelReceipt> getFuelReceiptList() {
        return fuelReceiptList;
    }

    public ArrayList<SecurityCheckReceipt> getSecurityCheckReceiptList() {
        return securityCheckReceiptList;
    }

    public ArrayList<BaggageSortingUnitReceipt> getBaggageSortingUnitReceiptList() {
        return baggageSortingUnitReceiptList;
    }

    public ArrayList<BulkyBaggageDeskReceipt> getBulkyBaggageDeskReceiptList() {
        return bulkyBaggageDeskReceiptList;
    }

    public ArrayList<CheckInDeskReceipt> getCheckInReceiptList() {
        return checkInReceiptList;
    }

    public ArrayList<ServiceVehicleBaseReceipt> getServiceVehicleBaseReceiptList() {
        return serviceVehicleBaseReceiptList;
    }

    public ArrayList<AirCargoPalletLifterReceipt> getAirCargoPalletLifterReceiptList() {
        return airCargoPalletLifterReceiptList;
    }

    public ArrayList<ServiceVehicleFreshWaterReceipt> getServiceVehicleFreshWaterReceiptList() {
        return serviceVehicleFreshWaterReceiptList;
    }

    public ArrayList<ServiceVehicleNitrogenOxygenReceipt> getServiceVehicleNitrogenOxygenReceiptList() {
        return serviceVehicleNitrogenOxygenReceiptList;
    }

    public ArrayList<BoardingControlReceipt> getBoardingControlReceiptList(){
        return boardingControlReceiptList;
    }

    public ArrayList<PushBackVehicleReceipt> getPushBackVehicleReceiptList(){
        return pushBackVehicleReceiptList;
    }

    ///
    /// IGroundOperationCenter
    ///

    @Override
    public boolean assign(IBaggageVehicle baggageVehicle, Gate gate) {
        baggageVehicle.setGate(gate.getGateID());
        return true;
    }

    @Override
    public boolean assign(IContainerLifter containerLifter, Gate gate) {
        if(containerLifter.getGate() == null) {
            containerLifter.setGate(gate.getGateID());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean assign(ISkyTankingVehicle skyTankingVehicle, Gate gate) {
        if(skyTankingVehicle.getGate() == null) {
            skyTankingVehicle.setGate(gate.getGateID());
            return true;
        } else {return false;}
    }

    @Override
    public boolean assign(IServiceVehicleBase serviceVehicleBase, Gate gate) {
        serviceVehicleBase.setGateID(gate.getGateID());
        return true;
    }

    @Override
    public boolean assign(IAirCargoPalletLifter airCargoPalletLifter, Gate gate) {
        airCargoPalletLifter.setGate(gate.getGateID());
        return true;
    }

    @Override
    public boolean assign(IServiceVehicleFreshWater serviceVehicleFreshWater, Gate gate) {
        serviceVehicleFreshWater.setGateID(gate.getGateID());
        return true;
    }

    @Override
    public boolean assign(IServiceVehicleWasteWater serviceVehicleWasteWater, Gate gate) {
        serviceVehicleWasteWater.setGateID(gate.getGateID());
        return true;
    }

    @Override
    public boolean assign(IServiceVehicleNitrogenOxygen serviceVehicleNitrogenOxygen, Gate gate) {
        serviceVehicleNitrogenOxygen.setGateID(gate.getGateID());
        return true;
    }

    @Override
    public void receive(FuelReceipt fuelReceipt) {
        fuelReceiptList.add(fuelReceipt);
    }

    @Override
    public void receive(CustomsReceipt customsReceipt) {
        customsReceiptList.add(customsReceipt);
    }

    @Override
    public void receive(CheckInDeskReceipt checkInReceipt) {
        checkInReceiptList.add(checkInReceipt);
    }

    @Override
    public void receive(FederalPoliceReceipt federalPoliceReceipt) {
        federalPoliceReceiptList.add(federalPoliceReceipt);
    }

    @Override
    public void receive(SecurityCheckReceipt securityCheckReceipt) {
        securityCheckReceiptList.add(securityCheckReceipt);
    }

    @Override
    public void receive(BoardingControlReceipt boardingControlReceipt) {
        boardingControlReceiptList.add(boardingControlReceipt);
    }

    @Override
    public void receive(ContainerLifterReceipt containerLifterReceipt) {
        containerLifterReceiptList.add(containerLifterReceipt);
    }

    @Override
    public void receive(PushBackVehicleReceipt pushBackVehicleReceipt) {
        pushBackVehicleReceiptList.add(pushBackVehicleReceipt);
    }

    @Override
    public void receive(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt) {
        bulkyBaggageDeskReceiptList.add(bulkyBaggageDeskReceipt);
    }

    @Override
    public void receive(BaggageSortingUnitReceipt baggageSortingUnitReceipt) {
        baggageSortingUnitReceiptList.add(baggageSortingUnitReceipt);
    }

    @Override
    public void receive(ServiceVehicleBaseReceipt serviceVehicleBaseReceipt) {
        serviceVehicleBaseReceiptList.add(serviceVehicleBaseReceipt);
    }

    @Override
    public void receive(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt) {
        airCargoPalletLifterReceiptList.add(airCargoPalletLifterReceipt);
    }

    @Override
    public void receive(ServiceVehicleFreshWaterReceipt serviceVehicleFreshWaterReceipt) {
        serviceVehicleFreshWaterReceiptList.add(serviceVehicleFreshWaterReceipt);
    }

    @Override
    public void receive(ServiceVehicleWasteWaterReceipt serviceVehicleWasteWaterReceipt) {
        serviceVehicleWasteWaterReceiptList.add(serviceVehicleWasteWaterReceipt);
    }

    @Override
    public void receive(ServiceVehicleNitrogenOxygenReceipt serviceVehicleNitrogenOxygenReceipt) {
        serviceVehicleNitrogenOxygenReceiptList.add(serviceVehicleNitrogenOxygenReceipt);
    }

    ///
    /// IGroundOperationsLogEngine
    ///

    private String logFilePath = LOGFILEPATH.pathToString();
    @Override
    public void logServiceVehicleWasteWater(ArrayList<ServiceVehicleWasteWaterReceipt> serviceVehicleWasteWaterReceiptList) {
        try {
            FileWriter writer = new FileWriter(logFilePath);
            writer.write("ServiceVehicleWasteWaterReceiptList: \\r\\n");
            writer.write(serviceVehicleWasteWaterReceiptList.toString() + "\\r\\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void logCheckIn(ArrayList<CheckInDeskReceipt> checkInDeskReceiptList) {
        try {
            FileWriter writer = new FileWriter(logFilePath);
            writer.write("CheckInDeskReceiptList: \\r\\n");
            writer.write(checkInDeskReceiptList.toString() + "\\r\\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void logBulkyBaggageDesk(ArrayList<BulkyBaggageDeskReceipt> bulkyBaggageDeskReceiptList) {
        try {
            FileWriter writer = new FileWriter(logFilePath);
            writer.write("BulkyBaggageDeskReceiptList: \\r\\n");
            writer.write(bulkyBaggageDeskReceiptList.toString() + "\\r\\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void logSecurityCheck(ArrayList<SecurityCheckReceipt> securityCheckReceiptList) {
        try {
            FileWriter writer = new FileWriter(logFilePath);
            writer.write("SecurityCheckReceiptList: \\r\\n");
            writer.write(securityCheckReceiptList.toString() + "\\r\\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void logFederalPolice(ArrayList<FederalPoliceReceipt> federalPoliceReceiptList) {
        try {
            FileWriter writer = new FileWriter(logFilePath);
            writer.write("FederalPoliceReceiptList: \\r\\n");
            writer.write(federalPoliceReceiptList.toString() + "\\r\\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void logCustoms(ArrayList<CustomsReceipt> customsReceiptList) {
        try {
            FileWriter writer = new FileWriter(logFilePath);
            writer.write("CustomsReceiptList: \\r\\n");
            writer.write(customsReceiptList.toString() + "\\r\\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void logCargoPalletLifter(ArrayList<AirCargoPalletLifterReceipt> airCargoPalletLifterReceiptList) {
        try {
            FileWriter writer = new FileWriter(logFilePath);
            writer.write("AirCargoPalletLifterReceiptList: \\r\\n");
            writer.write(airCargoPalletLifterReceiptList.toString() + "\\r\\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void logBaggageSortingUnit(ArrayList<BaggageSortingUnitReceipt> baggageSortingUnitReceiptList) {
        try {
            FileWriter writer = new FileWriter(logFilePath);
            writer.write("BaggageSortingUnitReceiptList: \\r\\n");
            writer.write(baggageSortingUnitReceiptList.toString() + "\\r\\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void logContainerLifter(ArrayList<ContainerLifterReceipt> containerLifterReceiptList) {
        try {
            FileWriter writer = new FileWriter(logFilePath);
            writer.write("ContainerLifterReceiptList: \\r\\n");
            writer.write(containerLifterReceiptList.toString() + "\\r\\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void logServiceVehicleBase(ArrayList<ServiceVehicleBaseReceipt> serviceVehicleBaseReceiptList) {
        try {
            FileWriter writer = new FileWriter(logFilePath);
            writer.write("serviceVehicleBaseReceiptList: \\r\\n");
            writer.write(serviceVehicleBaseReceiptList.toString() + "\\r\\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void logServiceVehicleNitrogenOxygen(ArrayList<ServiceVehicleNitrogenOxygenReceipt> serviceVehicleNitrogenOxygenReceiptList) {
        try {
            FileWriter writer = new FileWriter(logFilePath);
            writer.write("ServiceVehicleNitrogenOxygenReceiptList: \\r\\n");
            writer.write(serviceVehicleNitrogenOxygenReceiptList.toString() + "\\r\\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void logServiceVehicleFreshWater(ArrayList<ServiceVehicleFreshWaterReceipt> serviceVehicleFreshWaterReceiptList) {
        try {
            FileWriter writer = new FileWriter(logFilePath);
            writer.write("ServiceVehicleFreshWaterReceiptList: \\r\\n");
            writer.write(serviceVehicleFreshWaterReceiptList.toString() + "\\r\\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void logFuel(ArrayList<FuelReceipt> fuelReceiptList) {
        try {
            FileWriter writer = new FileWriter(logFilePath);
            writer.write("FuelReceiptList: \\r\\n");
            writer.write(fuelReceiptList.toString() + "\\r\\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void logBoardingControl(ArrayList<BoardingControlReceipt> boardingControlReceiptList) {
        try {
            FileWriter writer = new FileWriter(logFilePath);
            writer.write("BoardingControlReceiptList: \\r\\n");
            writer.write(boardingControlReceiptList.toString() + "\\r\\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void logPushbackVehicle(ArrayList<PushBackVehicleReceipt> pushBackVehicleReceiptList) {
        try {
            FileWriter writer = new FileWriter(logFilePath);
            writer.write("PushbackVehicleReceiptList: \\r\\n");
            writer.write(pushBackVehicleReceiptList.toString() + "\\r\\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
