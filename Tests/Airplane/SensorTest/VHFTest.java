package Airplane.SensorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class VHFTest {
    private VHF vhf;
    private String[] channelList = {"Channel01", "Channel02", "Channel03"};

    @BeforeEach
    void setup() {
        vhf = new VHF("VHFHersteller", "type01");
    }

    @Test
    void version() {
        assertEquals("VHF", vhf.version());
    }

    @Test
    void on() {
        vhf.on();
        assertTrue(vhf.isOn());
    }

    @Test
    void forwardChannel() {
        on();
        int selectedChannelIndex = Arrays.asList(vhf.getChannelList()).indexOf(vhf.getSelectedChannel());
        vhf.forwardChannel();
        assertEquals((selectedChannelIndex + 1) % vhf.getChannelList().length, Arrays.asList(vhf.getChannelList()).indexOf(vhf.getSelectedChannel()));
        off();
    }

    @Test
    void backwardChannel() {
        on();
        int selectedChannelIndex = Arrays.asList(vhf.getChannelList()).indexOf(vhf.getSelectedChannel());
        vhf.forwardChannel();
        assertEquals((selectedChannelIndex - 1) == -1 ? vhf.getChannelList().length - 1 : (selectedChannelIndex - 1), Arrays.asList(vhf.getChannelList()).indexOf(vhf.getSelectedChannel()));
        off();
    }

    @Test
    void selectChannel() {
        on();
        for (String string : vhf.getChannelList()) {
            vhf.selectChannel(string);
            assertEquals(string, vhf.getSelectedChannel());
        }
        off();
    }

    @Test
    void off() {
        vhf.off();
        assertFalse(vhf.isOn());
    }
}
