package org.example;

public class ThreadSafeSingletonLogger extends SingletonBase {

    private static ThreadSafeSingletonLogger instance;

    private ThreadSafeSingletonLogger() {
    }

    public static ThreadSafeSingletonLogger getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingletonLogger();
        }
        return instance;
    }
}
