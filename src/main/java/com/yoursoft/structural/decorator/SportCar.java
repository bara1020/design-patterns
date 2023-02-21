package com.yoursoft.structural.decorator;

public class SportCar extends CarDacorator {

    public SportCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}
