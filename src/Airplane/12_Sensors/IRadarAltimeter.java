public interface IRadarAltimeter {
    public String version();
    public void on();
    public void send(String radioWave);
    public int receive(String radioWave);
    public int measureAltitude();
    public void off();
}
