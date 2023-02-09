package com.yoursoft.creational.prototype.example1;

public class SportShirt extends Shirt{

    public SportShirt() {
        this.image = "Logo image";
        this.designeName = "Sport shirt";
    }

    @Override
    void addShirt() {
        System.out.println("Sport shirt added");
    }
}
