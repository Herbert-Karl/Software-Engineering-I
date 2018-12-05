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
}
