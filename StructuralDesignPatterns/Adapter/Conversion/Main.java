// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    //Clint
    WeightMachineAdapter machine = new WeightMachineAdapter(new WeightMachineAdaptee());
    System.out.println(machine.getKgWeight());
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}