package gear_Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Test;
import Gear;
public class GearTest {

	String manufacturer = "boeing";
	String type = "front";
	String id = "888";
	ArrayList<Wheel> wheels;
	boolean isDown = false;
	
	Brake brake = new Brake();
	
	@Test
	public void versionTest() {
		assertEquals("<888> - <747>", version());
	}
	
	@Test
	public void setTest() {
		assertEquals(GearType.front, setType(type));
	}
	
	
	public void downTest() {
		down();
		assertEquals(true, isDown);
	}
	
	
	@Test
	public void upTest() {
		up();
		assertEquals(false, isDown);
	}
	
	
	@Test
	public void setBrakeTest() {
		setBrake();
		assertEquals(100, Brake.percentage);
	}
	
	@Test
	public void releaseTest() {
	releaseBrake();
	assertEquals(0, Brake.percentage);
	}
	
}
