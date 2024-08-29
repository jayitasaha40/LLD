package EagerInitialization;

public class Eager {
  private static final Eager instance = new Eager();

  private Eager() {
  }

  public static Eager getInstance() {
    System.out.println("Eager Instance");
    return instance;
  }
}