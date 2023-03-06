package com.yoursoft.behavioral.mediator;

public class Main {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Juan");
        User user2 = new UserImpl(mediator, "Manuel");
        User user3 = new UserImpl(mediator, "Vanessa");
        User user4 = new UserImpl(mediator, "Matías");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi everyone");

    }
}
