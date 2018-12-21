package Airport.Service;

import Airport.Service_Vehicle.ServiceVehicleBase;
import Airport.Service_Vehicle.ServiceVehicleFreshWater;
import Airport.Service_Vehicle.ServiceVehicleNitrogenOxygen;
import Airport.Service_Vehicle.ServiceVehicleWasteWater;
import Airport.Sky_Tanking_Vehicle.SkyTankingVehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Airplane.Aircraft.Airplane;
import Airplane.Tanks.*;
import Airport.Airport.Airport;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Service_Vehicle.*;

public class TestingServiceVehicle {

//String uuid, String id, String type, int speedInMPH, boolean isFlashingLightOn, Gate gate, Airplane connectedAirplane)


    @Test
    public void ServiceVehicleTest01(){

        ServiceVehicleBase vehicle =new ServiceVehicleBase("123","11","test",10, false,null, null,null );
        vehicle.stop();
        assertEquals(0, vehicle.getSpeedInMPH());
    }

    @Test
    public void ServiceVehicleTest02(){

        ServiceVehicleBase vehicle =new ServiceVehicleBase("123","11","test",10, false,null, null, null );
        vehicle.move(4);
        assertEquals(4, vehicle.getSpeedInMPH());
    }
    @Test
    public void ServiceVehicleTest03(){

        ServiceVehicleBase vehicle =new ServiceVehicleBase("123","11","test",10, false,null, null, null );
        vehicle.setFlashingLightOn();
        assertEquals(true, vehicle.isFlashingLightOn());
    }

    @Test
    public void ServiceVehicleTest04(){

        ServiceVehicleBase vehicle =new ServiceVehicleBase("123","11","test",10, false,null, null, null );
        vehicle.setFlashingLightOff();
        assertEquals(false, vehicle.isFlashingLightOn());
    }
    @Test
    public void ServiceVehicleTest05(){
        ServiceVehicleBase vehicle =new ServiceVehicleBase("123","11","test",10, false,null, null,null );
        vehicle.disconnectFromAirplane();
        assertEquals(null, vehicle.getConnectedAirplane());
    }

    @Test
    public void ServiceVehicleTest06(){
        ServiceVehicleFreshWater vehicle= new ServiceVehicleFreshWater("123","11", "test",5,false,null,null, null);
        vehicle.stop();
        assertEquals(0, vehicle.getSpeedInMPH());
    }



    @Test
    public void ServiceVehicleTest07(){
        ServiceVehicleFreshWater vehicle= new ServiceVehicleFreshWater("123","11", "test",5,false,null,null, null);
        vehicle.move(12);
        assertEquals(12, vehicle.getSpeedInMPH());
    }
    @Test
    public void ServiceVehicleTest08(){

        ServiceVehicleFreshWater vehicle= new ServiceVehicleFreshWater("123","11", "test",5,false,null,null,null);
        vehicle.disconnectFromAirplane();
        assertEquals(null, vehicle.getConnectedAirplane());
    }
    @Test
    public void ServiceVehicleTest09(){

        ServiceVehicleFreshWater vehicle= new ServiceVehicleFreshWater("123","11", "test",5,false,null,null, null);
        vehicle.setFlashingLightOn();
        assertEquals(true, vehicle.isFlashingLightOn());
    }
    @Test
    public void ServiceVehicleTest10(){

        ServiceVehicleFreshWater vehicle= new ServiceVehicleFreshWater("123","11", "test",5,false,null,null, null);
        vehicle.setFlashingLightOff();
        assertEquals(false, vehicle.isFlashingLightOn());
    }

    @Test
    public void ServiceVehicleTest11(){
        ServiceVehicleWasteWater vehicle= new ServiceVehicleWasteWater("123","11", "test",5,false,200,null, null, null);
        vehicle.stop();
        assertEquals(0, vehicle.getSpeedInMPH());
    }

    @Test
    public void ServiceVehicleTest12(){
        ServiceVehicleWasteWater vehicle= new ServiceVehicleWasteWater("123","11", "test",5,false,200,null, null, null);
        vehicle.move(13);
        assertEquals(13, vehicle.getSpeedInMPH());
    }

    @Test
    public void ServiceVehicleTest13(){
        ServiceVehicleWasteWater vehicle= new ServiceVehicleWasteWater("123","11", "test",5,false,200,null, null, null);
        vehicle.stop();
        assertEquals(0, vehicle.getSpeedInMPH());
    }

    @Test
    public void ServiceVehicleTest14(){
        ServiceVehicleWasteWater vehicle= new ServiceVehicleWasteWater("123","11", "test",5,false,200,null, null, null);
        vehicle.setFlashingLightOn();
        assertEquals(true, vehicle.isFlashingLightOn());
    }

    @Test
    public void ServiceVehicleTest15(){
        ServiceVehicleWasteWater vehicle= new ServiceVehicleWasteWater("123","11", "test",5,false,200,null, null, null);
        vehicle.setFlashingLightOff();
        assertEquals(false, vehicle.isFlashingLightOn());
    }
    @Test
    public void ServiceVehicleTest16(){
        ServiceVehicleWasteWater vehicle= new ServiceVehicleWasteWater("123","11", "test",5,false,200,null, null, null);
        vehicle.disconnectFromAirplane();
        assertEquals(null, vehicle.getConnectedAirplane());
    }

