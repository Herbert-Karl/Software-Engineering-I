package Airplane.Management;

public class CheckPoint {
    private int sequenceId;
    private String name;
    private String latitude;
    private String longitude;

    public CheckPoint(int sequenceId, String name, String latitude, String longitude) {
        this.sequenceId = sequenceId;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(int sequenceId) {
        this.sequenceId = sequenceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
