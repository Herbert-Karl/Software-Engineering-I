package Airplane.Lights;

public class LogoLight implements ILogoLight {
    private String manufacturer;
    private String type;
    private String id;
    private boolean isOn;

	/**
	* Default LogoLight constructor
	*/
	public LogoLight(String manufacturer, String type, String id, boolean isOn) {
		this.manufacturer = manufacturer;
		this.type = type;
		this.id = id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

    public void on(){
        setIsOn(true);
    }

    public void off(){
        setIsOn(false);
    }
}
