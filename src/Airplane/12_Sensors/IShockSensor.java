public interface IShockSensor {
    public String version();
    public void calibrate();
    public void calibrate(double level);
    public int measure();
    public void arlarm();
}
