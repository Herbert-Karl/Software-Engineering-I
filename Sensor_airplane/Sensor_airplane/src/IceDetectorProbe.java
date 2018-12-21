public class IceDetectorProbe implements IIceDetectorProbe{
    private String manufacturer;
    private String type;
    private String id;
    private boolean isActivated;
    private boolean isIceDetected;

    @Override
    public void activate() {
        isActivated=true;
    }

    @Override
    public String version() {
        return type+" "+id;
    }

    @Override
    public void detect() {
        isIceDetected=false;
    }

    @Override
    public void detect(String surface) {

        if (!surface.isEmpty()) {
            if (surface.contains("i")) {
               isIceDetected=true;
            }
        }
        isIceDetected=false;

    }

    @Override
    public void detect(String surface, String pattern) {


        if (!surface.isEmpty() && pattern.isEmpty()) {
            if (surface.contains(pattern)) {
                isIceDetected=true;
            }
        }
        isIceDetected=false;
    }

    @Override
    public void deactivate() {
        isActivated=false;

    }
}
