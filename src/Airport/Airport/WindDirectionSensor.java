package Airport.Airport;

import java.util.Random;

import static Airport.Airport.WindDirection.EastToWest;
import static Airport.Airport.WindDirection.WestToEast;

public class WindDirectionSensor{
    public WindDirection measure(){
        Random rnd = new Random();
        int y = rnd.nextInt();

        if((y%2) == 0){
            return WestToEast;
        }
        else{
            return EastToWest;
        }
    }
}