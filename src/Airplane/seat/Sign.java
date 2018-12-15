package Airplane.seat;

import Airplane.airplanePart.IAirplanePart;

import java.util.UUID;

public abstract class Sign implements ISign {

    protected String uuid;
    protected IAirplanePart sign;
    protected boolean isOn;

    protected void setSign(String ID, String type, String brand)
    {
        uuid = UUID.randomUUID().toString();
        sign.setAll(ID, type, brand);
        isOn = false;
    }

    @Override
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
