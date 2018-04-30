package com.raso.flyweight_pattern;

public class FlyweightPatternTest {
    public static String[] colors = {"red", "green", "blue","white","black"};
    public static void main(String[] args){
        for(int i=0; i<colors.length;i++){
            Circle circle = ShapeFactory.getCircle(colors[i]);
            circle.draw();
        }
        //Drawing circle already existed
        Circle circle = ShapeFactory.getCircle("red");
        circle.draw();
    }
}
