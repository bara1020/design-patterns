package com.yoursoft.creational.prototype.example1;

public class ClassicShirt extends Shirt{

    public ClassicShirt() {
        this.image = "Without Image";
        this.designeName = "Solid Classic shirt";
    }

    @Override
    void addShirt() {
        System.out.println("Classic shirt added");
    }
}
