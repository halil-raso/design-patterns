package com.raso.bridge_pattern;

public abstract class Vehicle {

    Engine engine;

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public abstract int drive();

}
