package com.cognizant.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ErrorLoggingExample.class);

    public static void main(String[] args) {
        try {
            // Simulating an exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("An error occurred during calculation", e);
        }
        
        logger.error("This is an error message");
    }
}
