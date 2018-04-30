package com.raso.flyweight_pattern;


import java.util.HashMap;

public class ShapeFactory {
    public static HashMap shapes = new HashMap();
    public static Circle getCircle(String color){
        Circle circle= (Circle) shapes.get(color);
        if (circle==null){
            circle = new Circle(color);
            circle.setRadius((int)(Math.random()*100));
            circle.setX((int) (Math.random()*50));
            circle.setY((int) (Math.random()*25));
            shapes.put(color,circle);
            System.out.println("Creating new circle with color: "+color);
        }
        return circle;
    }
}
