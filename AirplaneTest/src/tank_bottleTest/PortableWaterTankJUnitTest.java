package tank_bottleTest;
import static org.junit.Assert.*;

import org.junit.*;

import PortableWaterTank;

public class PortableWaterTankJUnitTest{
	private  PortableWaterTank   NManufacturer,NType,NId,NCapacity;
	String manufacturer = "Boeing";
	String type = "Einstahlig";
	String id = "32492ß498";
	 int currentAmount = 0;
	 int capacity= 1000 ;
	 boolean isLocked;
	 PortableWaterTank test = new PortableWaterTank(manufacturer,type,id,capacity,isLocked);
@Test
  public void testVersion() {	
	
		assertEquals("32492ß498-Einstahlig",test.version());
}
@Test 
public void takeOutTestZero(){
	test.takeOut(3);
	assertEquals(0,test.getCurrentAmount());}
@Test
	 public void takeOutTestCapacity(){
	test.takeOut(-1060);
	assertEquals(1000,test.getCurrentAmount());}
@Test
	 public void takeOutTest(){
	test.takeOut(-300);
	assertEquals(300,test.getCurrentAmount());
	}
@Test 
public void refillCapacity(){
	test.refill(1200);
	assertEquals(1000,test.getCurrentAmount());
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
NManufacturer= new PortableWaterTank("Airbus",null,null,false);
NType = new   PortableWaterTank(null,"zweistahlig",null,false);
NId= new  PortableWaterTank(null,null,"09876544",false);
NCapacity = new PortableWaterTank(null,null,null,1000,false);
test.unlock();
}
@After
public void tearDownManufacturer() throws Exception {
   System.out.println("Run @After"); // for illustration
   test.lock();
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
public void testGetterSetterIsLocked(){
   System.out.println("Run @Test testGetterSetter");
   assertEquals(false,test.getIsLocked());
   test.setIsLocked(true);
   assertEquals(true,test.getIsLocked());
   test.setIsLocked(false);
   assertEquals(false,test.getIsLocked());
   
}
@Test
public void testGettersetterCapacity() {
  System.out.println("Run @Test testGetterSetter");
  assertEquals(1000,NCapacity.getCapacity());
  NCapacity.setCapacity(-2);
  assertEquals(0,NCapacity.getCapacity());
  NCapacity.setCapacity(142);
 assertEquals(142,NCapacity.getCapacity());  
} 
@Test
public void testsetCurrentAmountCapacity() {
	System.out.println("Run @Test testGetterSetter");
	assertEquals(0,test.getCurrentAmount());
    test.setCurrentAmount(3000);
	 assertEquals(1000,test.getCurrentAmount());  	  
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