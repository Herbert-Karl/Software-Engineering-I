package Airport.air_cargo_pallet_lifter;

import Airport.base.AirCargoPallet;
import Airport.base.Employee;
import Airport.base.Item;
import Airport.customs.ICustoms;
import Airport.scanner.IItemScanner;

import java.util.ArrayList;

public class AirCargoPalletPackingUnit implements IAirCargoPalletPackingUnit {
    private ArrayList<AirCargoPallet> emptyAirCargoPalletList;
    private ArrayList<String>  scanPatternList;
    private IItemScanner itemScanner;
    private ArrayList<AirCargoPallet> filledAirCargoPalletList;
    private IAirCargoPalletVehicle airCargoPalletVehicle;
    private ICustoms customs;

    public AirCargoPalletPackingUnit(ArrayList<AirCargoPallet> emptyAirCargoPalletList, ArrayList<String> scanPatternList, IItemScanner itemScanner, ArrayList<AirCargoPallet> filledAirCargoPalletList, IAirCargoPalletVehicle airCargoPalletVehicle, ICustoms customs) {
        this.emptyAirCargoPalletList = emptyAirCargoPalletList;
        this.scanPatternList = scanPatternList;
        this.itemScanner = itemScanner;
        this.filledAirCargoPalletList = filledAirCargoPalletList;
        this.airCargoPalletVehicle = airCargoPalletVehicle;
        this.customs = customs;
    }

    @Override
    public boolean logInItemScanner(Employee employee, String password) {
        return false;
    }

    @Override
    public void logOutItemScanner() {

    }

    @Override
    public boolean scan(Item item, String pattern) {
        return false;
    }

    @Override
    public void handOverToCustoms(Item item) {

    }

    @Override
    public void sort(ArrayList<Item> itemArrayList) {

    }

    @Override
    public void pack() {

    }

    @Override
    public void sendAirCargoPalletLifterToGate() {

    }

    @Override
    public void optimizeAirplaneLoading() {

    }

    @Override
    public void setAirCargoPalletVehicle() {

    }

    @Override
    public void loadAirCargoPalletVehicle(LoadingStrategy strategy) {

    }

    @Override
    public void sendAirCargoPalletVehicleToGate() {

    }

    public ArrayList<AirCargoPallet> getEmptyAirCargoPalletList() {
        return emptyAirCargoPalletList;
    }

    public void setEmptyAirCargoPalletList(ArrayList<AirCargoPallet> emptyAirCargoPalletList) {
        this.emptyAirCargoPalletList = emptyAirCargoPalletList;
    }

    public ArrayList<String> getScanPatternList() {
        return scanPatternList;
    }

    public void setScanPatternList(ArrayList<String> scanPatternList) {
        this.scanPatternList = scanPatternList;
    }

    public IItemScanner getItemScanner() {
        return itemScanner;
    }

    public void setItemScanner(IItemScanner itemScanner) {
        this.itemScanner = itemScanner;
    }

    public ArrayList<AirCargoPallet> getFilledAirCargoPalletList() {
        return filledAirCargoPalletList;
    }

    public void setFilledAirCargoPalletList(ArrayList<AirCargoPallet> filledAirCargoPalletList) {
        this.filledAirCargoPalletList = filledAirCargoPalletList;
    }

    public IAirCargoPalletVehicle getAirCargoPalletVehicle() {
        return airCargoPalletVehicle;
    }

    public void setAirCargoPalletVehicle(IAirCargoPalletVehicle airCargoPalletVehicle) {
        this.airCargoPalletVehicle = airCargoPalletVehicle;
    }

    public ICustoms getCustoms() {
        return customs;
    }

    public void setCustoms(ICustoms customs) {
        this.customs = customs;
    }
}
