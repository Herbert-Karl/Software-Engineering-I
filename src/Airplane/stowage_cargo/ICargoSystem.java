package Airplane.stowage_cargo;

import java.util.ArrayList;

public interface ICargoSystem {

    public String version();

    public void load(Container container, FrontStowagePositionID position);

    public void load(AirCargoPallet airCargoPallet, RearStowagePositionID position);

    public double determineTotalWeightAirCargoPallet();

    public double determineTotalWeightContainer();

    public void unlock();

    public void secure();

    public void lock();

    public ArrayList<Container> unloadContainer();

    public AirCargoPallet unloadAirCargoPallet();

}
