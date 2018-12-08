package Airplane.cabin;

public interface IAirConditioning {

    public String version();

    public void on(); // war vorher boolean

    public String clean(String airFlow);

    public String heat(String airFlow, int temperature);

    public String cool(String airFlow, int temperature);

    public void off(); // war vorher boolean
}
