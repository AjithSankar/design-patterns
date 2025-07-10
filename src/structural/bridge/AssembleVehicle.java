package structural.bridge;

public class AssembleVehicle implements Workshop {

    @Override
    public void work() {
        System.out.println("And Assembled.");
    }
}
