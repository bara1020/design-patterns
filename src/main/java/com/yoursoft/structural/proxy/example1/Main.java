package com.yoursoft.structural.proxy.example1;

public class Main {

    public static void main(String[] args) {
        ImageService image1 = new ImageServiceImpl(new Image("Juan_Image"));

        System.out.println("Image1 calling DisplayImage first time :");
        image1.displayImage();

        System.out.println("Image1 calling DisplayImage second time :");
        image1.displayImage();

        System.out.println("Image1 calling DisplayImage thrid time :");
        image1.displayImage();

    }
}
