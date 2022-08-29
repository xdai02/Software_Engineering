public class ChainOfResponsibilityPatternDemo {
    public static void main(String[] args) {
        Logger logChain = getLogChain();

        logChain.log(Logger.INFO, "[INFO] Hello world!");
        logChain.log(Logger.DEBUG, "[DEBUG] Hello world!");
        logChain.log(Logger.ERROR, "[ERROR] Hello world!");
    }

    private static Logger getLogChain() {
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger fileLogger = new FileLogger(Logger.DEBUG);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
