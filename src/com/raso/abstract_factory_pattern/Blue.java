package com.raso.abstract_factory_pattern;

public class Blue implements MyColor{
    @Override
    public void fill() {
        System.out.println("Blue's fill method has been called");
    }
}
