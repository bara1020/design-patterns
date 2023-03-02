package com.yoursoft.behavioral.command;


public class Main {

    private static String COPY = "Copy";
    private static String PASTE = "Paste";

    public static void main(String[] args) {

        Button copyButton = new Button("copyButton",COPY);
        Button pasteButton = new Button("pasteButton",PASTE);
        MenuItem copyMenuItem = new MenuItem("copyMenuItem",COPY);
        MenuItem pasteMenuItem = new MenuItem("pasteMenuItem",PASTE);

        copyButton.executeCommand(new CopyCommand(),"Original Message from button");
        pasteButton.executeCommand(new PasteCommand(),"Original Message from button");

        copyMenuItem.executeCommand(new CopyCommand(),"Original Message from Menu Item");
        pasteMenuItem.executeCommand(new PasteCommand(),"Original Message from Menu Item");

    }


}
