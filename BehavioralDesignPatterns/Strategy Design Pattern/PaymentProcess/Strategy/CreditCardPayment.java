package Strategy;

public class CreditCardPayment implements IPaymentStrategy {
  public void processPayment(double amount) {
    System.out.println("Processing Credit Card payment of " + amount);
  }
}