package Decorator;

import basepizzas.*;

public class Onion implements Base {
  private Base base;
  int cost;

  public Onion(Base base) {
    this.base = base;
    this.cost = base.getCost() + 5;
  }

  public int getCost() {
    System.out.println("Decorator:: Onion:- 5/-");
    return cost;
  }
}