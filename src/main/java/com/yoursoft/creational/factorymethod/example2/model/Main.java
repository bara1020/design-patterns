package com.yoursoft.creational.factorymethod.example2.model;

public class Main {

    public static void main(String[] args) {
        Campaign campaign = new Campaign(12, 10);

        CampaignType campaignType = CampainfFactory.getInstance("Premium");

        campaign.setDiscount(campaignType.getDiscount(1200));


    }
}
