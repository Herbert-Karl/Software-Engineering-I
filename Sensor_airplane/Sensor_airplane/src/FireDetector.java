public class FireDetector implements IFireDetector{
    private String manufacturer;
    private String type;
    private String id;
    private boolean isAlram;

    @Override
    public String version() {
        return type+" "+id;
    }

    @Override
    public boolean scan(String air) {       //Random String sobalt f (f=fire) vorhanden ist wird ausgelöst
        if (!air.isEmpty()) {
            if (air.contains("f")) {
                return true;
                }
            }
            return false;
        }


    @Override
    public void alarm() {
        isAlram=true;
    }
}
