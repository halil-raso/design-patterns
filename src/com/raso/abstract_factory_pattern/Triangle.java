package com.raso.abstract_factory_pattern;

public class Triangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Triangle's draw method has been called");
    }
}