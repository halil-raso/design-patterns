package com.raso.abstract_factory_pattern;

public class Green implements MyColor{
    @Override
    public void fill() {
        System.out.println("Green's fill method has been called");
    }
}
