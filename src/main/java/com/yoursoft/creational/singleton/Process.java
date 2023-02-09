package com.yoursoft.creational.singleton;

public class Process implements Runnable{
    @Override
    public void run() {
        CustomSingleton customSingleton = CustomSingleton.getInstance();
    }
}
