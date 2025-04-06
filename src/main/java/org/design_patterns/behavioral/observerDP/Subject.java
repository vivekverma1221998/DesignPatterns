package org.design_patterns.behavioral.observerDP;

public interface Subject {

    public void subscribe(Observer ob);

    public void unsubscribe(Observer ob);

    public void notifyToObserver();
}
