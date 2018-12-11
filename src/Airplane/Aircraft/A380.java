package Airplane.Aircraft;

import Airplane.FlightControls.Implementations.Gear;
import Airplane.Lights.AntiCollisionLight;
import Airplane.Tanks.APUOilTank;

public class A380 extends Airplane{


    public A380()
    {
    }

    public void startup()
    {

    }
    public void taxi()
    {

    }
    public void takeOff()
    {
        for (Gear gear : body.getGearList())
            gear.up();
    }
    public void rightTurn()
    {

    }
    public void leftTurn()
    {

    }
}
