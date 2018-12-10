package Airplane.stowage_cargo;

import java.util.ArrayList;

import Airport.Base.AirCargoPallet;
import Airport.Base.Container;

public interface ICargoSystem {

    String version();

    void load(Container container, FrontStowagePositionID position);

    void load(AirCargoPallet airCargoPallet, RearStowagePositionID position);

    double determineTotalWeightAirCargoPallet();

    double determineTotalWeightContainer();

    void unlock();

    void secure();

    void lock();

    ArrayList<Container> unloadContainer();

    AirCargoPallet unloadAirCargoPallet();

}
