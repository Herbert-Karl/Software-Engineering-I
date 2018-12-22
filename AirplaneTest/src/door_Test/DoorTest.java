package door_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Airplane.door.*;

class DoorTest {
	
	@Test
	public void openTest() {
		open();
		assertEquals(true, isOpen);
	}

	@Test
	public void closeTest() {
		close();
		assertEquals(true, isClose);
	}
	@Test
	public void lockTest() {
		lock();
		assertEquals(true, isLocked);
	}
   
	@Test
	public void unlockTest() {
		unlock();
		assertEquals(true, isUnlocked);
	}
	
	
}
