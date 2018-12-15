package Airplane.seat;

public interface ISeat {
    String version();
    void level(int lvl);
    void assign(Passenger passenger);
}
