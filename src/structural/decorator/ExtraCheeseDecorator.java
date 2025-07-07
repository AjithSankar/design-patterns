package structural.decorator;

public class ExtraCheeseDecorator extends ToppingDecorator {

    protected BasePizza basePizza;

    public ExtraCheeseDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    protected int cost() {
        return this.basePizza.cost() + 50;
    }
}
