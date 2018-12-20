package Airplane.seat;

import Airplane.airplanePart.IAirplanePart;
import Airport.Base.Passenger;

public abstract class Seat implements ISeat{

    protected IAirplanePart seat;
    protected Passenger passenger;
    protected int level;
    protected ISign nonSmokingSign;
    protected ISign seatBeltSign;

    // initialize attributes
    protected Seat(String ID, String type)
    {
        seat = new AirplanePart();
        seat.setAll(ID, type);
        level = 0;
        nonSmokingSign = new NonSmokingSign();
        seatBeltSign = new SeatBeltSign();
    }

    @Override
    // set the level
    public void level(int lvl)
    {
        switch (lvl) {
            default: level = 0;
                break;
            case 0: level = 0;
                break;
            case 1: level = 1;
                break;
        }
    }

    @Override
    // assign passenger = passenger (parameter)
    public void assign(Passenger passenger)
    {
        this.passenger = passenger;
    }

    @Override
    //the version contains id and type
    public String version()
    {
        return seat.version();
    }
}
