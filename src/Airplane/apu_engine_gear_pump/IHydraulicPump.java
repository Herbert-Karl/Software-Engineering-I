package Airplane.apu_engine_gear_pump;

public interface IHydraulicPump {
    String version();
    void compress();
    void compress(int amount);
    void decompress();
    void refillOil();
    void refillOil(int amount);
}
