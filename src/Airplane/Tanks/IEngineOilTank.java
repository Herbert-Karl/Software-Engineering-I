package Airplane.Tanks;

public interface IEngineOilTank {
    public String version();
    public void increaseLevel(int value);
    public void decreaseLevel(int value);
}