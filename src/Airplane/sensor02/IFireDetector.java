package Airplane.sensor02;

public interface IFireDetector {
    String version();
    boolean scan(String air);
    void alarm();
}
