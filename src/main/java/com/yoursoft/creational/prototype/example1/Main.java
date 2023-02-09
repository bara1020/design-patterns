package com.yoursoft.creational.prototype.example1;

public class Main {

    public static void main(String[] args) {
        ShirtStore.getShirt("classicShirt").addShirt();
        ShirtStore.getShirt("sportShirt").addShirt();
        ShirtStore.getShirt("another").addShirt();

    }
}
