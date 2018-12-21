import java.util.Random;

public class SatCom implements ISatCom{
    private String manufacturer;
    private String type;
    private String id;
    private boolean isConnected;
    private boolean isOn;

    @Override
    public String version() {
        return type+" "+id;
    }

    @Override
    public void on() {
        isOn=true;
    }

    @Override
    public void connect(String satellite, String frequency) {
        isConnected=true;
    }

    @Override
    public void send(String request) {

        System.out.print(request);

    }

    @Override
    public String receive() {
        String a = "";
        char c;
        for(int i=0; i <= 50; i++) {
            Random random = new Random();
            int ascii = random.nextInt(255);
            c = ((char) ascii);
            a= a+c;
        }
        return a;
    }

    @Override
    public void off() {
        isOn = false;

    }
}
