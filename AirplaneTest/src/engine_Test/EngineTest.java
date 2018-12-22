package engine_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import Engine;

public class EngineTest {

	String manufacturer = "boeing";
	  String type = "747";
	  String id = "888";
	  boolean isStarted = false;
	  int rpm = 50;
	  boolean isFire = false;


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

	@Test
	public void fireTest() {
		extinguishFire();
		assertEquals("Engine is on fire", System.in.read());
	}
	
	@Test
	public void versionTest() {
		assertEquals("<888> - <747>", version());
	}
	
	@Test
	public void startTest() {
		start();
		assertEquals(true, isStarted);
	}
	


}
