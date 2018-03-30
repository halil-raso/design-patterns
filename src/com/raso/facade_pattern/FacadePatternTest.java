package com.raso.facade_pattern;

public class FacadePatternTest {

    public static void main(String[] args){
        ShopKeeper shopKeeper = new ShopKeeper();
        shopKeeper.iphoneSale();
        shopKeeper.samsungSale();
        shopKeeper.lgSale();
    }
}
