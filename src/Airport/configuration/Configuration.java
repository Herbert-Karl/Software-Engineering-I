package Airport.configuration;

import Airport.base.Source;

public class Configuration {
    private String dataFilePath;
    private String logFilePath;
    private Source source;

    public Configuration(String dataFilePath, String logFilePath) {
        this.dataFilePath = dataFilePath;
        this.logFilePath = logFilePath;
        this.source = Source.MUC;
    }

    public String getDataFilePath() {
        return dataFilePath;
    }

    public void setDataFilePath(String dataFilePath) {
        this.dataFilePath = dataFilePath;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}
