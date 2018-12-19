package tank_bottleTest;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import EngineOilTank;

public class EngineOilTankJUnitTest {
	private EngineOilTank NManufacturer,NType,NId,NMaximumLevel,NcurrentLevel;
	String manufacturer = "Boeing";
	String type = "Einstahlig";
	String id = "32492ß498";
	 int currentLevel = 0;
	 int maximumLevel= 5 ;
	 EngineOilTank test = new EngineOilTank(manufacturer,type,id,maximumLevel);
	@Test
	public void testVersion() {	
	assertEquals("32492ß498-Einstahlig",test.version());
	}
	@Before
	public void setUp() throws Exception {
	System.out.println("Run @Before");
	NManufacturer= new EngineOilTank("Airbus",null,null);
	NType = new EngineOilTank(null,"zweistahlig",null);
	NId= new EngineOilTank(null,null,"09876544");
	NMaximumLevel = new EngineOilTank(null,null,null,6);
	
	}
	@Test
	public void testIncreaseLevelTrueFalse(){
		test.increaseLevel(7);
		assertEquals(5,test.getCurrentLevel());
		
		}
	@Test
	public void testIncreaselLevelFalseTrue() {
		test.increaseLevel(3);
		assertEquals(3,test.getCurrentLevel());
		} 
	@Test
	public void decreaselLevelZero(){
		test.decreaseLevel(2);
		assertEquals(0,test.getCurrentLevel()); }
	@Test
	public void decreaselLevel(){
		test.decreaseLevel(-2);
		assertEquals(2,test.getCurrentLevel());  }
	
   @After
   public void tearDownManufacturer() throws Exception {
	   System.out.println("Run @After"); // for illustration
	   }
   @Test
   public void testGetterSetterManufacturer(){
	   System.out.println("Run @Test testGetterSetter");
	   assertEquals("Airbus",NManufacturer.getManufacturer());
	   NManufacturer.setManufacturer("Boeing");
	   assertEquals("Boeing",NManufacturer.getManufacturer());
   }  
  @Test
  public void testGetterSetterType(){
	   System.out.println("Run @Test testGetterSetter");
	   assertEquals("zweistahlig",NType.getType());
	   NType.setType("Einstahlig");
	   assertEquals("Einstahlig",NType.getType());
  }
 @Test
 public void testGetterSetterId(){
	   System.out.println("Run @Test testGetterSetter");
	    assertEquals("09876544",NId.getId());
	    NId.setId("6653890");
	   assertEquals("6653890",NId.getId());
 }
@Test
public void testGetterSetterMaximumLevel(){
	   System.out.println("Run @Test testGetterSetter");
	  assertEquals(6,NMaximumLevel.getMaximumLevel());
	  NMaximumLevel.setMaximumLevel(7);
	  assertEquals(7,NMaximumLevel.getMaximumLevel());
}
@Test
public void testsetCurrentLevelMax() {
	NcurrentLevel = new EngineOilTank(null,null,null,5);
	 NMaximumLevel.setMaximumLevel(5);
	  assertEquals(5,NMaximumLevel.getMaximumLevel());
	  NcurrentLevel.setCurrentLevel(8);
	  assertEquals(5,NcurrentLevel.getCurrentLevel());	  
} 
@Test
public void testsetCurrentLevelZero() {
	NcurrentLevel = new EngineOilTank(null,null,null,6);
	  NcurrentLevel.setCurrentLevel(-2);
	  assertEquals(0,NcurrentLevel.getCurrentLevel());	  
} 
@Test
public void testsetCurrentLevel() {
	NcurrentLevel = new EngineOilTank(null,null,null,6);
	  NcurrentLevel.setCurrentLevel(3);
	  assertEquals(3,NcurrentLevel.getCurrentLevel());	  
} 

}