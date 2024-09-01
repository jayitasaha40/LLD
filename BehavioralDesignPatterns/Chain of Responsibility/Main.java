// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import Responsibility.*;

public class Main {
  public static void main(String[] args) {
    Log logger = new LogInfo(new LogDebug(new LogError(null)));

    logger.logProcess("ERROR", "System Terminated");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}