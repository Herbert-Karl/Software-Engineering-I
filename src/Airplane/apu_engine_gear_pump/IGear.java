package Airplane.apu_engine_gear_pump;

public interface IGear {
    String version();
    GearType setType(String type);
    void down();
    void up();
    void setBrake();
    void setBrake(int percentage);
    void releaseBrake();
}
