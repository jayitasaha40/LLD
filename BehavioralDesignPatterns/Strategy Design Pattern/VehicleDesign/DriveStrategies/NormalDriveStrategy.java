package DriveStrategies;

public class NormalDriveStrategy implements IDriveStrategy {

  int minSpeed = 20;
  int maxSpeed = 100;

  public NormalDriveStrategy(int minSpeed, int maxSpeed) {
    this.minSpeed = minSpeed;
    this.maxSpeed = maxSpeed;
  }

  public void drive() {
    System.out.println("Normal Driving with minimum speed of " + minSpeed + " and maximum speed of " + maxSpeed);
  }
}