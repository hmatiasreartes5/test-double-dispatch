package metrics.error;

import metrics.logger.ErrorLogger;

public interface Error {
    void createLog(ErrorLogger logger);
}
