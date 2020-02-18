package AbstractFactory.AbstractFactories;

import AbstractFactory.Car.Car;
import AbstractFactory.Car.Model.BENZ;
import AbstractFactory.Car.Model.BMW;
import AbstractFactory.Truck.Truck;

public class CarFactory extends AbstractFactory {
  @Override
  public Car getCar(String model) {
    switch (model) {
      case "BENZ":
        System.out.println("hello BENZ!");
        return new BENZ();
      case "BMW":
        System.out.println("hello BMW!");
        return new BMW();
      default:
        System.out.println("hello default! BMW");
        return new BMW();
    }
  }

  @Override
  public Truck getTruck(String model) {
    return null;
  }
}
