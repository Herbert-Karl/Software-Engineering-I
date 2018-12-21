public class AirflowSensor implements IAirFlowSensor {
    private String manufacturer;
    private String type;
    private String id;
    private boolean isAlarm;
    private int airPreasure;

    @Override
    public String version() {
        return type + " " + id;
    }

    @Override
    public void measure(String airFlow) {                           //String mit 50 zeichen übergeben
        airPreasure = 0;
        if (!airFlow.isEmpty()) {
            if (airFlow.contains("p")) {
                for (int x = 0; x <= airFlow.length(); x++) {
                    if (airFlow.charAt(x) == 'p') {
                        airPreasure = airPreasure + 2;              // max. airpreasure = 100kPa
                    }
                }
            }
        }
    }

        @Override
        public void alarm (int threshold){

            if(airPreasure>=threshold)
            {isAlarm= true;}
            else{isAlarm= false;}

        }
    }

