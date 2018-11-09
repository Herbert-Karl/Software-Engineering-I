public interface IRouteManagement {

    public String version();
    public boolean on();
    public int add(CheckPoint checkPoint);
    public int remove(CheckPoint checkPoint);
    public void printCheckPoints();
    public double setCostIndex(int value);
    public boolean off();
}
