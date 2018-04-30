package com.raso.chain_of_responsibility_pattern;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String msg) {
        System.out.println("Error Logger :: " + msg);
    }
}
