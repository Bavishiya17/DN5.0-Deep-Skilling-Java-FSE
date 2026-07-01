# Exercise 5: Appenders

## Task
Write a Java application that demonstrates using different appenders with SLF4J (specifically Console and File appenders).

## Step-by-Step Solution

1. Added SLF4J and Logback dependencies to the `pom.xml` file.
2. Created a `logback.xml` configuration file to define `ConsoleAppender` and `FileAppender`.
3. Created a Java class `AppendersExample` that uses SLF4J to log messages, which are routed to both the console and a file named `app.log`.

**Note on Screenshots:** Please run `AppendersExample.java` and capture the console output (and optionally show the `app.log` file) to save as `Screenshot.png` in this directory.
