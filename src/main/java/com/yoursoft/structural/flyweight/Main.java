package com.yoursoft.structural.flyweight;

import com.yoursoft.structural.flyweight.enums.Color;
import com.yoursoft.structural.flyweight.enums.ShirtSize;
import com.yoursoft.structural.flyweight.factory.ShirtFactory;

public class Main {

    public static void main(String[] args) {
        Shirt redSmallShirt = ShirtFactory.getShirt(ShirtSize.SMALL, Color.RED.value);
        redSmallShirt.draw("First appearance!!");

        Shirt redSmallShirt2 = ShirtFactory.getShirt(ShirtSize.SMALL, Color.RED.value);
        redSmallShirt2.draw("Second appearance!!");

        System.out.println("Have the same hascode");
        System.out.println("Hashcode: " + redSmallShirt.hashCode());
        System.out.println("Hashcode: " + redSmallShirt2.hashCode());

        Shirt blueMediumShirt = ShirtFactory.getShirt(ShirtSize.SMALL, Color.BLUE.value); //created new pen
        blueMediumShirt.draw("First appearance!!");

        Shirt blueMediumShirt2 = ShirtFactory.getShirt(ShirtSize.SMALL, Color.BLUE.value);  //created new pen
        blueMediumShirt2.draw("Second appearance!!");

        System.out.println("Have the same hascode");
        System.out.println("Hashcode: " + blueMediumShirt.hashCode());
        System.out.println("Hashcode: " + blueMediumShirt2.hashCode());

        Shirt greenLargeShirt = ShirtFactory.getShirt(ShirtSize.SMALL, Color.GREEN.value); //created new pen
        greenLargeShirt.draw("First appearance!!");

        Shirt greenLargeShirt2 = ShirtFactory.getShirt(ShirtSize.SMALL, Color.GREEN.value); //created new pen
        greenLargeShirt.draw("Second appearance!!");

        System.out.println("Have the same hascode");
        System.out.println("Hashcode: " + greenLargeShirt.hashCode());
        System.out.println("Hashcode: " + greenLargeShirt2.hashCode());
    }
}
