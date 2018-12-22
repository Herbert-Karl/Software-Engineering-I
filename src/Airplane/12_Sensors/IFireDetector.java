public interface IFireDetector {
    public String version ();
    public boolean scan(String air);
    public void alarm();

}
