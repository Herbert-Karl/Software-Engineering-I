package Airplane.seat;

import Airplane.airplanePart.IAirplanePart;
import Airport.Base.Passenger;

public abstract class Seat implements ISeat{

    protected IAirplanePart seat;
    protected Passenger passenger;
    protected int level;
    protected NonSmokingSign nonSmokingSign;
    protected SeatBeltSign seatBeltSign;

    // initialize attributes
    protected void setSeat(String ID, String type, String brand)
    {
        seat.setAll(ID, type, brand);
        level = 0;
        nonSmokingSign.off();
        seatBeltSign.off();
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
