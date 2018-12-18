interface IGear {
	public String version();
	public Geartype setType(String);
	public boolean down();
	public boolean up();
	public int setBrake();
	public int setBrake(int);
}

class Gear implements IGear {
	String manufacturer;
	String type;
	String id;
	ArrayList<Wheel> wheels;
	boolean isDown;

public string setType(){
//Funktion
}

public string version(){
//Funktion
}

public boolean down(){
//Funktion
}

public boolean up(){
//Funktion
}


}

class Wheel {
	String id;
	long dateofManufacture;
	Brake brake;


}

class Brake {
	String id;
	long dateofManufacture;
	int percentage;

public int setBrake(){
//Funktion
}

public int setBrake(int Percentage){
//Funktion
}

}

Enum GearType {
	front;
	rear;
}