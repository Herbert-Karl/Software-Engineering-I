package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CameraTest {
    private Camera cameraTaxi, cameraTail, cameraWing;
//    private Configuration configuration;
//    private Airplane airplane;

    @BeforeEach
    void setup() {
//        configuration = new Configuration(4, 18, 72, 480, 14);
//        airplane = new Airplane(configuration);
        cameraTaxi = new Camera("CameraHersteller", CameraType.taxi);
        cameraTail = new Camera("CameraHersteller", CameraType.tail);
        cameraWing = new Camera("CameraHersteller", CameraType.wing);
    }

    @Test
    void verion() {
        assertEquals("234f-Tail", cameraTail.version());
        assertEquals("234f-Wing", cameraWing.verion());
        assertEquals("234f-Taxi", cameraTaxi.verion());
    }

    @Test
    void setType() {
        cameraTail.setType(CameraType.tail);
        assertEquals(CameraType.tail, camera.getType());
        cameraTaxi.setType(CameraType.taxi);
        assertEquals(CameraType.taxi, camera.getType());
        cameraWing.setType(CameraType.wing);
        assertEquals(CameraType.wing, camera.getType());
    }

    @Test
    void on() {
        cameraTail.on();
        assertTrue(cameraTail.isOn());
        cameraWing.on();
        assertTrue(cameraWing.isOn());
        cameraTaxi.on();
        assertTrue(cameraTaxi.isOn());
    }

    @Test
    void record() {
        on();
        assertTrue(!cameraTaxi.record().isEmpty());
        assertTrue(!cameraWing.record().isEmpty());
        assertTrue(!cameraTail.record().isEmpty());
        off();
    }

    @Test
    void zoomIn() {
        double factor = 5.4;
        on();
        cameraTaxi.zoomIn(factor);
        assertEquals(factor, cameraTaxi.getFactor());
        cameraWing.zoomIn(factor);
        assertEquals(factor, cameraWing.getFactor());
        cameraTail.zoomIn(factor);
        assertEquals(factor, cameraTail.getFactor());
        off();
    }

    @Test
    void off() {
        cameraTail.off();
        assertFalse(cameraTail.isOn());
        cameraWing.off();
        assertFalse(cameraWing.isOn());
        cameraTaxi.off();
        assertFalse(cameraTaxi.isOn());
    }


}
