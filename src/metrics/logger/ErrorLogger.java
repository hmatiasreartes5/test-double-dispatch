package metrics.logger;

import metrics.error.Communication;
import metrics.error.Repository;

public interface ErrorLogger {
    void printLog(Repository repository);
    void printLog(Communication communication);
}
