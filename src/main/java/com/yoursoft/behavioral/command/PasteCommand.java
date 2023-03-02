package com.yoursoft.behavioral.command;

public class PasteCommand implements Command{

    public PasteCommand() {
    }

    @Override
    public Boolean execute(String text) {
        System.out.println("Paste command executed: " + text);
        return true;
    }
}
