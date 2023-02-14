package com.yoursoft.structural.facade;

import com.yoursoft.structural.facade.domain.BodyMessage;
import com.yoursoft.structural.facade.domain.ExternalSystem;
import com.yoursoft.structural.facade.domain.request.RequestMessage;
import com.yoursoft.structural.facade.facade.SendEmailFacade;
import com.yoursoft.structural.facade.service.ExternalServiceImpl;

public class Main {

    public static String MESSAGE_ID = "123";
    public static String EMAIL = "to@email.com";
    public static String MESSAGE = "Hi, this is a message test";
    public static String SYSTEM_ID = "1";


    public static void main(String[] args) {

        RequestMessage requestMessage = new RequestMessage(MESSAGE_ID, EMAIL, MESSAGE, SYSTEM_ID);

        SendEmailFacade.sendEmail(requestMessage);

    }
}
