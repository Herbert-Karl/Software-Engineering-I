package Airplane.Aircraft;


import Airplane.Aircraft.Body;
import Airplane.Aircraft.Wing;
import Airplane.FlightControls.Implementations.Gear;

public class Airplane {
protected Configuration configuration;

    protected Body body;
    protected Wing leftWing;
    protected Wing rightWing;

    public Configuration getConfiguration() {
        return configuration;
    }

    public Airplane(Configuration configuration)
    {
        body = new Body(this);
        leftWing = new Wing(this);
        rightWing = new Wing(this);
    }

    public void startup()
    {
        for(APU apu : body.getApuArrayList())
            apu.start()
        for(Engine engine : leftWing.getEngineArrayList())
            engine.start();
        for(Engine engine : rightWing.getEngineArrayList())
            engine.start();
        for(AirConditioning airConditioning : body.getAirConditioningArrayList())
            airConditioning.on();
        for(Kitchen kitchen : body.getKitchenArrayList())
            kitchen.look();
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

    public Body getBody() {
        return body;
    }

    public Wing getLeftWing() {
        return leftWing;
    }

    public Wing getRightWing() {
        return rightWing;
    }


}
