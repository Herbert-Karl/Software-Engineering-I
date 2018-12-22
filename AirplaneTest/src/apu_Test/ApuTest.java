package apu_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
import APU;

public class ApuTest {

	String manufacturer = "boeing";
	String type = "747";
	String id = "888";
	boolean isStarted = false;
	int rpm = 50;
	
	@Test
	public void versionTest() {
		assertEquals("<888> - <747>", version());
	}

	@Test
	public void startTest() {
		start();
		assertEquals(true, isStarted);
	}
	
	@Test
	public void increaseTest() {
		increaseRPM(50);
		assertEquals(100, rpm);
	}
	
	@Test
	public void decreaseTest() {
		decreaseRPM(50);
		assertEquals(0, rpm);
	}
	
	@Test
	public void shutdownTest() {
		shutdown();
		assertEquals(false, isStarted);
		assertEquals(0, rpm);
	}

	
	

}
