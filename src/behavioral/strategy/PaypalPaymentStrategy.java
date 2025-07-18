package behavioral.strategy;

public class PaypalPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Processing payment using PayPal...");
    }
}
