package com.yoursoft.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Account implements Subject  {


    protected List<Observer> observers = new ArrayList<Observer>();
    protected String name;
    protected String post;
    public Account(String name) {
        super();
        this.name = name;
        this.post = "from -> " + name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPost() {
        return post;
    }
    public void sendNews(String news) {
        System.out.printf("\nName: %s, Post : %s\n", name, news);
        notifySubscribers(news);
    }
    @Override
    public synchronized void addSubscriber(Observer observer) {
        observers.add(observer);
    }
    @Override
    public synchronized void removeSubscriber(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifySubscribers(String n) {
        observers.forEach(observer -> observer.notification(post, n));
    }
}
