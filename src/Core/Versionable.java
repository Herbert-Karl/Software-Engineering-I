package Core;

import java.util.UUID;

public abstract class Versionable implements IVersionable{
    private final String type;
    private final String id;
    private final String manufacturer;


    protected Versionable(String type, String manufacturer) {
        this.type = type;
        this.id = UUID.randomUUID().toString();
        this.manufacturer = manufacturer;
    }
    public String version() {
        return "<" + id + "> - <" + type + ">";
    }
}
