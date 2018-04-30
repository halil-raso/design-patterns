package com.raso.proxy_pattern;

public class ProxyPatternTest {
    public static void main(String[] args) {
        String usr = "halil";
        String pwd = "123";
        String usr1 = "khalil";
        String pwd1 = "123";
        CommandExecutor executor = new CommandExecutorProxy(usr, pwd);
        try {
            executor.runCommand("ls");
            executor.runCommand("rm test.txt");
            executor.runCommand("ls");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        CommandExecutor executor1 = new CommandExecutorProxy(usr1, pwd1);
        try {
            executor1.runCommand("rm test.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
