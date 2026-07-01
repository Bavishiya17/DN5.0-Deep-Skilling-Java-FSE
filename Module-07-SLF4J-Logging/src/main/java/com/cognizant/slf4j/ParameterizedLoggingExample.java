package com.cognizant.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String user = "AdminUser";
        int failedAttempts = 3;

        logger.info("User {} logged in successfully.", user);
        logger.warn("User {} has {} failed login attempts.", user, failedAttempts);
    }
}
