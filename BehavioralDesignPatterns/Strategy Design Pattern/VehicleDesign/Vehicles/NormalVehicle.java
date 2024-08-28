package Vehicles;

import DriveStrategies.*;

public class NormalVehicle extends Vehicle {

  public NormalVehicle(String name, int minSpeed, int maxSpeed) {
    super(name, minSpeed, maxSpeed, new NormalDriveStrategy(minSpeed, maxSpeed));
  }
}