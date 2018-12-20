package Airplane.airplanePart;

import java.util.UUID;

public class AirplanePart implements IAirplanePart {
    private String id;
    private String type;

    public AirplanePart(String type) {
        id = UUID.randomUUID().toString();
        this.type = type;
    }
    @Override
    public String version()
    {
        return "<" + id + "> - <" + type + ">";
    }
}