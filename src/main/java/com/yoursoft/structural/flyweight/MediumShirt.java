package com.yoursoft.structural.flyweight;

import com.yoursoft.structural.flyweight.enums.ShirtSize;

public class MediumShirt implements Shirt{

    final ShirtSize shirtSize = ShirtSize.MEDIUM;

    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing '" + content + "' in medium color : " + color);
    }
}
