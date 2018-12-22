public interface IAirFlowSensor {
    public String version();
    public void measure(String airFlow);
    public void alarm(int threshold);
}
