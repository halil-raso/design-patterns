package com.raso.facade_pattern;

public class Iphone implements MobileShop {
    @Override
    public String modelNo() {
        return "Iphone 4S";
    }

    @Override
    public double price() {
        return 2000;
    }
}
