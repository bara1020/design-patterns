
package com.yoursoft.structural.decorator;

public class LuxuryCar extends CarDacorator{
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }

}
