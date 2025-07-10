package structural.bridge;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car(new ProduceVehicle(), new AssembleVehicle());
        car.manufacture();

        Vehicle bike = new Bike(new ProduceVehicle(), new AssembleVehicle());
        bike.manufacture();

    }
}
