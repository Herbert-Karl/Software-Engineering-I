package Airport.Checkin_Desk;

import Airport.Base.Passport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadingDeviceTest {

    private ReadingDevice readingDevice;
    private Passport passport;

    @BeforeEach
    void setUp(){
        ReadingDevice readingDevice = new ReadingDevice("type","id");
    }

    @Test
    void version() {
        assertNotNull(readingDevice.version());
    }

    @Test
    void scan() {
        assertTrue(readingDevice.scan(passport));
    }
}