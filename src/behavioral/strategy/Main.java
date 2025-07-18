package behavioral.strategy;

public class Main {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setPaymentStrategy(new CreditCardPaymentStrategy());
        shoppingCart.checkout(100);

        shoppingCart.setPaymentStrategy(new PaypalPaymentStrategy());
        shoppingCart.checkout(500);

    }

}
