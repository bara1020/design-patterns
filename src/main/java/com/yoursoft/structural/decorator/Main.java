package com.yoursoft.structural.decorator;

public class Main {

    public static void main(String[] args) {
        Car sportsCar = new SportCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
