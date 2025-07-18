package structural.bridge;

public class Bike extends Vehicle {

    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    void manufacture() {
        System.out.print("Bike ");
        workshop1.work();
        workshop2.work();
    }
}
