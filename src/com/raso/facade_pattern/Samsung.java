package com.raso.facade_pattern;

public class Samsung implements MobileShop {
    @Override
    public String modelNo() {
        return "Samsung S4";
    }

    @Override
    public double price() {
        return 15000;
    }
}
