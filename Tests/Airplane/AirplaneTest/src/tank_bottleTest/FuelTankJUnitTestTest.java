package tank_bottleTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FuelTankJUnitTest {
 private FuelTank NManufacturer,NType,NId,NCapacity;
 String manufacturer=" Boeing";
 String type ="Einstahlig";
 String id ="234f";
 int capacity = 42750;
 int currentAmount =0;
  FuelTank test = new FuelTank(manufacturer,type,id,capacity);
	@Test
	public void VersionTest(){
		
		assertEquals("234f-Einstahlig",test.version());
		
	}
@Test
public void TakeOutTestZero(){
	test.takeOut(1);
	assertEquals(0,test.getCurrentAmount());
}
@Test
public void TakeOutTestCapacity(){
	 test.takeOut(-42752);
	 assertEquals(42750,test.getCurrentAmount()); 
}
@Test
public void TakeOutTest(){
	 test.takeOut(-42740);
	 assertEquals(42740,test.getCurrentAmount()); 
}
@Test
public void refillTestCapacity(){
	test.refill(42755);
	assertEquals(42750,test.getCurrentAmount());
}
@Test
public void refillTestZero(){
	 test.refill(-42752);
	 assertEquals(0,test.getCurrentAmount()); 
}
@Test
public void refillTest(){
	 test.refill(42740);
	 assertEquals(42740,test.getCurrentAmount()); 
}
 @Before
 public void setUp() throws Exception{
	 System.out.println("Run @Before");
	 NManufacturer = new FuelTank("Airbus",null,null);
	 NType = new FuelTank(null,"Zweistahlig",null);
	 NId = new FuelTank(null,null,"09825h");
	 NCapacity = new FuelTank(null,null,null,42752);
 }
 @After
 public void tearDown() throws Exception{
	 System.out.println("Run @Test testGetterSettter");
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
	 assertEquals("Zweistahlig",NType.getType());
	 NType.setType("Einstahlig");
	 assertEquals("Einstahlig",NType.getType());
 }
 @Test
 public void testGetterSetterId(){
	 System.out.println("Run @Test testGetterSetter");
	 assertEquals("09825h",NId.getId());
	 NId.setId("980929z");
	 assertEquals("980929z",NId.getId());
 }
 @Test
 public void testGettersetterCapacity() {
   System.out.println("Run @Test testGetterSetter");
   assertEquals(42752,NCapacity.getCapacity());
   NCapacity.setCapacity(-2);
   assertEquals(0,NCapacity.getCapacity());
   NCapacity.setCapacity(142);
  assertEquals(142,NCapacity.getCapacity());  
 } 
 @Test
 public void testsetCurrentAmountCapacity() {
 	System.out.println("Run @Test testGetterSetter");
 	assertEquals(0,test.getCurrentAmount());
     test.setCurrentAmount(42754);
 	 assertEquals(42750,test.getCurrentAmount());  	  
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