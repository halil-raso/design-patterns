package com.raso.abstract_factory_pattern;

public class ShapeFactory  extends AbstractFactory{

    @Override
    public MyColor getColor(String mColor) {
        return null;
    }

    @Override
    public Shape getShape(String mShape) {

        if(mShape == null){
            return null;
        } else if(mShape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (mShape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (mShape.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }
        return null;

    }
}
