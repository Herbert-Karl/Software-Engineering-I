package Airport.Configuration;

import Airport.Base.Source;

import static Airport.Base.Source.MUC;

public enum Configuration {
    DATAFILEPATH(""), LOGFILEPATH(""), SOURCE(MUC);

    private String path;
    private Source source ;

    Configuration(final String path) {
        this.path = path;
    }

    Configuration(final Source source){
        this.source = source;
    }


    public String pathToString() {
        return path;
    }

    public Source sourceToSource(){
        return source;
    }

}
