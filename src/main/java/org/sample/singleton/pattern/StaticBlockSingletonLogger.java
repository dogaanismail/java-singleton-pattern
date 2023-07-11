package org.sample.singleton.pattern;

public class StaticBlockSingletonLogger extends SingletonBase {

    private static StaticBlockSingletonLogger instance;

    static {
        try {
            instance = new StaticBlockSingletonLogger();
        } catch (Exception exception) {
            throw new RuntimeException("Exception occurred while creating a new instance");
        }
    }

    private StaticBlockSingletonLogger() {
    }

    public static StaticBlockSingletonLogger getInstance() {
        return instance;
    }
}
