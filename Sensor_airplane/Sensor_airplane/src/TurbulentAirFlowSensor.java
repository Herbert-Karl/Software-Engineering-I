public class TurbulentAirFlowSensor implements ITurbulentAirFLowSensor{
    private String manufacturer;
    private String type;
    private String id;
    private boolean isArlarm;

    @Override
    public String version() {
        return type+" "+id;
    }

    @Override
    public int measure(String airFlow) {
        int i=0;
        if (!airFlow.isEmpty()) {
            if (airFlow.contains("p")) {
                for (int x = 0; x <= airFlow.length(); x++) {
                    if (airFlow.charAt(x) == 'p') {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    @Override
    public void alarm() {
        isArlarm=true;

    }
}
