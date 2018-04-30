package com.raso.chain_of_responsibility_pattern;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String msg) {
        System.out.println("Console Logger:: " + msg);
    }
}
