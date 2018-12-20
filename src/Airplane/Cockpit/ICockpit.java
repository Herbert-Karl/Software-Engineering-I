package Airplane.Cockpit;

import Airplane.Aircraft.Airplane;

public interface ICockpit {
    void selectNextPhase();

    void executeSelectedPhase(Airplane airplane);

    void selectNextPrimaryFlightDisplay();
}
