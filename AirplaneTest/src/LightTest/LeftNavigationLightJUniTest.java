package LightTest;
import static org.junit.Assert.*;

import org.junit.*;

import LeftNavigationLight;
import LightType;
import Position;

public class LeftNavigationLightJUniTest {
	   private LeftNavigationLight NManufacturer,NId;
        private LightType red,green;
		private Position port, starboard;
		 String manufacturer=" Boeing";
		 String id ="234f";
	    private boolean isOn;
	    LightType  type=this.red;
	    Position position =this.port;
	    LeftNavigationLight test= new LeftNavigationLight(manufacturer,type,id,position,isOn);
	  @SuppressWarnings("static-access")
	@Test
	  public void versionTest(){
		  type =this.type.red;
		  test = new LeftNavigationLight(null,type,id,null,false);
		  
		  assertEquals("234f-red",test.version());
	  }
	  @Before
	  public void setUp() throws Exception{
	 	 System.out.println("Run @Before");
	 	 NManufacturer = new LeftNavigationLight("Airbus",null,null,null,false);
	 	  NId = new LeftNavigationLight(null,null,"09825h",null,false);
	 	 isOn=true;
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
	 	assertEquals(red,test.getType());
	 	 test.setType(green);
	 	 assertEquals(green,test.getType());
	  }
	
	  @Test
	  public void testGetterSetterId(){
	 	 System.out.println("Run @Test testGetterSetter");
	 	 assertEquals("09825h",NId.getId());
	 	 NId.setId("980929z");
	 	 assertEquals("980929z",NId.getId());
	  }  @Test
	  public void testGetterSetterPosition(){
		 	 System.out.println("Run @Test testGetterSetter");
		 	 test.setPosition(port);
		 	 assertEquals(this.port,test.getPosition());
		 	 test.setPosition(starboard);
		 	 assertEquals(starboard,test.getPosition());
		  }
	  
	@Test
	public void testGetterSetterIsOn(){
		System.out.println("Run @Test testGetterSetter");
		assertEquals(true,test.getIsOn());
		test.setIsOn(false);
		assertEquals(false,test.getIsOn());
	}

	}
