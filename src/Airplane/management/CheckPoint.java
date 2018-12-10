package Airplane.management;

class CheckPoint {
    private int sequenceID;
    private String name;
    private String latitude;
    private String longitude;

    public CheckPoint(int sequenceID, String name, String latitude, String longitude) {
        this.sequenceID = sequenceID;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getSequenceID() {
        return sequenceID;
    }

    public void setSequenceID(int sequenceID) {
        this.sequenceID = sequenceID;
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
