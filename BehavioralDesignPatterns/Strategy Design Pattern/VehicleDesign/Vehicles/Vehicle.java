package Vehicles;

import DriveStrategies.IDriveStrategy;

public class Vehicle {
  String name;
  int minSpeed;
  int maxSpeed;
  IDriveStrategy driveStrategy;

  public Vehicle(String name, int minSpeed, int maxSpeed, IDriveStrategy driveStrategy) {
    this.name = name;
    this.minSpeed = minSpeed;
    this.maxSpeed = maxSpeed;
    this.driveStrategy = driveStrategy;
  }

  public void drive() {
    driveStrategy.drive();
  }
}