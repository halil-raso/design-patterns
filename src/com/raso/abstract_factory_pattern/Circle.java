package com.raso.abstract_factory_pattern;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle's draw method has been called");
    }
}
