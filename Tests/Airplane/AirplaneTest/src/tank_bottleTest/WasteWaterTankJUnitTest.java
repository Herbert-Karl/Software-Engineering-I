package tank_bottleTest;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import WasteWaterTank;


public class WasteWaterTankJUnitTest {
 private WasteWaterTank NManufacturer,NType,NId,NCapacity;
 String manufacturer=" Boeing";
 String type ="Einstahlig";
 String id ="234f";
 int capacity = 1000;
 int currentAmount =0;
 boolean islocked;
 WasteWaterTank test = new  WasteWaterTank(manufacturer,type,id,capacity,islocked);
@Test
public void testVersion(){	
assertEquals("234f-Einstahlig",test.version());
}
@Test 
public void addTestZero(){
test.add(-4);
assertEquals(0,test.getCurrentAmount());}
@Test
 public void addTestCapacity(){
test.add(1060);
assertEquals(1000,test.getCurrentAmount());}
@Test
 public void addTest(){
test.add(300);
assertEquals(300,test.getCurrentAmount());
}

@Before
public void setUp() throws Exception {
System.out.println("Run @Before");
NManufacturer= new  WasteWaterTank("Airbus",null,null,false);
NType = new    WasteWaterTank(null,"zweistahlig",null,false);
NId= new  WasteWaterTank(null,null,"09876544",false);
NCapacity = new  WasteWaterTank(null,null,null,1000,false);
test.unlock();
test.pumpOut();

}
@After
public void tearDownManufacturer() throws Exception {
System.out.println("Run @After"); // for illustration
test.lock();
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