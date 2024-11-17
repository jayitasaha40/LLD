// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    //Client
    ProxyServer proxyServer = new ProxyServer("Admin");
    proxyServer.create();
    proxyServer.delete();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}