package metrics.error;

import metrics.logger.ErrorLogger;

public class Repository implements Error {
    private String kvsName;
    private String action;

    public Repository(String kvsName, String action) {
        this.kvsName = kvsName;
        this.action = action;
    }
    public String getKvsName() {
        return kvsName;
    }

    public void setKvsName(String kvsName) {
        this.kvsName = kvsName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public void createLog(ErrorLogger logger) {
        logger.printLog(this);
    }
}
