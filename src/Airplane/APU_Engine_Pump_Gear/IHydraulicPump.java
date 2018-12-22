interface IHydraulicPump {
  public String version();
  public void compress();
  public int compress(int amount);
  public void decompress();
  public void refillOil();
  public int refillOil(int amount);
}

