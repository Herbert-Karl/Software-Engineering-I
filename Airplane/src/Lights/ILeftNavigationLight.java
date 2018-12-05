public interface ILeftNavigationLight {
    public String version();
    public void setLightType(String type);
    public void setPosition(String position);
    public void on();
    public void off();
}
