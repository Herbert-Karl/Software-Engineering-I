package Airplane.airplanePart;

public class AirplanePart implements IAirplanePart {
    protected String manufacturer;
    protected String id;
    protected String type;

    @Override
    public String version()
    {
        return "<" + id + "> - <" + type + ">";
    }

    @Override
    public void setAll(String ID, String type, String brand)
    {
        id = ID;
        this.type = type;
        manufacturer = brand;
    }

    @Override
    public void setIDandBrand(String ID, String brand)
    {
        id = ID;
        manufacturer = brand;
    }
}
