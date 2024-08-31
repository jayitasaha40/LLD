// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import Context.*;
import Strategy.*;

public class Main {
  public static void main(String[] args) {
    // Client decides which sorting strategy to use at runtime
    Sort sort = new Sort();
    int[] arr = { 1, 2, 3, 4, 5 };

    sort.setSortingStrategy(new MergeSort());
    sort.sort(arr);

    sort.setSortingStrategy(new QuickSort());
    sort.sort(arr);
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}