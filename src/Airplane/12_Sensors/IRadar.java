public interface IRadar {
    public String version();
    public void on();
    public boolean scan(String environment);
    public void off();
}
