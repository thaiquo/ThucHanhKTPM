package iuh.fit.tuan03quocthai.observer;


import java.util.ArrayList;
import java.util.List;

public class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void attach(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(String msg) {
        for (Observer o : observers) {
            o.update(msg);
        }
    }
}
