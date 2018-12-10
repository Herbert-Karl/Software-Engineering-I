package Airplane.sensor01;

public interface IIceDetectorProbe {
    String version();
    void activate();
    void detect();
    void detect(String surface);
    void detect(String surface,String pattern);
    void deactivate();
}
