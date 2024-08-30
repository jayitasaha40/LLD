package Strategy;

public class UPIPayment implements IPaymentStrategy {
  public void processPayment(double amount) {
    System.out.println("Processing UPI payment of " + amount);
  }
}