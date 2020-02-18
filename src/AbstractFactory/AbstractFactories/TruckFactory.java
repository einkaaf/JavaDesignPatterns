package AbstractFactory.AbstractFactories;

import AbstractFactory.Car.Car;
import AbstractFactory.Truck.Model.DAF;
import AbstractFactory.Truck.Model.VOLVO;
import AbstractFactory.Truck.Truck;

public class TruckFactory extends AbstractFactory {
  @Override
  public Car getCar(String model) {
    return null;
  }

  @Override
  public Truck getTruck(String model) {
    switch (model) {
      case "DAF":
        System.out.println("hello daf!");
        return new DAF();
      case "VOLVO":
        System.out.println("hello volvo!");
        return new VOLVO();
      default:
        System.out.println("hello default! volvo");
        return new VOLVO();
    }
  }
}
