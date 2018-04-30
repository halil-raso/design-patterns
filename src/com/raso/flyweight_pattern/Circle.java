package com.raso.flyweight_pattern;

public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color){
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle as color: "+getColor()+ " x: "+getX()+ " y: "+getY()+" radius: "+ getRadius());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
