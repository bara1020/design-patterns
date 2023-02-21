package com.yoursoft.structural.decorator;

public class CarDacorator implements Car{

    protected Car car;

    public CarDacorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
