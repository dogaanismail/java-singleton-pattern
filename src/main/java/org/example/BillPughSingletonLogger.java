package org.example;

public class BillPughSingletonLogger extends SingletonBase {

    private BillPughSingletonLogger() {
    }

    public static BillPughSingletonLogger getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final BillPughSingletonLogger INSTANCE = new BillPughSingletonLogger();
    }
}
