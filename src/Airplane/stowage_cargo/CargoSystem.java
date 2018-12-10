package Airplane.stowage_cargo;

import Airport.base.AirCargoPallet;
import Airport.base.Container;

import java.util.ArrayList;

public class CargoSystem implements ICargoSystem {
    private String manufacturer;
    private String type;
    private String id;
    private ArrayList<Stowage> stowages;
    private boolean isLocked;
    private boolean isSecured;
    private double totalWeightContainer;
    private double totalWeightAirCargoPallet;

    public CargoSystem(String manufacturer, String type, String id, ArrayList<Stowage> stowages, boolean isLocked, boolean isSecured, double totalWeightContainer, double totalWeightAirCargoPallet) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.stowages = stowages;
        this.isLocked = isLocked;
        this.isSecured = isSecured;
        this.totalWeightContainer = totalWeightContainer;
        this.totalWeightAirCargoPallet = totalWeightAirCargoPallet;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void unlock() {

    }

    @Override
    public void load(Stowage stowage, Container container, FrontStowagePositionID position) {

    }

    @Override
    public void load(Stowage stowage, AirCargoPallet airCargoPallet, RearStowagePositionID position) {

    }

    @Override
    public double determineTotalWeightContainer(Stowage stowage) {
        return 0;
    }

    @Override
    public double determineTotalWeigthAirCargoPallet(Stowage stowage) {
        return 0;
    }

    @Override
    public void secure() {

    }

    @Override
    public void lock() {

    }

    @Override
    public ArrayList<Container> unloadContainer(Stowage stowage) {
        return null;
    }

    @Override
    public ArrayList<AirCargoPallet> unloadAirCargoPallet(Stowage stowage) {
        return null;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Stowage> getStowages() {
        return stowages;
    }

    public void setStowages(ArrayList<Stowage> stowages) {
        this.stowages = stowages;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isSecured() {
        return isSecured;
    }

    public void setSecured(boolean secured) {
        isSecured = secured;
    }

    public double getTotalWeightContainer() {
        return totalWeightContainer;
    }

    public void setTotalWeightContainer(double totalWeightContainer) {
        this.totalWeightContainer = totalWeightContainer;
    }

    public double getTotalWeightAirCargoPallet() {
        return totalWeightAirCargoPallet;
    }

    public void setTotalWeightAirCargoPallet(double totalWeightAirCargoPallet) {
        this.totalWeightAirCargoPallet = totalWeightAirCargoPallet;
    }
}
