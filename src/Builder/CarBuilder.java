package Builder;

import Builder.Model.Car;
import Builder.Model.Engine;
import Builder.Model.Wheel;

public class CarBuilder {
  public static Car buildCar(String engineModel, String wheelModel) {

    Car car = new Car();

    Engine engine = new Engine();
    engine.setModel(engineModel);

    Wheel wheel = new Wheel();
    wheel.setSize(wheelModel);

    car.setEngine(engine);
    car.setWheel(wheel);

    System.out.println("Car were built");

    return car;
  }
}
