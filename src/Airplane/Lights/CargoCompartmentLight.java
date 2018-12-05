package Airplane.Lights;

public class CargoCompartmentLight implements ICargoCompartmentLight {
    private String manufacturer;
    private String type;
    private String id;
    private boolean isOn;
    private int brightnessLevel;

    /**
	* Default AntiCollisionLight constructor
	*/
	public CargoCompartmentLight(String manufacturer, String type, String id, boolean isOn) {
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

    public int getBrightnessLevel() {
        return brightnessLevel;
    }

    public void setBrightnessLevel(int brightnessLevel) {
        if(brightnessLevel > 100)
            this.brightnessLevel = 100;
        else if(brightnessLevel < 0)
            this.brightnessLevel = 0;
        else
            this.brightnessLevel = brightnessLevel;
    }

    /**
    * Methods from Interface
    */
    public String version() {
        return (id + "-" + type);
    }

    public void on() {
        setIsOn(true);
        setBrightnessLevel(100);
    }

    public void dim(int dimPercentage) {
        // To lower brightnessLevel pos. dimPercentage;
        // To increase brightnessLevel neg. dimPercentage;
        int tempBrightnessLevel = brightnessLevel - dimPercentage;
        if (tempBrightnessLevel <= 0) {
            brightnessLevel = 0;
            setIsOn(false);
        }
        else if (tempBrightnessLevel >= 100) {
            brightnessLevel = 100;
            setIsOn(true);
        }
        else {
            brightnessLevel = tempBrightnessLevel;
            setIsOn(true);
        }
    }

    public void off() {
        setIsOn(false);
        setBrightnessLevel(0);
    }
}
