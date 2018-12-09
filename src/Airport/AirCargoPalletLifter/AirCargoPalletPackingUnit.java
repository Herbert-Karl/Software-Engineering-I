package Airport.AirCargoPalletLifter;

import Airport.Base.AirCargoPallet;

import java.util.ArrayList;

public class AirCargoPalletPackingUnit {
    private ArrayList<AirCargoPallet> emptyAirCargoPalletList;
    private ArrayList scanPatternList;
    private IItemScanner itemScanner;
    private ArrayList<AirCargoPallet> filledAirCargoPalletList;
    private IAirCargoPalletVehicel airCargoPalletVehicel;
    private ICustoms customs;

    public AirCargoPalletPackingUnit(ArrayList<AirCargoPallet> emptyAirCargoPalletList, ArrayList scanPatternList, IItemScanner itemScanner, ArrayList<AirCargoPallet> filledAirCargoPalletList, IAirCargoPalletVehicel airCargoPalletVehicel, ICustoms customs) {
        this.emptyAirCargoPalletList = emptyAirCargoPalletList;
        this.scanPatternList = scanPatternList;
        this.itemScanner = itemScanner;
        this.filledAirCargoPalletList = filledAirCargoPalletList;
        this.airCargoPalletVehicel = airCargoPalletVehicel;
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

    public IAirCargoPalletVehicel getAirCargoPalletVehicel() {
        return airCargoPalletVehicel;
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

    public void setAirCargoPalletVehicel(IAirCargoPalletVehicel airCargoPalletVehicel) {
        this.airCargoPalletVehicel = airCargoPalletVehicel;
    }

    public void setCustoms(ICustoms customs) {
        this.customs = customs;
    }
}
