package metrics.logger;

import metrics.error.Communication;
import metrics.error.Repository;

public class PrintErrorErrorLogger implements ErrorLogger {
    @Override
    public void printLog(Repository repository) {
        System.out.printf("Fallo la operacion %s del kvs %s%n",
                repository.getAction(),
                repository.getKvsName());
    }

    @Override
    public void printLog(Communication communication) {
        System.out.printf("Fallo el api call de %s con status %d%n",
                communication.getApiName(),
                communication.getApiStatus());
    }
}
