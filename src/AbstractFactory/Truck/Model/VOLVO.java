package AbstractFactory.Truck.Model;

import AbstractFactory.Truck.Truck;

public class VOLVO implements Truck {
  @Override
  public void transport() {
    System.out.println("VOLVO TRANSPORT");
  }
}
