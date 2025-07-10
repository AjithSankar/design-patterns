package structural.facade;

public class PaymentService {

    public void makePayment(String from, String to, double amount) {
        System.out.println("Transfer of amount " + amount + " from " + from + " to " + to + " successful.");
    }
}
