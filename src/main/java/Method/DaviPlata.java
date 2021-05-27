package Method;

public class DaviPlata implements Payments{
    public void configurePayment(int quantity) { System.out.println(CONFIG + quantity); }

    public void makePayment() {
        System.out.println(PROCESS);
    }

    public String transactionSuccessful() { return CONFIRMATION + "DaviPlata"; }

    public void getReceipt() { System.out.println(RECEIPT); }

    public void transactionProcess(int quantity) {
        System.out.println(BOLD + "YOU CHOOSE THE DAVIPLATA PAYMENT METHOD");
        configurePayment(quantity);
        makePayment();
        System.out.println(transactionSuccessful());
        getReceipt();
    }
}

