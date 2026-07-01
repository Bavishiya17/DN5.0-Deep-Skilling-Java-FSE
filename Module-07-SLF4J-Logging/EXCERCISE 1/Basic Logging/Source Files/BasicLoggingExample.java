package com.cognizant.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(BasicLoggingExample.class);

    public static void main(String[] args) {
        logger.info("Application started.");
        logger.debug("This is a debug message, useful for developer troubleshooting.");
        logger.info("Basic logging exercise completed successfully.");
    }
}
