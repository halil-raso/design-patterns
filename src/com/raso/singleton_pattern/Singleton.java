package com.raso.singleton_pattern;

public class Singleton {

    private static Singleton instance;
    private Singleton(){
    }

    public static Singleton getInstance(){

        if(instance==null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;

    }

    public void doSomething(){
        System.out.println("Doing something on singleton method");
    }

}
