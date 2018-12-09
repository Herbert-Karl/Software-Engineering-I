package Airplane.cabin;

public interface IAirConditioning {

    public String version();

    public void on();

    public String clean(String airFlow);

    public String heat(String airFlow, int temperature);

    public String cool(String airFlow, int temperature);

    public void off();
}
