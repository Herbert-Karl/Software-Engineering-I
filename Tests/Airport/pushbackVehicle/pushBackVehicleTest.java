package Airport.pushbackVehicle;
import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Configuration;
import Airport.Pushback_Vehicle.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class pushBackVehicleTest {

    @Test
    void connect() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,0,0,false,false,false );
        Configuration config = new Configuration(4,18,72,480,14);
        Airplane airplane = new Airplane(config);
        push.connect(airplane);
        assertEquals(true, push.isAirplaneConnected());
    }
    @Test
    void disconect() {
        PushBackVehicle push = new PushBackVehicle("1","1","",true,0,0,false,false,false );
        push.disconnectAirplane();
        assertEquals(false, push.isAirplaneConnected());
    }
    @Test
    void forward() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,0,0,false,false,false );
        push.forward(10);
        assertEquals(10, push.getSpeedInMPH());
    }
    @Test
    void backward() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,10,0,false,false,false );
        push.backward(10);
        assertEquals(10, push.getSpeedInMPH());
    }
    @Test
    void turnLeft() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,0,0,false,false,false );
        push.turnLeft(10);
        assertEquals(-10, push.getDegree());
    }
    @Test
    void turnRight() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,0,0,false,false,false );
        push.turnRight(10);
        assertEquals(10, push.getDegree());
    }
    @Test
    void stop() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,20,0,false,false,false );
        push.stop();
        assertEquals(0, push.getSpeedInMPH());
    }
    @Test
    void up() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,20,0,false,false,false );
        push.up();
        assertEquals(true, push.isUp());
    }
    @Test
    void up1() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,20,0,true,false,false );
        push.up();
        assertEquals(true, push.isUp());
    }
    @Test
    void down() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,20,0,true,false,false );
        push.down();
        assertEquals(false, push.isUp());
    }
    @Test
    void down() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,20,0,false,false,false );
        push.down();
        assertEquals(false, push.isUp());
    }
    @Test
    void flashingLightOn() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,20,0,false,false,false );
        push.setFlashingLightOn();
        assertEquals(true, push.isFlashingLightOn());
    }
    @Test
    void flashingLightOn1() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,20,0,false,true,false );
        push.setFlashingLightOn();
        assertEquals(true, push.isFlashingLightOn());
    }
    @Test
    void flashingLightOff() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,20,0,false,true,false );
        push.setFlashingLightOff();
        assertEquals(false, push.isFlashingLightOn());
    }
    @Test
    void flashingLightOff1() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,20,0,false,false,false );
        push.setFlashingLightOff();
        assertEquals(false, push.isFlashingLightOn());
    }
    @Test
    void setSteeringPin() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,20,0,false,false,false );
        push.setSteeringPin();
        assertEquals(true, push.isSteeringPinSet());
    }
    @Test
    void setSteeringPin1() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,20,0,false,false,true );
        push.setSteeringPin();
        assertEquals(true, push.isSteeringPinSet());
    }
    @Test
    void removeSteeringPin() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,20,0,false,false,true );
        push.removeSteeringPin();
        assertEquals(false, push.isSteeringPinSet());
    }
    @Test
    void removeSteeringPin() {
        PushBackVehicle push = new PushBackVehicle("1","1","",false,20,0,false,false,false );
        push.removeSteeringPin();
        assertEquals(false, push.isSteeringPinSet());
    }
}
