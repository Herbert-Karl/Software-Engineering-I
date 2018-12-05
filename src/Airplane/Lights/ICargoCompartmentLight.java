package Airplane.Lights;

public interface ICargoCompartmentLight {
    public String version();
    public void on();
    public void dim(int dimPercentage);
    public void off();
}
