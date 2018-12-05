
public interface IDeIcingSystem {
    public String version();
    public void activate();
    public void deactivate();
    public void deIce(int amount);
    public void refill();
}