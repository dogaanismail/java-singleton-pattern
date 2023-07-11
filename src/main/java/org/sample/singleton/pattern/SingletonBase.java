package org.sample.singleton.pattern;

public abstract class SingletonBase {

    public void log(Exception e) {
        System.out.println(e.getMessage());
    }

    public void log(String message) {
        System.out.println(message);
    }
}
