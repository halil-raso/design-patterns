package com.raso.bridge_pattern;

public class BigEngine implements Engine{
    private int horsePower;


    public BigEngine(){
        this.horsePower = 1000;
    }


    public BigEngine(int horsePower){
        if(horsePower<1000){
            this.horsePower = 1000;
        } else {
            this.horsePower =  horsePower;
        }

    }

    @Override
    public int go() {
        //System.out.println("The Engine has "+horsePower+ "as a horsepower");
        return horsePower;
    }

}
