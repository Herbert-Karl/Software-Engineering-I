import java.util.ArrayList;

public interface ISeatManagement {
    public String version();
    public int assign(ArrayList<Passenger> passengers);
}
