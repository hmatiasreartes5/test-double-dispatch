package metrics.error;

import metrics.logger.ErrorLogger;

public class Communication implements Error{
    private String apiName;
    private int apiStatus;

    public Communication(String apiName, int apiStatus) {
        this.apiName = apiName;
        this.apiStatus = apiStatus;
    }
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public int getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(int apiStatus) {
        this.apiStatus = apiStatus;
    }

    @Override
    public void createLog(ErrorLogger logger) {
        logger.printLog(this);
    }
}
