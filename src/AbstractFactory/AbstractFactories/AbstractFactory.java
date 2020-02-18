package AbstractFactory.AbstractFactories;

import AbstractFactory.Car.Car;
import AbstractFactory.Truck.Truck;

public abstract class AbstractFactory {

  public abstract Car getCar(String model);

  public abstract Truck getTruck(String model);

}
