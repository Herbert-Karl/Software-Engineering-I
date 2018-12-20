public interface IStallingSensor {
    public  String version();
    public int measure(String airFlow);
    public void alarm();
}
