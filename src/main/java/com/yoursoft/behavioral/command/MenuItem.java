package com.yoursoft.behavioral.command;

public class MenuItem {

    private String menuItemId;

    private String menuItemName;

    public MenuItem(String menuItemId, String menuItemName) {
        this.menuItemId = menuItemId;
        this.menuItemName = menuItemName;
    }

    public String getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(String menuItemId) {
        this.menuItemId = menuItemId;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public void executeCommand(Command command, String text) {
        command.execute(text);
    }
}
