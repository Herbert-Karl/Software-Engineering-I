public interface IVHF {
    public String version();
    public void on();
    public String forwardChannel();
    public String backwardChannel();
    public String selectChannel(String channel);
    public void send(String request);
    public String receive();
    public void off();
}
