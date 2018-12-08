package Airplane.Aircraft;

import Airplane.FlightControls.Implementations.Gear;

public class A380 extends Airplane {
    public A380(Configuration configuration)
    {
        body = new Body(this);
        leftWing = new Wing();
        rightWing = new Wing();
    }

    public void build() {

    }

    public void startup()
    {
        for(APU apu : body.getApuList())
            apu.start()
        for(Engine engine : leftwing.getEngineList())
            engine.start();
        for(Engine engine : rightwing.getEngineList())
            engine.start();
        for()
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
