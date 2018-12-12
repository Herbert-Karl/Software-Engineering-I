package Airport.federal_police;

public interface IFederalPoliceCar {
    void forward(int speedInMPH);
    void backward(int speedInMPH);
    void stop();
    void setFlashingLightOn();
    void setFlashingLightOff();
}
