package com.raso.builder_pattern;

public abstract class ColdDrink implements Item{


    public abstract float price();

    public abstract String name();

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
