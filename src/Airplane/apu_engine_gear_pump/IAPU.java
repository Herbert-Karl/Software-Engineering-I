package Airplane.apu_engine_gear_pump;

public interface IAPU {
    String version();
    void start();
    void increaseRPM(int value);
    void decreaseRPM(int value);
    void shutdown();
}
