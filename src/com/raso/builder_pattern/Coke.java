package com.raso.builder_pattern;

public class Coke extends ColdDrink{

    @Override
    public float price() {
        return 2;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
