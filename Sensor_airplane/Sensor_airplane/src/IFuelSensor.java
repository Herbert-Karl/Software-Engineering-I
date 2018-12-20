public interface IFuelSensor {
    public String version ();
    public void measure();
    public void alarmMajor(int threshold);
    public void alarmCritical (int threshold);
    public void alarmReserve (int threshold);
}
