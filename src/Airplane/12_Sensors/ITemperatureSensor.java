public interface ITemperatureSensor {
    public String version();
    public void measure();
    public void alarm(int threshold);
}
