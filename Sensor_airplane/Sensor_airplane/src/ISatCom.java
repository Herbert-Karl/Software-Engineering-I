public interface ISatCom {
    public String version();
    public void on ();
    public void connect(String satellite, String frequency);
    public void send(String request);
    public String receive();
    public void off();

}
