package com.raso.abstract_factory_pattern;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle's draw method has been called");
    }
}