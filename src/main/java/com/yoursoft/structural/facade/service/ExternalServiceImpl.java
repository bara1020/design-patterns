package com.yoursoft.structural.facade.service;

import com.yoursoft.structural.facade.domain.ExternalSystem;

public class ExternalServiceImpl  implements ExternalService{

    private static String FROM_EMAIL = "from@email.com";

    @Override
    public String getFromEmail() {
        System.out.printf("Searching from email...");
        System.out.printf(String.format("Email: %s", FROM_EMAIL));
        return FROM_EMAIL;
    }

    @Override
    public void SendEmail(ExternalSystem externalSystem) {
        System.out.println(String.format("External message request: %s",externalSystem));

    }
}
