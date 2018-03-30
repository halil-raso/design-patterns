package com.raso.bridge_pattern;

public class SmallVehicle extends Vehicle{

    private int weight;


    public SmallVehicle(int weight){
        this.weight = weight;
    }

    public SmallVehicle(){
        this.weight = 3000;
    }

    @Override
    public int drive(){
        int horsePower = engine.go();
        return  horsePower;
    }

    public void someUtilityMethod(){
        int hPower =  drive();
        double ratio = weight / hPower;
        if(ratio > 3){
            System.out.println("The Vehicle goes quickly");
        }else{
            System.out.println("The Vehicle goes slowly");
        }
    }

}
