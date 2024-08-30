import Context.ShoppingCart;
import Strategy.*;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    cart.addProduct("DSA Book", 500);
    cart.addProduct("System Design Book", 800);
    cart.addProduct("Diary", 200);

    cart.removeProduct("Diary");

    cart.setPaymentMethod(new NetBankingPayment());
    cart.processPayment();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}