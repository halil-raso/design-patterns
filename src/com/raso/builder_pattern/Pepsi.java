package com.raso.builder_pattern;

public class Pepsi extends ColdDrink{

    @Override
    public float price() {
        return  1;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
