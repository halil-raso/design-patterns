package com.raso.bridge_pattern;

public class SmallEngine implements Engine{

    private int horsePower;


    public SmallEngine(){
        this.horsePower = 500;
    }


    public SmallEngine(int horsePower){
        if(horsePower>500){
            this.horsePower = 500;
        } else {
            this.horsePower =  horsePower;
        }

    }

    @Override
    public int go() {
        return this.horsePower;
    }
}
