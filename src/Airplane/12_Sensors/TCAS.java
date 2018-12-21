public class TCAS implements ITCAS{
    private String manufacturer;
    private String type;
    private String id;
    private boolean isOn;
    private boolean isConnected;
    private boolean isArlarm;
    private int altitude;

    @Override
    public String version() {
        return type+" "+id;
    }

    @Override
    public void on() {
        isOn=true;
    }

    @Override
    public void connect(String frequency) {

        isConnected=true;

    }

    @Override
    public boolean scan(String enviorment) {        //d = danger
        if (!enviorment.isEmpty()) {
            if (enviorment.contains("d")) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void alarm() {

        isArlarm=true;

    }

    @Override
    public int determineAltitude(String enviroment) {
        altitude = 0;
        if (!enviroment.isEmpty()) {
            if (enviroment.contains("d")) {
                for (int x = 0; x <= enviroment.length(); x++) {
                    if (enviroment.charAt(x) == 'p') {
                        altitude = altitude + 2;
                    }
                }
            }
        }
        return  altitude;
    }

    @Override
    public int setAltitude(int value) {
        altitude =value;
        return altitude;
    }

    @Override
    public  void off() {
        isOn=false;
    }
}
