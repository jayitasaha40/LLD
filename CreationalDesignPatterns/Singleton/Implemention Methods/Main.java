// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import EagerInitialization.*;
import LazyInitialization.*;
import LazyThreadSafe.*;
import DoubleCheckedLocking.*;
import EnumInstance.*;
import BillPugh.*;

public class Main {
  public static void main(String[] args) {
    // Eager.getInstance();
    // Lazy.getInstance();

    // LazyThreadSafe.getInstance();
    // LazyThreadSafe.getInstance();
    // LazyThreadSafe.getInstance();

    // DoubleCheckedLocking.getInstance();
    // DoubleCheckedLocking.getInstance();
    // DoubleCheckedLocking.getInstance();
    // DoubleCheckedLocking.getInstance();

    // EnumInstance.INSTANCE.run();
    // EnumInstance.INSTANCE.run();

    BillPugh.getInstance();
    BillPugh.getInstance();
    BillPugh.getInstance();

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}