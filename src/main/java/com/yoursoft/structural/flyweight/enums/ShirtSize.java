package com.yoursoft.structural.flyweight.enums;

public enum ShirtSize {
    SMALL("SMALL-SHIRT"),
    MEDIUM("MEDIUM-SHIRT"),
    LARGE("LARGE-SHIRT");

    public final String value;

    private ShirtSize(String value) {
        this.value = value;
    }
}
