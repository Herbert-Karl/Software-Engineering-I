package Airplane.seat;

import Airport.Base.Passenger;

public interface ISeat {
    String version();
    void level(int lvl);
    void assign(Passenger passenger);
}
