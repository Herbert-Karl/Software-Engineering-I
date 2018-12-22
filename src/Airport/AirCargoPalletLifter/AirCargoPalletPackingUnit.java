package Airport.AirCargoPalletLifter;

import Airport.Base.AirCargoPallet;
import Airport.Base.Employee;
import Airport.Base.Item;
import Airport.Customs.ICustoms;
import Airport.Scanner.IItemScanner;

import java.util.ArrayList;

public class AirCargoPalletPackingUnit implements IAirCargoPalletPackingUnit{
    private ArrayList<AirCargoPallet> emptyAirCargoPalletList;
    private ArrayList<String> scanPatternList;
    private IItemScanner itemScanner;
    private ArrayList<AirCargoPallet> filledAirCargoPalletList;
    private IAirCargoPalletVehicle airCargoPalletVehicle;
    private ICustoms customs;

    public AirCargoPalletPackingUnit(ArrayList<AirCargoPallet> emptyAirCargoPalletList, ArrayList<String> scanPatternList, IItemScanner itemScanner,
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
        return false;
    }

    @Override
    public void logoutItemScanner() {

    }

    @Override
    public boolean scan(Item item, String pattern) {
        return false;
    }

    @Override
    public void handOverToCustoms(Item item) {

    }

    @Override
    public void sort(ArrayList<Item> itemList) {

    }

    @Override
    public void pack() {

    }

    @Override
    public void sendAirCargoPalletLifterToGate() {

    }

    @Override
    public void sendAirCargoPalletVehicleToGate() {

    }

    @Override
    public LoadingStrategy optimizeAirplaneLoading() {
        return null;
    }

    @Override
    public void setAirCargoPalletVehicle() {

    }

    @Override
    public void loadAirCargoPalletVehicle(LoadingStrategy strategy) {

    }
}
