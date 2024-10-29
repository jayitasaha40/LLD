package Decorator;

import basepizzas.*;

public class Cheese implements Base{
  private Base base;
  int cost;

  public Cheese(Base base){
    this.base = base;
    this.cost = base.getCost() + 10;
  }

  public int getCost(){
    System.out.println("Decorator:: Cheese:- 10/-");
    return cost;
  }
}