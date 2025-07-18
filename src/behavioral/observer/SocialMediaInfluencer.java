package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaInfluencer implements Subject {

    String name;
    List<Observer> observers = new ArrayList<>();

    public SocialMediaInfluencer(String name) {
        this.name = name;
    }

    @Override
    public void post(String topic) {
        notifyObservers(topic);
    }

    @Override
    public void subscribe(Observer observer) {
        System.out.println("Subscribing to Influencer " + name);
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unsubscribe(Observer observer) {
        System.out.println("Unsubscribing to influencer " + name);
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String topic) {
        for (Observer observer : observers) {
            observer.update(topic);
        }
    }
}
