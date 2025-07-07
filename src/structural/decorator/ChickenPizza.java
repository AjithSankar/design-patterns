package structural.decorator;

public class ChickenPizza extends BasePizza {

    @Override
    protected int cost() {
        System.out.println("Base Prize of Margherita pizza is : 200 ");
        return 200;
    }
}
