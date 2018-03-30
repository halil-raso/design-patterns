package com.raso.facade_pattern;

public class ShopKeeper {
    private Iphone iphone;
    private Samsung samsung;
    private LG lg;
    public ShopKeeper(){
        iphone = new Iphone();
        samsung = new Samsung();
        lg = new LG();
    }

    public void iphoneSale(){
        System.out.println("IPHONE: \nModel: "+iphone.modelNo()+ "\nPrice: "+iphone.price());
        System.out.println("***********************");
    }


    public void samsungSale(){
        System.out.println("SAMSUNG: \nModel: "+samsung.modelNo()+ "\nPrice: "+samsung.price());
        System.out.println("***********************");
    }

    public void lgSale(){
        System.out.println("LG: \nModel: "+lg.modelNo()+ "\nPrice: "+lg.price());
        System.out.println("***********************");
    }

}
