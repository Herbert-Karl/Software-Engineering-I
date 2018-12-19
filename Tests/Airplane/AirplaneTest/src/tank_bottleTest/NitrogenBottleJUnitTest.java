package tank_bottleTest;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;

import NitrogenBottle;

import org.junit.*;
public class NitrogenBottleJUnitTest{
	private NitrogenBottle   NManufacturer,NType,NId,NCapacity;
	String manufacturer = "Boeing";
	String type = "Einstahlig";
	String id = "32492ß498";
	 int currentAmount = 0;
	 int capacity= 250;
	 NitrogenBottle test = new  NitrogenBottle(manufacturer,type,id,capacity);
@Test
  public void testVersion(){	
	
		assertEquals("32492ß498-Einstahlig",test.version());
}
@Test 
   public void takeOutTestZero(){
	test.takeOut(3);
	assertEquals(0,test.getCurrentAmount());}
@Test
	 public void takeOutTestCapacity(){
	test.takeOut(-260);
	assertEquals(250,test.getCurrentAmount());}
@Test
	 public void takeOutTest(){
	test.takeOut(-3);
	assertEquals(3,test.getCurrentAmount());
	}
@Test 
public void refillCapacity(){
	test.refill(260);
	assertEquals(250,test.getCurrentAmount());
	}
@Test 
public void refillZero(){
	test.refill(-1);
	assertEquals(0,test.getCurrentAmount());
	}
@Test 
public void refill(){
	test.refill(220);
	assertEquals(220,test.getCurrentAmount());
	}
@Before
public void setUp() throws Exception {
System.out.println("Run @Before");
NManufacturer= new  NitrogenBottle("Airbus",null,null);
NType = new  NitrogenBottle(null,"zweistahlig",null);
NId= new  NitrogenBottle(null,null,"09876544");
NCapacity = new  NitrogenBottle(null,null,null,250);

}
@After
public void tearDownManufacturer() throws Exception {
   System.out.println("Run @After"); // for illustration
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
  assertEquals(250,NCapacity.getCapacity());
  NCapacity.setCapacity(-2);
  assertEquals(0,NCapacity.getCapacity());
  NCapacity.setCapacity(142);
 assertEquals(142,NCapacity.getCapacity());  
} 
@Test
public void testsetCurrentAmountCapacity() {
	System.out.println("Run @Test testGetterSetter");
	assertEquals(0,test.getCurrentAmount());
	NCapacity = new  NitrogenBottle(null,null,null,200);
	test=new NitrogenBottle(null,null,null,200);
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
