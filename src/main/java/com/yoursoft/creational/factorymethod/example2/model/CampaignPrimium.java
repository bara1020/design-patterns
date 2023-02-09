package com.yoursoft.creational.factorymethod.example2.model;

public class CampaignPrimium implements CampaignType {
    @Override
    public double getDiscount(double value) {
        return value * 0.10;
    }
}
