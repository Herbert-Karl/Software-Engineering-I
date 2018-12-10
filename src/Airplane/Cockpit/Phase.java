package Airplane.Cockpit;
public enum Phase {
    Startup, Taxi, TakeOff, Climbing, RightTurn, LeftTurn {
        @Override
        public Phase next() {
            return values()[0];
        }
    };
    public Phase next() {
        return values()[ordinal() + 1];
    }
}
