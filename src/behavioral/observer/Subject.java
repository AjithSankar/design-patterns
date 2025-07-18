package behavioral.observer;

public interface Subject {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers(String topic);

    void post(String topic);
}