    @Test
    public void ServiceVehicleTest17(){
        ServiceVehicleNitrogenOxygen vehicle= new ServiceVehicleNitrogenOxygen("123","11", "test",5,false,true,null, null,null );
        vehicle.stop();
        assertEquals(0, vehicle.getSpeedInMPH());
    }

    @Test
    public void ServiceVehicleTest18(){
        ServiceVehicleNitrogenOxygen vehicle= new ServiceVehicleNitrogenOxygen("123","11", "test",5,false,true,null, null, null);
        vehicle.move(12);
        assertEquals(12, vehicle.getSpeedInMPH());
    }

    @Test
    public void ServiceVehicleTest19(){
        ServiceVehicleNitrogenOxygen vehicle= new ServiceVehicleNitrogenOxygen("123","11", "test",5,false,true,null, null, null);
        vehicle.setFlashingLightOff();
        assertEquals(null, vehicle.isFlashingLightOn());
    }
    @Test
    public void ServiceVehicleTest20(){
        ServiceVehicleNitrogenOxygen vehicle= new ServiceVehicleNitrogenOxygen("123","11", "test",5,false,true,null, null, null);
        vehicle.setFlashingLightOn();
        assertEquals(true, vehicle.isFlashingLightOn());
    }

    @Test
    public void ServiceVehicleTest21(){
        ServiceVehicleNitrogenOxygen vehicle= new ServiceVehicleNitrogenOxygen("123","11", "test",5,false,true,null, null, null);
        vehicle.attachElectricalGrounding();
        assertEquals(true, vehicle.isElectricalGrounded());
    }

    @Test
    public void ServiceVehicleTest22(){
        ServiceVehicleNitrogenOxygen vehicle= new ServiceVehicleNitrogenOxygen("123","11", "test",5,false,true,null, null, null);
        vehicle.detachElectricalGrounding();
        assertEquals(false, vehicle.isElectricalGrounded());
    }
    @Test
    public void ServiceVehicleTest23(){
        ServiceVehicleNitrogenOxygen vehicle= new ServiceVehicleNitrogenOxygen("123","11", "test",5,false,true,null, null, null);
        vehicle.disconnectFromAirplane();
        assertEquals(true, vehicle.getConnectedAirplane());
    }

    @Test
    public void SkyTankingVehicleTest01(){
        SkyTankingVehicle vehicle= new SkyTankingVehicle("123","11","test",10,null,null,true,true,null, null, 15, null) ;
        vehicle.stop();
        assertEquals(0, vehicle.getSpeedInMPH());
    }

    @Test
    public void SkyTankingVehicleTest02(){
        SkyTankingVehicle vehicle= new SkyTankingVehicle("123","11","test",10,null,null,true,true,null, null, 15,null) ;
        vehicle.move(12);
        assertEquals(12, vehicle.getSpeedInMPH());
    }

    @Test
    public void SkyTankingVehicleTest03(){
        SkyTankingVehicle vehicle= new SkyTankingVehicle("123","11","test",10,null,null,true,true,null, null, 15, null ) ;
        vehicle.attachElectricalGrounding();
        assertEquals(true, vehicle.isElectricallyGrounded());
    }

    @Test
    public void SkyTankingVehicleTest04(){
        SkyTankingVehicle vehicle= new SkyTankingVehicle("123","11","test",10,null,null,true,true,null, null, 15, null) ;
        vehicle.detachElectricalGrounding();
        assertEquals(false, vehicle.isElectricallyGrounded());
    }
    @Test
    public void SkyTankingVehicleTest05(){
        SkyTankingVehicle vehicle= new SkyTankingVehicle("123","11","test",10,null,null,true,true,null, null, 15, null) ;
        vehicle.disconnectFromAirplane();
        assertEquals(true, vehicle.getConnectedAirplane());
    }
    @Test
    public void SkyTankingVehicleTest06(){
        SkyTankingVehicle vehicle= new SkyTankingVehicle("123","11","test",10,null,null,true,true,null, null, 15, null) ;
        vehicle.attachElectricalGrounding();
        assertEquals(true, vehicle.isElectricallyGrounded());
    }

    @Test
    public void SkyTankingVehicleTest07(){
        SkyTankingVehicle vehicle= new SkyTankingVehicle("123","11","test",10,null,null,true,true,null, null, 15, null) ;
        vehicle.setFlashingLightOff();
        assertEquals(false, vehicle.isFlashingLightOn());
    }
    @Test
    public void SkyTankingVehicleTest08(){
        SkyTankingVehicle vehicle= new SkyTankingVehicle("123","11","test",10,null,null,true,true,null, null, 15, null) ;
        vehicle.setFlashingLightOn();
        assertEquals(false, vehicle.isFlashingLightOn());
    }

    @Test
    public void SkyTankingVehicleTest09(){
        SkyTankingVehicle vehicle= new SkyTankingVehicle("123","11","test",10,null,null,true,true,null, null, 15, null) ;
        vehicle.detachElectricalGrounding();
        assertEquals(false, vehicle.isElectricallyGrounded());
    }
    @Test
    public void SkyTankingVehicleTest10(){
        SkyTankingVehicle vehicle= new SkyTankingVehicle("123","11","test",10,null,null,true,true,null, null, 15, null) ;
        vehicle.attachElectricalGrounding();
        assertEquals(true, vehicle.isElectricallyGrounded());
    }


}
