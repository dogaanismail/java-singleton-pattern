package org.example;

public class EagerInitializedSingletonLogger extends SingletonBase {
    private static final EagerInitializedSingletonLogger instance = new EagerInitializedSingletonLogger();

    private EagerInitializedSingletonLogger() {
    }

    public static EagerInitializedSingletonLogger getInstance() {
        return instance;
    }
}
