package Airplane.Lights;

public class LeftNavigationLight implements ILeftNavigationLight {
    private String manufacturer;
    private LightType type;
    private String id;
    private Position position;
    private boolean isOn;

	/**
	* Default LeftNavigationLight constructor
	*/
	public LeftNavigationLight(String manufacturer, LightType type, String id, Position position, boolean isOn) {
		this.manufacturer = manufacturer;
		this.type = type;
		this.id = id;
		this.position = position;
		this.isOn = isOn;
	}

    /**
    * Get- and set-methods for arguments
    */
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public LightType getType() {
		return type;
	}

	public void setType(LightType type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public boolean getIsOn() {
		return isOn;
	}

	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}

    /**
    * Methods from Interface
    */
    public String version(){
        return (id + "-" + type);
    }

    public void setLightType(String type){
        this.type = LightType.valueOf(type.toLowerCase());
    }

    public void setPosition(String position){
        this.position = Position.valueOf(position.toLowerCase());
    }

    public void on(){
        setIsOn(true);
    }

    public void off(){
        setIsOn(false);
    }
}
