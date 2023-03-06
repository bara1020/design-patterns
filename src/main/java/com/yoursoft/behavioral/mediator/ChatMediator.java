package com.yoursoft.behavioral.mediator;

public interface ChatMediator {


    public void sendMessage(String msg, User user);

    public void addUser(User user);
}