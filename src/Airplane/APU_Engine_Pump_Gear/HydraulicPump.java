public abstract class HydraulicPump implements IHydraulicPump {
  String manufacturer;
  String type;
  String id;
  int amountOfOil = 1000;
  

  
  public String version(){
    return "<" + id + "> - <" + type + ">";   
  }

//public int compress(){
//Funktion

//}


  public int compress(int x, int amount){
    
    
    int comp = amount + x;
    
    return comp;
    }

  public int decompress(int x, int amount){
    
    
    
    
    int decomp = amount - x;
    
    return decomp ;
    }
/*
public int refillOil(){

while (refillOil != 1000) {

refillOil.oil-- ;
}
}

*/

}
