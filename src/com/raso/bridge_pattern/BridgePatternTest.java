package com.raso.bridge_pattern;

public class BridgePatternTest {

    public static void main(String[] args){
        BigVehicle bigVehicle =  new BigVehicle(4000);
        bigVehicle.setEngine(new BigEngine());
        bigVehicle.someUtilityMethod();
        bigVehicle.setEngine(new SmallEngine());
        bigVehicle.someUtilityMethod();

        //***************************************

        SmallVehicle smallVehicle = new SmallVehicle(2000);
        smallVehicle.setEngine(new BigEngine());
        smallVehicle.someUtilityMethod();
        smallVehicle.setEngine(new SmallEngine());
        smallVehicle.someUtilityMethod();

    }
}
