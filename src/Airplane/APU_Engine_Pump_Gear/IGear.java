interface IGear { 
  enum GearType {
    front,
    rear
  }
  public String version();
  public GearType setType(String type);
  public void down();
  public void up();
  public void setBrake();
  public void setBrake(int percentage);
}

