package mockito.examples;
public class PaymentService {
    private final PaymentGateway gateway;
    public PaymentService(PaymentGateway gateway) { this.gateway = gateway; }
    public boolean makePayment(double amt) { return gateway.charge(amt); }
}
