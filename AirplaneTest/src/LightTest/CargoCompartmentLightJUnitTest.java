package LightTest;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import CargoCompartmentLight;

public class CargoCompartmentLightJUnitTest {
	private CargoCompartmentLight NManufacturer,NType,NId;
	 String manufacturer=" Boeing";
	 String type ="Einstahlig";
	 String id ="234f";
    private boolean isOn;
  //  private int brightnessLevel;
    CargoCompartmentLight test= new  CargoCompartmentLight(manufacturer,type,id,isOn);
    
  @Test
  public void versionTest(){
	  assertEquals("234f-Einstahlig",test.version());
  }
  @Before
  public void setUp() throws Exception{
 	 System.out.println("Run @Before");
 	 NManufacturer = new  CargoCompartmentLight("Airbus",null,"5" ,false);
 	 NType = new  CargoCompartmentLight(null,"Zweistahlig",null,false);
 	 NId = new  CargoCompartmentLight(null,null,"09825h",false);
 	 test.on(); 
  }
  @After
  public void tearDown() throws Exception{
 	 System.out.println("Run @Test testGetterSettter");
 	 test.off();
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
public void testGetterSetterIsOn(){
	System.out.println("Run @Test testGetterSetter");
	assertEquals(true,test.getIsOn());
	test.setIsOn(false);
	assertEquals(false,test.getIsOn());
}
@Test
public void testGetterSetterBrightnessLevel(){
	System.out.println("Run @Test testGetterSetter");
	test.setBrightnessLevel(102);
	assertEquals(100,test.getBrightnessLevel());
	test.setBrightnessLevel(-5);
	assertEquals(0,test.getBrightnessLevel());
	test.setBrightnessLevel(5);
	assertEquals(5,test.getBrightnessLevel());
}
@Test
public void testGetterSetterdim(){
	System.out.println("Run @Test testGetterSetter");
	test.dim(102);
	assertEquals(0,test.getBrightnessLevel());
	assertEquals(false,test.getIsOn()); 
	test.dim(-120);
	assertEquals(100,test.getBrightnessLevel());
	assertEquals(true,test.getIsOn());
	test.dim(-100);
	assertEquals(100,test.getBrightnessLevel());
	assertEquals(true,test.getIsOn());
	test.dim(0);
	assertEquals(100,test.getBrightnessLevel());
	assertEquals(true,test.getIsOn());
}

}


