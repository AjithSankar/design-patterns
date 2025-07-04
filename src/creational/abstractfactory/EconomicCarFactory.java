package creational.abstractfactory;

public class EconomicCarFactory implements AbstractCarFactory {

    @Override
    public Car createCar(int price) {

        if (price > 200000 && price < 400000) {
            return new EconomyCar2();
        } else if (price > 400000 && price < 500000) {
            return new EconomyCar1();
        }
        return null;
    }
}
