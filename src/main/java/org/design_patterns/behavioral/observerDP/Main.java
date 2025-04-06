package org.design_patterns.behavioral.observerDP;

public class Main {

    public static void main(String[] args) {
        Observer observer = new ObserverImpl("vivek");
        Observer observer1 = new ObserverImpl("sonali");
        Observer observer2 = new ObserverImpl("rupali");
        Observer observer3 = new ObserverImpl("shashi");


        Subject subject = new SubjectImpl("learn design pattern with vivek");

        subject.subscribe(observer);
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);

        subject.notifyToObserver();
    }
}
