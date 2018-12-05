public interface IServiceVehicleWasteWater {
    void executeRequest(GateID gateID);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGateID(GateID gateID);
    void connectToAirplane();
    void pumpOut(IWasteWaterTank wasteWaterTank);
    void disconnectFromAirplane();
    void setFlashingLightOff();
    void notifyGroundOperations(ServiceVehicleWasteWaterReceipt serviceVehicleWasteWaterReceipt);
    void returnToAirportResourcePool();
}
