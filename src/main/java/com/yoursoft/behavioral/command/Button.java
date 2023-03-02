package com.yoursoft.behavioral.command;

public class Button {

    private String buttonId;

    private String buttonName;

    public Button(String buttonId, String buttonName) {
        this.buttonId = buttonId;
        this.buttonName = buttonName;
    }

    public String getButtonId() {
        return buttonId;
    }

    public void setButtonId(String buttonId) {
        this.buttonId = buttonId;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public void executeCommand(Command command, String text) {
        command.execute(text);
    }
}
