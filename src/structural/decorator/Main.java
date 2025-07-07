package structural.decorator;

// Decorator pattern used to add more functionalities to the existing objects
// without changing the existing behavior or structure

public class Main {

    public static void main(String[] args) {


        BasePizza basePizza = new MargheritaPizza();
        System.out.println("Base Pizza price : "+ basePizza.cost());
        basePizza = new PanneerDecorator(basePizza);
        System.out.println("Pizza price after decorating panneer : "+ basePizza.cost());
        basePizza = new ExtraCheeseDecorator(basePizza);
        System.out.println("Pizza price after decorating extra cheese : "+ basePizza.cost());
        System.out.println("Final price of pizza is : "+ basePizza.cost());

    }
}
