import Vehicles.*;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Vehicle maruti = new NormalVehicle("Maruti", 20, 100);
    maruti.drive();

    Vehicle himalayan = new OffRoadVehicle("Himalayan", 40, 140);
    himalayan.drive();
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}