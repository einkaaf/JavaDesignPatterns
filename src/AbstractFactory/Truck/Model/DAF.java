package AbstractFactory.Truck.Model;

import AbstractFactory.Truck.Truck;

public class DAF implements Truck {
  @Override
  public void transport() {
    System.out.println("DAF TRANSPORT");
  }
}
