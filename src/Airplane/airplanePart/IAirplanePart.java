package Airplane.airplanePart;

public interface IAirplanePart {
    String version();
    void setAll(String ID, String type, String brand);
    void setIDandBrand(String ID, String brand);
}
