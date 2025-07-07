package structural.decorator;

public class PanneerDecorator extends ToppingDecorator {

    protected BasePizza basePizza;

    public PanneerDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    protected int cost() {
        return this.basePizza.cost() + 100;
    }
}
