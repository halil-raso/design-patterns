package com.raso.proxy_pattern;

public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin = false;
    private CommandExecutor executor;

    public CommandExecutorProxy(String usr, String pwd) {
        if (usr.equalsIgnoreCase("halil") && pwd.equalsIgnoreCase("123")) {
            isAdmin = true;
            executor = new CommandExecutorImpl();
        }
    }


    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.startsWith("rm")) {
                throw new Exception("rm command not allowed to be executed");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}
