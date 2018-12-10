package Airplane.sensor03;

public interface IPitotTube {
    String version();
    int measureStaticPreasure();
    int measureTotalPreasure();
    void measureVelocity();
    void clean();
}
