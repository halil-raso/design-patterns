package com.raso.bridge_pattern;

public class BigVehicle  extends Vehicle{

    private int weight;


    public BigVehicle(int weight){
        this.weight = weight;
    }

    public BigVehicle(){
        this.weight = 3000;
    }

    @Override
    public int drive(){
        int horsePower = engine.go();
        return horsePower;
    }


    public void someUtilityMethod(){
        int hPower =  drive();
        double ratio = weight / hPower;
        if(ratio <= 4){
            System.out.println("The Vehicle goes quickly");
        }else{
            System.out.println("The Vehicle goes slowly");
        }
    }



}
