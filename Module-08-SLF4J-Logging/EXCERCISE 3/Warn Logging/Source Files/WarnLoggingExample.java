package com.cognizant.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WarnLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(WarnLoggingExample.class);

    public static void main(String[] args) {
        // Simulating a scenario where a warning might occur
        int diskSpacePercentage = 15;
        
        if (diskSpacePercentage < 20) {
            logger.warn("Low disk space warning! Only {}% remaining.", diskSpacePercentage);
        }
        
        logger.warn("This is a warning message");
    }
}
