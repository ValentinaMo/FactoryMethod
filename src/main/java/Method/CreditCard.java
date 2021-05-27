package Method;

public class CreditCard implements Payments{
    public void configurePayment(int quantity) { System.out.println(CONFIG + quantity); }

    public void makePayment() {
        System.out.println(PROCESS);
    }

    public String transactionSuccessful() { return CONFIRMATION + "CreditCard"; }

    public void getReceipt() { System.out.println(RECEIPT); }

    public void transactionProcess(int quantity) {
        System.out.println(BOLD + "YOU CHOOSE THE CREDIT CARD PAYMENT METHOD");
        configurePayment(quantity);
        makePayment();
        System.out.println(transactionSuccessful());
        getReceipt();
    }
}
