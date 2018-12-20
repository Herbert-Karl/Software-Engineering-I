package Airplane.airplanePart;

public class AirplanePart implements IAirplanePart {
    protected String id;
    protected String type;

    @Override
    public String version()
    {
        return "<" + id + "> - <" + type + ">";
    }

    @Override
    public void setAll(String ID, String type)
    {
        id = ID;
        this.type = type;
    }

    @Override
    public void setID(String ID)
    {
        id = ID;
    }
}
