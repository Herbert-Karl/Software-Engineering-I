package stowage_cargo;

import java.util.ArrayList;

public interface ICargoSystem {

    public String version();

    public void load(Stowage stowage, Container container, FrontStowagePositionID position);

    public void load(Stowage stowage, AirCargoPallet airCargoPallet, RearStowagePositionID position);

    public double determineTotalWeightAirCargoPallet(Stowage stowage);

    public double determineTotalWeightContainer(Stowage stowage);

    public void unlock();

    public void secure();

    public void lock();

    public ArrayList<Container> unloadContainer(Stowage stowage);

    public ArrayList<AirCargoPallet> unloadAirCargoPallet(Stowage stowage);

}
