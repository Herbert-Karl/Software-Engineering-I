public interface ICamera {
    public String version();
    public CameraType setType(String type);
    public void on();
    public String record();
    public double zoomIn(boolean factor);
    public void off();
}
