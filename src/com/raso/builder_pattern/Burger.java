package com.raso.builder_pattern;

public abstract class Burger implements Item{


    public abstract String name();

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
