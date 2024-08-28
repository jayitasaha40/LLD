package DriveStrategies;

public class SportsDriveStrategy implements IDriveStrategy {

  int minSpeed = 50;
  int maxSpeed = 140;

  public SportsDriveStrategy(int minSpeed, int maxSpeed) {
    this.minSpeed = minSpeed;
    this.maxSpeed = maxSpeed;
  }

  public void drive() {
    System.out.println("Sports Mode Driving with minimum speed of " + minSpeed + " and maximum speed of " + maxSpeed);
  }
}