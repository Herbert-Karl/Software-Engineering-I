public class VHF implements IVHF{
    private String manufacturer;
    private String type;
    private String id;
    private boolean isOn;
    private String channelList[];
    private String selectedChannel;

    @Override
    public String version() {
        return type+" "+id;
    }

    @Override
    public void on() {
        isOn=true;
    }

    @Override
    public String forwardChannel() {
        return null;
    }

    @Override
    public String backwardChannel() {
        return null;
    }

    @Override
    public String selectChannel(String channel) {
        return null;
    }

    @Override
    public void send(String request) {

    }

    @Override
    public String receive() {
        return null;
    }

    @Override
    public void off() {
        isOn=true;

    }
}
