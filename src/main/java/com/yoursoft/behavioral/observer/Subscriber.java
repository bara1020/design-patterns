package com.yoursoft.behavioral.observer;

public class Subscriber implements Observer {

    protected String name;
    public Subscriber(String name) {
        super();
        this.name = name;
    }
    @Override
    public void notification(String handle, String post) {
        System.out.printf("%s received post notification : %s - Title: '%s'\n",name, handle, post);
    }
}
