

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    House house = new House.HouseBuilder().
                    setBedroom(2)
                    .setBathroom(2)
                    .setKitchen(3)
                    .build();

    System.out.println(house.bedroom);
  }
  

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}