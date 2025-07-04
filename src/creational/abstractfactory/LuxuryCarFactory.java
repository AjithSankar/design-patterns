package creational.abstractfactory;

public class LuxuryCarFactory implements AbstractCarFactory {

    @Override
    public Car createCar(int price) {

        if (price > 2000000 && price < 5000000) {
            return new LuxuryCar1();
        } else if (price > 5000000 && price < 10000000) {
            return new LuxuryCar2();
        }
        return null;
    }
}
