package Context;

import java.util.HashMap;
import java.util.Map;

import Strategy.IPaymentStrategy;

public class ShoppingCart {
  Map<String, Double> items = new HashMap<String, Double>();
  double totalPrices = 0.0;
  IPaymentStrategy paymentMethod;

  public void addProduct(String productName, double price) {
    items.put(productName, price);
    totalPrices += price;
  }

  public void removeProduct(String productName) {
    totalPrices -= items.get(productName);
    items.remove(productName);

  }

  public void setPaymentMethod(IPaymentStrategy paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void processPayment() {
    paymentMethod.processPayment(totalPrices);
  }
}