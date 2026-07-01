package com.cognizant.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppendersExample {
    private static final Logger logger = LoggerFactory.getLogger(AppendersExample.class);

    public static void main(String[] args) {
        logger.debug("This message should appear in both console and file appenders.");
        logger.info("This is an informational message.");
        logger.warn("This is a warning message.");
        logger.error("This is an error message.");
        
        System.out.println("Check the app.log file in your project root to see the file appender output!");
    }
}
