package com.raso.facade_pattern;

public class LG implements MobileShop{
    @Override
    public String modelNo() {
        return "LG 4G";
    }

    @Override
    public double price() {
        return 1000;
    }
}
