package org.design_patterns.behavioral.observerDP;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject{

    private String title;

     private List<Observer> observerList = new ArrayList<>();

    public SubjectImpl(String title) {
        this.title = title;
    }

    @Override
    public void subscribe(Observer ob) {
        observerList.add(ob);
        System.out.println("subscriber added");
    }

    @Override
    public void unsubscribe(Observer ob) {

    }

    @Override
    public void notifyToObserver() {

        for(Observer ob: this.observerList){
            ob.notified(this.title);
        }
    }
}
