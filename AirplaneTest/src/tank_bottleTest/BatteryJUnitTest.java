package tank_bottleTest;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Battery;

public class BatteryJUnitTest {
	private Battery NManufacturer ,NType,NId,NCapacity,NCurrentPercentage;
		String manufacturer = "Boeing";
		String type = "Einstahlig";
		String id = "32492ß498";
		int currentPercentage = 0;
		 //Battery test = new Battery(manufacturer,type,id); 
		 int capacity= 100;
		 Battery test = new Battery(manufacturer,type,id,capacity);
	@Test
	public void testVersion() {	
	//String version = test.version();
	assertEquals("32492ß498-Einstahlig",test.version());
	}
	
	@Before
	public void setUp() throws Exception {
	System.out.println("Run @Before");
	NManufacturer = new Battery("Airbus",null,null);
	NType = new Battery(null,"zweistahlig",null);
	NId  = new Battery(null,null,"09876544");
	NCapacity = new Battery(null,null,null,50);
	NCurrentPercentage= new Battery(null,null,null,100);
	 NCurrentPercentage.charge();
	 
	}
   @After
   public void tearDownManufacturer() throws Exception {
	   System.out.println("Run @After"); // for illustration
		NCurrentPercentage.discharge();
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
public void testGetterSetterCapacity(){
	   System.out.println("Run @Test testGetterSetter");
	  assertEquals(50,NCapacity.getCapacity());
	  NCapacity.setCapacity(75);
	  assertEquals(75,NCapacity.getCapacity());
}

@Test
public void testSetterCurrentPercentage(){
	 NCurrentPercentage = new Battery(null,null,null,0);
	 NCurrentPercentage.setCurrentPercentage(101);
	 assertEquals(100,NCurrentPercentage.getCurrentPercentage());
     NCurrentPercentage.setCurrentPercentage(-1);
     assertEquals(0,NCurrentPercentage.getCurrentPercentage());
     NCurrentPercentage.setCurrentPercentage(50);
     assertEquals(50,NCurrentPercentage.getCurrentPercentage());
     
}
}

