public interface IIceDetectorProbe {
    public void activate();
    public String version ();
    public void detect();
    public void detect(String surface);
    public void detect(String surface, String pattern);
    public void deactivate();
}
