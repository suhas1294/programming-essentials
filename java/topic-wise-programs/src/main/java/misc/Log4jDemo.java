package misc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
    private static final Logger logger1 = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    private static final Logger logger2 = LogManager.getLogger(Log4jDemo.class);
    private static final Logger logger3 = LogManager.getRootLogger();

    public static void main(String[] args) {
        logger1.debug("Hello from Log4j 1");
        logger2.debug("Hello from Log4j 2");
        logger3.debug("Hello from Log4j 3");
        logger2.info("some string");
    }
}
