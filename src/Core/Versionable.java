package Core;

import java.util.UUID;

public abstract class Versionable implements IVersionable{
    private final String type;
    private final String id;


    protected Versionable(String type) {
        this.type = type;
        this.id = UUID.randomUUID().toString();
    }
    public String version() {
        return "<" + id + "> - <" + type + ">";
    }
}
