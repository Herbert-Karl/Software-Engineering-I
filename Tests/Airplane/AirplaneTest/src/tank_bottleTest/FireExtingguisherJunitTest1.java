package tank_bottleTest;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;

import FireExtingguisher;

import org.junit.*;

public class FireExtingguisherJunitTest1{
    private FireExtingguisher NManufacturer ,NType,NId,NCurrentPercentage;
	String manufacturer = "Boeing";
	String type = "Einstahlig";
	String id = "32492ß498";
	int currentPercentage = 0; 
	 FireExtingguisher test = new FireExtingguisher(manufacturer,type,id);
@Test
public void testVersion() {	
assertEquals("32492ß498-Einstahlig",test.version());
}

@Before
public void setUp() throws Exception {
System.out.println("Run @Before");
NManufacturer = new FireExtingguisher("Airbus",null,null);
NType = new FireExtingguisher(null,"zweistahlig",null);
NId  = new FireExtingguisher(null,null,"09876544");
NCurrentPercentage= new FireExtingguisher(null,null,null,100);
NCurrentPercentage.refill();
}
@After
public void tearDownManufacturer() throws Exception {
   System.out.println("Run @After"); // for illustration
   NCurrentPercentage.apply();
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
public void testSetterCurrentPercentage(){
	FireExtingguisher test = new FireExtingguisher(manufacturer,type,id,currentPercentage);
 test.setCurrentPercentage(101);
 assertEquals(100,test.getCurrentPercentage());
 test.setCurrentPercentage(-1);
 assertEquals(0,test.getCurrentPercentage());
 test.setCurrentPercentage(50);
 assertEquals(50,test.getCurrentPercentage());
 
}
}
