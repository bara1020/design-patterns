package com.yoursoft.behavioral.command;

public class CopyCommand implements Command{

    public CopyCommand() {
    }

    @Override
    public Boolean execute(String text) {
        System.out.println("Copy command executed: " + text);
        return true;
    }
}
