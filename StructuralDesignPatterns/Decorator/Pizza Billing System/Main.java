// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import basepizzas.*;
import Decorator.*;
public class Main {
  public static void main(String[] args) {
    //Create Both Base Pizza
    Base myPizza = new Both();

    //Add Cheese and Onion
    myPizza = new Onion(new Cheese(myPizza));

    System.out.println("Cost of myPizza is: " + myPizza.getCost());
    System.out.println("------------");
    System.out.println("Double Cheese , Onion and Jalapeno Non-Veg cost:- "+
                       new Cheese(
                      new Jalapeno(
                        new Onion(
                          new Cheese
                            (new NonVeg())))).getCost()
                      );
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}