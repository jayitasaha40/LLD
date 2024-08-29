package DoubleCheckedLocking;

public class DoubleCheckedLocking {
  private static DoubleCheckedLocking instance;

  private DoubleCheckedLocking() {
  }

  public static DoubleCheckedLocking getInstance() {
    if (instance == null) {
      // 2 Threads comes till here at a time
      synchronized (DoubleCheckedLocking.class) {
        // 1st thread only go 2nd thread will wait till 1st thread completes
        // Once 1st thread completes 2nd thread will go but can't as instance not null
        if (instance == null) {
          // 1st thread only come
          instance = new DoubleCheckedLocking();
          System.out.println("Thread Safe Lazy Double Check Lock Instance Created");
        }

      }
    }
    return instance;
  }
}