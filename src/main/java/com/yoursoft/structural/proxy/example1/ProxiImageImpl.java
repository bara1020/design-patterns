package com.yoursoft.structural.proxy.example1;

public class ProxiImageImpl implements ImageService{

    private ImageServiceImpl imageService;
    private Image image;

    public ProxiImageImpl(Image image) {
        this.image = image;
    }

    @Override
    public void displayImage() {
        if (imageService == null)
            imageService = new ImageServiceImpl(image);
        imageService.displayImage();
    }
}
