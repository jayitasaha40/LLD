package LazyThreadSafe;

public class LazyThreadSafe {
  private static LazyThreadSafe instance;

  private LazyThreadSafe() {
  }

  public synchronized static LazyThreadSafe getInstance() {
    if (instance == null) {
      instance = new LazyThreadSafe();
      System.out.println("Thread Safe Lazy Instance Created");
    }
    return instance;
  }
}