package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IceDetectorProbeTest {
    private String[] surface = {"Body", "WingLeft", "WingRight"};
    private String pattern = "pattern";
    private IceDetectorProbe iceDetectorProbe;

    @BeforeEach
    void setup() {
        iceDetectorProbe = new IceDetectorProbe("IceDetectorProbeHersteller", "type01");
    }

    @Test
    void version() {
        assertEquals("IceDetectorProbe", iceDetectorProbe.version());
    }

    @Test
    void activate() {
        iceDetectorProbe.activate();
        assertTrue(iceDetectorProbe.isActivated);
    }

    @Test
    void deactivate() {
        iceDetectorProbe.deactivate();
        assertFalse(iceDetectorProbe.isActivated);
    }

    @Test
    void detect() {
        activate();
        iceDetectorProbe.detect();
//        assertTrue(iceDetectorProbe.isIceDetected());
    }

    @Test
    void detectSurface() {
        activate();
//        String[] surface = {"Body", "WingLeft", "WingRight"};
        for (String string : surface) iceDetectorProbe.detect(surface);
        assertTrue(iceDetectorProbe.isIceDetected());
    }

    @Test
    void detectSurfacePattern() {
        activate();
        for (String string : surface) iceDetectorProbe.detect(surface, pattern);
        assertTrue(iceDetectorProbe.isIceDetected());

    }
}
