package org.design_patterns.behavioral.observerDP;

public class ObserverImpl implements Observer{

    private String name;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void notified(String title) {
        String s = "Hi, " + this.name + ": new video uploaded - " + title;
        System.out.println(s);
    }
}


