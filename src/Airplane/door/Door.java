package Airplane.door;

import Airplane.airplanePart.IAirplanePart;

public abstract class Door implements IDoor{

    protected IAirplanePart door;
    protected boolean isLocked;
    protected boolean isClosed;

    protected void setDoor(String ID, String brand, String type)
    {
        door.setAll(ID, type, brand);
        isLocked = false;
        isClosed = true;
    }

    protected void setGearDoor(String ID, String brand)
    {
        door.setIDandBrand(ID, brand);
        isLocked = false;
        isClosed = true;
    }

    @Override
    //the version contains id and type
    public String version()
    {
        return door.version();
    }

    @Override
    //Opening the door if it isn´t locked
    public void open()
    {
        if (!isLocked)
            isClosed = false;
    }

    @Override
    //Closing the door
    public void close()
    {
        isClosed = true;
    }

    @Override
    //Closes the door if needed and locks it
    public void lock()
    {
        if(!isClosed)
            close();
        isLocked = true;
    }

    @Override
    //Unlocks the door and remains in the current state of isClosed
    public void unlock()
    {
        isLocked = false;
    }
}
