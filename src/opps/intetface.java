package opps;

interface Payment{
    void pay(double amount);
}

class PayPal implements Payment {
    public void pay(double amount) {
        System.out.println("Paid via PayPal: " + amount); }
}

class Stripe implements Payment {
    public void pay(double amount) {
        System.out.println("Paid via Stripe: " + amount); }
}

class PaymentService {
    private Payment gateway;
    PaymentService(Payment gateway) {
        this.gateway = gateway;
    }
    void processPayment(double amount) {
        gateway.pay(amount);
    }
}

public class intetface {
    public static void main(String[] args) {
        PaymentService paypalService = new PaymentService(new PayPal());
        paypalService.processPayment(100.0); // Output: Paid via PayPal: 100.0

        PaymentService stripeService = new PaymentService(new Stripe());
        stripeService.processPayment(200.0); // Output: Paid via Stripe: 200.0
    }
}
