public interface ITCAS {
    public String version();
    public void on();
    public void connect(String frequency);
    public boolean scan(String enviorment);
    public void alarm();
    public int determineAltitude(String enviroment);
    public int setAltitude(int value);
    public void off();
}
