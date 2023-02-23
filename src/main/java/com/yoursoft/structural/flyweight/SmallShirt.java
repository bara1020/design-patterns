package com.yoursoft.structural.flyweight;

import com.yoursoft.structural.flyweight.enums.ShirtSize;

public class SmallShirt implements Shirt{

    final ShirtSize shirtSize = ShirtSize.SMALL;

    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing '" + content + "' in small color : " + color);
    }
}
