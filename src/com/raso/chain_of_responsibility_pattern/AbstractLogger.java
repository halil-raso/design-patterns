package com.raso.chain_of_responsibility_pattern;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    protected int level;
    protected AbstractLogger nextLogger;

    public void logMessage(int level, String msg) {
        if (this.level <= level) {
            write(msg);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, msg);
        }
    }

    protected void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public abstract void write(String msg);

}
