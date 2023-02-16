package com.yoursoft.structural.proxy.example1;

import java.net.FileNameMap;

public class ImageServiceImpl implements ImageService{

    private Image image;

    public ImageServiceImpl(Image image) {
        this.image = image;
        loadImage();
    }

    public void loadImage(){
        //This download or load maybe for example from internet or external system
        System.out.println("Loading image: "+ image.getFileName());
    }
    @Override
    public void displayImage() {
        System.out.println("Display image: "+ image.getFileName());
    }
}
