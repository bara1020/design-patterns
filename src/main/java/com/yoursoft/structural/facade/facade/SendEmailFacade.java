package com.yoursoft.structural.facade.facade;

import com.yoursoft.structural.facade.domain.BodyMessage;
import com.yoursoft.structural.facade.domain.ExternalSystem;
import com.yoursoft.structural.facade.domain.HeaderMessage;
import com.yoursoft.structural.facade.domain.request.RequestMessage;
import com.yoursoft.structural.facade.service.ExternalServiceImpl;

import java.util.Date;

public class SendEmailFacade {

    private static ExternalServiceImpl externalService = new ExternalServiceImpl();

    public static void sendEmail(RequestMessage requestMessage){
        ExternalSystem externalSystem = new ExternalSystem();

        BodyMessage bodyMessage = new BodyMessage();
        bodyMessage.setMessageId(requestMessage.getMessageId());
        bodyMessage.setMessage(requestMessage.getMessage());
        bodyMessage.setEmail(requestMessage.getEmail());
        bodyMessage.setSystemId(externalService.getFromEmail());

        HeaderMessage headerMessage = new HeaderMessage();
        headerMessage.setMessageId(requestMessage.getMessageId());
        headerMessage.setProcessDate(new Date());

        externalSystem.setHeaderMessage(headerMessage);

        externalService.SendEmail(externalSystem);

        System.out.println("Email send correctly");


    }
}
