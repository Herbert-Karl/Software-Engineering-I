package stowage_cargo;

import java.util.ArrayList;

public class CargoSystem implements ICargoSystem {

    private String manufacturer;

    private String type;

    private String id;

    private Stowage frontStowage;

    private Stowage rearStowage;

    private boolean isLocked;

    private boolean isSecured = false;

    private double totalWeightAirCargoPallet;

    private double totalWeightContainer;

    // Konstruktor
    //
    CargoSystem(String manufacturer, String type, String id) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.frontStowage = new FrontStowage();
        this.rearStowage = new RearStowage();
        this.isLocked = false;
        this.totalWeightAirCargoPallet = 0.0;
        this.totalWeightContainer = 0.0;
    }

    public String version() {
        return "<" + this.id + "> - <" + this.type + ">";
    }

    public void load(Container container, FrontStowagePositionID position) {
        FrontStowagePosition helpPosition = new FrontStowagePosition(position, container);
        ((FrontStowage) this.frontStowage).add_to_positionList(helpPosition);
        this.totalWeightContainer += container.get_weight();
    }

    public void load(AirCargoPallet airCargoPallet, RearStowagePositionID position) {
        RearStowagePosition helpPosition = new RearStowagePosition(position, airCargoPallet);
        ((RearStowage) this.rearStowage).add_to_positionList(helpPosition);
        this.totalWeightAirCargoPallet += airCargoPallet.get_weight();
    }

    public double determineTotalWeightAirCargoPallet() {
        return this.totalWeightAirCargoPallet;
    }

    public double determineTotalWeightContainer() {
        return this.totalWeightContainer;
    }

    public void unlock() {
        if(this.isLocked) { this.isLocked = false; }
        else { throw new RuntimeException("CargoSystem bereits aufgeschlossen."); }
    }

    public void secure() {
        if(!this.isSecured) { this.isSecured = true; }
        else { throw new RuntimeException("CargoSystem bereits gesichert."); }
    }

    public void lock() {
        if(!this.isSecured) { throw new RuntimeException("CargoSystem noch nicht gesichert."); }
        if(!this.isLocked) { this.isLocked = true; }
        else { throw new RuntimeException("CargoSystem bereits abgeschlossen."); }
    }

    public ArrayList<Container> unloadContainer() {
        ArrayList<Container> helpList = new ArrayList<Container>();
        FrontStowagePosition helpObject = ((FrontStowage) this.frontStowage).remove_from_positionList();
        do {
            helpList.add(helpObject.get_container());
            helpObject = ((FrontStowage) this.frontStowage).remove_from_positionList();
        } while(helpObject != null);
        this.totalWeightContainer = 0.0;
        return helpList;
    }

    public AirCargoPallet unloadAirCargoPallet() {
        RearStowagePosition helpObject = ((RearStowage) this.rearStowage).remove_from_positionList();
        if(helpObject == null) { return null; }
        AirCargoPallet pallet = helpObject.get_airCargoPallet();
        this.totalWeightAirCargoPallet -= pallet.get_weight();
        return pallet;
    }

    public String get_manufacturer() { return this.manufacturer; }

}
