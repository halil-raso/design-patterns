package com.raso.abstract_factory_pattern;

public class Red implements MyColor{
    @Override
    public void fill() {
        System.out.println("Red's fill method has been called");
    }
}
