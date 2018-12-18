interface IHydraulicPump {
	public String version();
	public void compress();
	public int compress(int amount);
	public void decompress();
	public void refillOil();
	public int refillOil(int amount);
}

class HydraulicPump implements IHydraulicPump {
	String manufacturer;
	String type;
	String id;
	int amountOfOil = 1000;

public String version(){
System.out.println(version);
}

public int compress(){
//Funktion

}


public int compress(int x){

int amount;

int comp = amount + x;



}

public int decompress(){

int amount;
int x;

int decomp = amount - x;


}

public int refillOil(){

while (refillOil != 1000) {

refillOil.oil-- ;
}
}



}