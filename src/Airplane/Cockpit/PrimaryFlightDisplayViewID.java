package Airplane.Cockpit;

public enum PrimaryFlightDisplayViewID {
    APUEngineGearPump, Cabin, Door, Seat, TankBottle, Light, FlightControl, Sensor, StowageCargo, Management {
        @Override
        public PrimaryFlightDisplayViewID next() {
            return values()[0];
        }
    };

    public PrimaryFlightDisplayViewID next() {
        return values()[ordinal() + 1];
    }
}
