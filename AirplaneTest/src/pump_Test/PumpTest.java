package pump_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import Airplane.APU_Engine_Pump_Gear.Interface_HydraulicPump.*;
public class PumpTest {

	String manufacturer = "boeing";
	String type = "747";
	String id = "888";
	int amountOfOil = 1000;

	@Test
	public void versionTest() {
		assertEquals("<888> - <747>", version());
	}


	@Test
	public void compressTest() {
		compress(500);
		assertEquals(1500, amountOfOil);
	}

	@Test
	public void decompressTest() {
		decompress(500);
		assertEquals(500, amountOfOil);
	}

	@Test
	public void refillTest() {
		refillOil();
		assertEquals(1000, amountOfOil);
	}

}
