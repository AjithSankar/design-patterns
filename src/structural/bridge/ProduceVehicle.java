package structural.bridge;

public class ProduceVehicle implements Workshop {

    @Override
    public void work() {
        System.out.print("Produced ");
    }
}
