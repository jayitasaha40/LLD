package BillPugh;

public class BillPugh {

  private BillPugh() {
    System.out.println("Called BillPugh Constructor while creating object");
  }

  private static class Instance {
    // It will not loaded automatically while loading the class
    // It will be loaded only when the getInstance() method is called
    private static final BillPugh instance = new BillPugh();
    // Lazy Instance
  }

  public static BillPugh getInstance() {
    return Instance.instance; // this time Instace class will load
  }

}