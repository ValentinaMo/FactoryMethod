import Method.Factory;
import Method.Payments;

public class Application {

    public static void main(String[] args){
        Payments payments = Factory.construir("DaviPlata");
        payments.transactionProcess(1000);
    }
}
