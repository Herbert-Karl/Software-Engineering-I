public interface IExhaustGasTempertureSensor {
    public String version ();
    public void measure();
    public void alarmMajor(int threshold);
    public void alarmCritical (int threshold);
    }

