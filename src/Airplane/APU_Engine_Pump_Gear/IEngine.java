
interface IEngine {
  public String version();
  public void start();
  public int increaseRPM(int value);
  public int decreaseRPM(int value);
  public void shutdown();
  public void extinguishFire();


}

