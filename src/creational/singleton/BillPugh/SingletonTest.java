package creational.singleton.BillPugh;

public class SingletonTest implements Runnable {

    @Override
    public void run() {
        DBConnection instance = DBConnection.getInstance();
        System.out.println("Instance hashcode: " + instance.hashCode());
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
           Thread thread = new Thread(new SingletonTest());
           thread.start();
        }
    }
}

