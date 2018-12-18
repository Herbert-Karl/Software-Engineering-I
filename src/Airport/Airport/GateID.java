package Airport.Airport;

public enum GateID{
    A01, A02, A03, A04, A05,
    B01, B02, B03, B04, B05, GATE_ID;

    public GateID getGateNumber(int number){
        switch(number){
            case 1: return A01;
            case 2: return A02;
            case 3: return A03;
            case 4: return A04;
            case 5: return A05;
            case 6: return B01;
            case 7: return B02;
            case 8: return B03;
            case 9: return B04;
            case 10: return B05;
        }
        return GATE_ID;
    }
}