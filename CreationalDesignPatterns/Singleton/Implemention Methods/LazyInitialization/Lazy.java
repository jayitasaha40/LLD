package LazyInitialization;

public class Lazy {
  private static Lazy instance;

  private Lazy() {
  }

  public static Lazy getInstance() {
    if (instance == null) {
      instance = new Lazy();
      System.out.println("Created Object");
    }
    System.out.println("Lazy Instance");
    return instance;
  }
}