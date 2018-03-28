package com.raso.abstract_factory_pattern;

public class ColorFactory extends AbstractFactory{

    @Override
    public MyColor getColor(String mColor) {
        if(mColor == null){
            return null;
        } else if(mColor.equalsIgnoreCase("RED")){
            return new Red();
        } else if (mColor.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if (mColor.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String mShape) {
        return null;
    }


}
