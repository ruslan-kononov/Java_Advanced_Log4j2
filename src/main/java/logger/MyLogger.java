package logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLogger {
    private static Logger logger = LogManager.getLogger(MyLogger.class);

    public static void main(String[] args) {
        System.out.println("Session started...");
        logger.debug("Debug Message Logged !!!");
        logger.info("Info Message Logged !!!");
        logger.warn("Warn Message Logged !!!");
        logger.error("Error Message Logged !!!");
        System.out.println("Session completed!");
    }
}
