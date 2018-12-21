package Airport.AirCargoPalletLifter;

import Airport.Airport.Gate;
import Airport.Baggage_Sorting_Unit.Loading.AirplaneLoadingManagement;
import Airport.Base.AirCargoPallet;
import Airport.Base.Employee;
import Airport.Base.Item;
import Airport.Customs.Customs;
import Airport.Customs.ICustoms;
import Airport.Scanner.IItemScanner;

import java.util.ArrayList;

public class AirCargoPalletPackingUnit implements IAirCargoPalletPackingUnit{
    private ArrayList<AirCargoPallet> emptyAirCargoPalletList;
    private ArrayList scanPatternList;
    private IItemScanner itemScanner;
    private ArrayList<AirCargoPallet> filledAirCargoPalletList;
    private IAirCargoPalletVehicle airCargoPalletVehicle;
    private ICustoms customs;

    public AirCargoPalletPackingUnit(ArrayList<AirCargoPallet> emptyAirCargoPalletList, ArrayList scanPatternList, IItemScanner itemScanner,
                                     ArrayList<AirCargoPallet> filledAirCargoPalletList, IAirCargoPalletVehicle airCargoPalletVehicle, ICustoms customs) {
        this.emptyAirCargoPalletList = emptyAirCargoPalletList;
        this.scanPatternList = scanPatternList;
        this.itemScanner = itemScanner;
        this.filledAirCargoPalletList = filledAirCargoPalletList;
        this.airCargoPalletVehicle = airCargoPalletVehicle;
        this.customs = customs;
    }

    public ArrayList<AirCargoPallet> getEmptyAirCargoPalletList() {
        return emptyAirCargoPalletList;
    }

    public ArrayList getScanPatternList() {
        return scanPatternList;
    }

    public IItemScanner getItemScanner() {
        return itemScanner;
    }

    public ArrayList<AirCargoPallet> getFilledAirCargoPalletList() {
        return filledAirCargoPalletList;
    }

    public IAirCargoPalletVehicle getAirCargoPalletVehicel() {
        return airCargoPalletVehicle;
    }

    public ICustoms getCustoms() {
        return customs;
    }

    public void setEmptyAirCargoPalletList(ArrayList<AirCargoPallet> emptyAirCargoPalletList) {
        this.emptyAirCargoPalletList = emptyAirCargoPalletList;
    }

    public void setScanPatternList(ArrayList scanPatternList) {
        this.scanPatternList = scanPatternList;
    }

    public void setItemScanner(IItemScanner itemScanner) {
        this.itemScanner = itemScanner;
    }

    public void setFilledAirCargoPalletList(ArrayList<AirCargoPallet> filledAirCargoPalletList) {
        this.filledAirCargoPalletList = filledAirCargoPalletList;
    }

    public void setAirCargoPalletVehicel(IAirCargoPalletVehicle airCargoPalletVehicle) {
        this.airCargoPalletVehicle = airCargoPalletVehicle;
    }

    public void setCustoms(ICustoms customs) {
        this.customs = customs;
    }

    @Override
    public boolean loginItemScanner(Employee employee, String password) {

        if (employee.getIdCard().getPassword()== password ){return true;}
        else {

        return false;}
    }

    @Override
    public void logoutItemScanner() { itemScanner.logout();

    }

    @Override
    public boolean scan(Item item, String pattern) {
        if (itemScanner.scan(item,pattern)){return true;}
        else{
        return false;}
    }

    @Override
    public void handOverToCustoms(Item item) {
        ArrayList<Item> list = new ArrayList<>();
        list.add(item);
        customs.handOverItemsToFederalPolice(list);


    }

    @Override
    public void sort(ArrayList<Item> itemList) { itemList.sort(null);

    }

    @Override
    public void pack() {

    }

    @Override
    public void sendAirCargoPalletLifterToGate(Gate gate,AirCargoPalletLifter airCargoPalletLifter) { airCargoPalletLifter.setGate(gate);

    }

    @Override
    public void optimizeAirplaneLoading() {}

    @Override
    public void setAirCargoPalletVehicle(AirCargoPalletVehicle airCargoPalletVehicle) { this.airCargoPalletVehicle = airCargoPalletVehicle;

    }

    @Override
    public void loadAirCargoPalletVehicle(LoadingStrategy strategy,AirCargoPalletVehicle airCargoPalletVehicle) {

    }

    @Override
    public void sendAirCargoPalletVehicleToGate(Gate gate,AirCargoPalletVehicle airCargoPalletVehicle) { airCargoPalletVehicle.setGate(gate.getGateID());

    }
}
