package Vehicles;

import DriveStrategies.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

  public SportsVehicle(String name, int minSpeed, int maxSpeed) {
    super(name, minSpeed, maxSpeed, new SportsDriveStrategy(minSpeed, maxSpeed));
  }
}