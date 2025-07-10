package structural.facade;

public class Main {

    public static void main(String[] args) {

        BankingFacade bankingFacade = new BankingFacade();
        bankingFacade.createAccount("Ajith");
        bankingFacade.sendMoney("Ajith", "Magizh", 100000000);
    }
}
