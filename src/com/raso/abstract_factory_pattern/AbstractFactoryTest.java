package com.raso.abstract_factory_pattern;

public class AbstractFactoryTest {

    public static void main(String[] args){

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        MyColor r = colorFactory.getColor("RED");
        r.fill();

        MyColor g = colorFactory.getColor("GREEN");
        g.fill();

        MyColor b = colorFactory.getColor("BLUE");
        b.fill();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape triangle = shapeFactory.getShape("TRIANGLE");
        triangle.draw();

    }

}
