package Decorator;

import basepizzas.*;

public class Jalapeno implements Base{
  private Base base;
  int cost;

  public Jalapeno(Base base){
    this.base = base;
    this.cost = base.getCost() + 8;
  }

  public int getCost(){
    System.out.println("Decorator:: Jalapeno:- 8/-");
    return cost;
  }
}