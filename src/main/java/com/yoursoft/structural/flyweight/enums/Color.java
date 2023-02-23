package com.yoursoft.structural.flyweight.enums;

public enum Color {

    RED("RED"),
    BLUE("BLUE"),
    GREEN("GREEN");

    public final String value;

    private Color(String value) {
        this.value = value;
    }
}
