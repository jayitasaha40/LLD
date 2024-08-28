package Vehicles;

import DriveStrategies.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

  public OffRoadVehicle(String name, int minSpeed, int maxSpeed) {
    super(name, minSpeed, maxSpeed, new SportsDriveStrategy(minSpeed, maxSpeed));
  }
}