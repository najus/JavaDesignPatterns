package com.test.observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

    private List<Observer> observers;
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex + 1) + " deleted");
        observers.remove(observerIndex);

    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(ibmPrice,applPrice,googPrice));
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setApplPrice(double applPrice) {
        this.applPrice = applPrice;
        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
