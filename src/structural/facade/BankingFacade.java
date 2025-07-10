package structural.facade;

public class BankingFacade {

    AccountService accountService = new AccountService();
    PaymentService paymentService = new PaymentService();
    NotificationService notificationService = new NotificationService();

    public void createAccount(String name) {
        accountService.createAccount(name);
        notificationService.sendNotification();
    }

    public void sendMoney(String from, String to, double amount) {
        paymentService.makePayment(from, to, amount);
        notificationService.sendNotification();

    }

}
