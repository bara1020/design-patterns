package com.yoursoft.creational.factorymethod.example2.model;

public class CampainfFactory {

    public static CampaignType getInstance(String compaingType){

        if(compaingType.equals("Premium")){
            return new CampaignPrimium();
        } else {
            return new CampaignBasic();
        }

    }
}
