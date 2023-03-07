package com.yoursoft.behavioral.observer;

public class Main {

    public static void main(String[] args) {
        Account socialNetworkAccount = new Account("social network account");

        Subscriber subscriber1 = new Subscriber("Subscriber number 1");
        Subscriber subscriber2 = new Subscriber("Subscriber number 2");

        socialNetworkAccount.addSubscriber(subscriber1);
        socialNetworkAccount.addSubscriber(subscriber2);

        socialNetworkAccount.sendNews("My first post");

        socialNetworkAccount.removeSubscriber(subscriber2);

        socialNetworkAccount.sendNews("My second post");
    }
}
