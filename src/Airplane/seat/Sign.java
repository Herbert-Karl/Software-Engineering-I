package Airplane.seat;

import Airplane.airplanePart.*;
import java.util.UUID;

public abstract class Sign implements ISign {

    protected String uuid;
    protected IAirplanePart sign;
    protected boolean isOn;

    protected Sign(String type)
    {
        uuid = UUID.randomUUID().toString();
        sign = new AirplanePart(type);
        isOn = false;
    }

    @Override
    //the version contains id and type
    public String version()
    {
        return sign.version();
    }

    @Override
    public void on()
    {
        isOn = true;
    }

    @Override
    public void off()
    {
        isOn = false;
    }
}
