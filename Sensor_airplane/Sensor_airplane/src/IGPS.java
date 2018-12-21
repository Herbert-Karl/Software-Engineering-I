public interface IGPS {
    public String version();
    public void on();
    public void connect(String satellite);
    public void send(String request);
    public String reseve();
    public void off();

}
