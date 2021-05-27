package Method;

import java.util.HashMap;

public class Factory {

    public static Payments construir(String type){

        HashMap paymentType = new HashMap();
        paymentType.put("CreditCard", new CreditCard());
        paymentType.put("Nequi", new Nequi());
        paymentType.put("DaviPlata", new DaviPlata());
        paymentType.put("PayPal", new PayPal());

        return (Payments) paymentType.get(type);
    }
}
