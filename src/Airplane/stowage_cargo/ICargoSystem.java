package Airplane.stowage_cargo;

import Airport.base.AirCargoPallet;
import Airport.base.Container;

import java.util.ArrayList;

public interface ICargoSystem {
    String version();
    void unlock();
    void load(Stowage stowage, Container container, FrontStowagePositionID position);
    void load(Stowage stowage, AirCargoPallet airCargoPallet, RearStowagePositionID position);
    double determineTotalWeightContainer(Stowage stowage);
    double determineTotalWeigthAirCargoPallet(Stowage stowage);
    void secure();
    void lock();
    ArrayList<Container> unloadContainer(Stowage stowage);
    ArrayList<AirCargoPallet> unloadAirCargoPallet(Stowage stowage);
}
