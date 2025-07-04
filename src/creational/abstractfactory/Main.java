package creational.abstractfactory;

public class Main {

    public static void main(String[] args) {

        AbstractCarFactoryProducer abstractCarFactoryProducer = new AbstractCarFactoryProducer();
        AbstractCarFactory carFactory = abstractCarFactoryProducer.getInstance("economic");
        Car instance = carFactory.createCar(300000);
        System.out.println(instance.getTopSpeed());

    }
}
