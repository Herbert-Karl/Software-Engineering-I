package Airport.Federal_Police;

import Airport.Airport.Runway;

public interface IFederalPoliceCar {
    void forward(int speedInMPH);
    void backward(int speedInMPH);
    void stop();
    boolean setFlashLightOn();
    boolean setFlashLightOff();
}