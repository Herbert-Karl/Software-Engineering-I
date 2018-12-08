package Airport.Airport;

import java.util.Random;

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