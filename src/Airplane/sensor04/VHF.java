package Airplane.sensor04;

public class VHF implements IVHF {
    String manufacturer;
    String type;
    String id;
    boolean isOn;
    String[] channelList;
    String selectedChannel;

    public VHF(String manufacturer, String type, String id, boolean isOn, String[] channelList, String selectedChannel) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isOn = isOn;
        this.channelList = channelList;
        this.selectedChannel = selectedChannel;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void on() {

    }

    @Override
    public void forwardChannel() {

    }

    @Override
    public void backwardChannel() {

    }

    @Override
    public void selectChannel(String channel) {

    }

    @Override
    public void send(String request) {

    }

    @Override
    public String recieve() {
        return null;
    }

    @Override
    public void off() {

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String[] getChannelList() {
        return channelList;
    }

    public void setChannelList(String[] channelList) {
        this.channelList = channelList;
    }

    public String getSelectedChannel() {
        return selectedChannel;
    }

    public void setSelectedChannel(String selectedChannel) {
        this.selectedChannel = selectedChannel;
    }
}
