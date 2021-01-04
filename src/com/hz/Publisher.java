package com.hz;

import java.util.ArrayList;

public class Publisher {
    private ArrayList<Observer> observers;

    protected String topic;

    public Publisher() {
        this.observers = new ArrayList<>();
    }

    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer: this.observers) {
            observer.update(this.topic);
        }
    }
}
