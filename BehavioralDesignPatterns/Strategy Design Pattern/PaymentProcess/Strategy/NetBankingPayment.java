package Strategy;

public class NetBankingPayment implements IPaymentStrategy {
  public void processPayment(double amount) {
    System.out.println("Processing Net Banking payment of " + amount);
  }
}