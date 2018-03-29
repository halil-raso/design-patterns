package com.raso.builder_pattern;

public class VegaBurger extends Burger{
    @Override
    public String name() {
        return "Vega Burger";
    }

    @Override
    public float price() {
        return 10;
    }

}
