package tank_bottleTest;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import DelcingSystem;

import org.junit.*;

public class DelcingSystemJUnitTestTest1{
	private DelcingSystem   NManufacturer,NType,NId,NCapacity;
	String manufacturer = "Boeing";
	String type = "Einstahlig";
	String id = "32492ß498";
	 int currentAmount = 0;
	 int capacity= 1000 ;
	 boolean isActivated=false;
	 DelcingSystem test = new  DelcingSystem(manufacturer,type,id,isActivated,capacity);
@Test
  public void testVersion() {	
	
		assertEquals("32492ß498-Einstahlig",test.version());
}
@Test 
   public void deIceTestZero(){
	test.deIce(5);
	assertEquals(0,test.getCurrentAmount());
	}
@Test 
public void deIceTestCapacity(){
	test.deIce(-2000);
	assertEquals(1000,test.getCurrentAmount());
	}
@Test 
public void deIceTest(){
	test.deIce(-5);
	assertEquals(5,test.getCurrentAmount());
	}
@Before
public void setUp() throws Exception {
System.out.println("Run @Before");
NManufacturer= new  DelcingSystem("Airbus",null,null,false);
NType = new  DelcingSystem(null,"zweistahlig",null,false);
NId= new  DelcingSystem(null,null,"09876544",false);
NCapacity = new  DelcingSystem(null,null,null,false,200);
test.activate();
test.getIsActivated();

}
@After
public void tearDownManufacturer() throws Exception {
   System.out.println("Run @After"); // for illustration
   test.deactivate();
   test.refill();
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
public void testGetterIsActive(){
   System.out.println("Run @Test testGetterSetter");
}
@Test
public void testGettersetterCapacity() {
  System.out.println("Run @Test testGetterSetter");
  assertEquals(200,NCapacity.getCapacity());
  NCapacity.setCapacity(-2);
  assertEquals(0,NCapacity.getCapacity());
  NCapacity.setCapacity(142);
 assertEquals(142,NCapacity.getCapacity());  
} 
@Test
public void testsetCurrentAmountCapacity() {
	System.out.println("Run @Test testGetterSetter");
	assertEquals(0,test.getCurrentAmount());
	NCapacity = new  DelcingSystem(null,null,null,false,200);
	test=new DelcingSystem(null,null,null,false,200);
    test.setCurrentAmount(300);
	 assertEquals(200,test.getCurrentAmount());  	  
} 
@Test
public void testsetCurrentAmountZero() {
	System.out.println("Run @Test testGetterSetter");
	test.setCurrentAmount(-4);;
	  assertEquals(0,test.getCurrentAmount());	  
} 
@Test
public void testsetCurrentAmount() {
	System.out.println("Run @Test testGetterSetter");
	test.setCurrentAmount(100);;
	  assertEquals(100,test.getCurrentAmount());	  
} 

}