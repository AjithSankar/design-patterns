package creational.abstractfactory;

public class AbstractCarFactoryProducer {

    public AbstractCarFactory getInstance(String value) {

        if (value.equals("economic")) {
            System.out.println("Producing Economic car factory...");
            return new EconomicCarFactory();
        }

        if (value.equals("luxury")) {
            System.out.println("Producing Luxury car factory...");
            return new LuxuryCarFactory();
        }

        return null;

    }
}
