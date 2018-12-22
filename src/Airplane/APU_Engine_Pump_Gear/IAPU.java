interface IAPU {
  public String version();
  public void start();
  public void increaseRPM(int value);
  public void decreaseRPM(int value);
  public void shutdown();
}

