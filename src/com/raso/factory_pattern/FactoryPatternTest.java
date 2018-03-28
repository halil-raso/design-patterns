package com.raso.factory_pattern;

public class FactoryPatternTest {
    public static void main(String[] args){

        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = factory.getShape("RECTANGLE");
        rectangle.draw();

        Shape triangle = factory.getShape("TRIANGLE");
        triangle.draw();

    }
}
