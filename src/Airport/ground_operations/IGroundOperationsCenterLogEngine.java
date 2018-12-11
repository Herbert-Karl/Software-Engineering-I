package Airport.ground_operations;

import Airport.ckeckin_desk.CheckInDeskReceipt;
import Airport.service_vehicle.ServiceVehicleWasteWaterReceipt;

import java.util.ArrayList;

public interface IGroundOperationsCenterLogEngine {
    void log(ArrayList<?> ReceiptList);
}
