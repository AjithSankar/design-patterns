package behavioral.observer;

public class Follower implements Observer {

    String name;

    public Follower(String name) {
        this.name = name;
    }

    @Override
    public void update(String topic) {
        System.out.println("Notified follower " + name + " about new post with name: " + topic);
    }
}
