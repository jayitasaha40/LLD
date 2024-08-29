package EnumInstance;

public enum EnumInstance {
  INSTANCE; //// The single Thread Safe instance
  // Not Lazy,instance is created when the enum is loaded

  public void run() {
    // Not Static as via EnumInstance.INSTANCE we can call this function
    System.out.println("Running Enum Instance");
  }

}
