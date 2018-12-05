package Core;

public abstract class Versionable implements IVersionable{
    private final String type;
    private final String id;


    protected Versionable(String type, String id) {
        this.type = type;
        this.id = id;
    }
    public String version() {
        return "<" + id + "> - <" + type + ">";
    }
}
