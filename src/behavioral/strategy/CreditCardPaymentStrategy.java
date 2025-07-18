package behavioral.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Processing payment using credit card...");
    }
}
