package Airplane.apu_engine_gear_pump;

public interface IEngine {
    String version();
    void start();
    void increaseRPM(int value);
    void decreaseRPM(int value);
    void shutdown();
    void extinguishFire();
}
