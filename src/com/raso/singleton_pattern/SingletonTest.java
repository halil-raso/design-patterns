package com.raso.singleton_pattern;

public class SingletonTest {

    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }

}
