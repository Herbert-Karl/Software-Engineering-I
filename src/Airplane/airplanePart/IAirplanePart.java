package Airplane.airplanePart;

public interface IAirplanePart {
    String version();
    void setAll(String ID, String type);
    void setID(String ID);
}
