package AbstractFactory.Car.Model;

import AbstractFactory.Car.Car;

public class BMW implements Car {
  @Override
  public void startEngine() {
    System.out.println("START ENGINE BMW");
  }
}
