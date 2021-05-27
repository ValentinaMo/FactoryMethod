package Method;

public interface Payments {
    String CONFIG = "We are verifying the payment method in the data base...\nTransaction in process for an amount of ";
    String PROCESS = "Payment in process...";
    String CONFIRMATION = "Payment was successful, the payment method was ";
    String RECEIPT = "The receipt was generated successfully and will be sent to your email. Thank you!";
    String BOLD = "\u001B[1m";

    public void configurePayment(int quantity);
    public void makePayment();
    public String transactionSuccessful();
    public void getReceipt();
    public void transactionProcess(int quantity);
}
