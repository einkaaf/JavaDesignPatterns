package AbstractFactory;

import AbstractFactory.AbstractFactories.AbstractFactory;
import AbstractFactory.AbstractFactories.FactoryProducer;
import AbstractFactory.Car.Car;

class Main {
  public static void main(String[] args) {
    AbstractFactory factory = FactoryProducer.getFactory("Car");
    Car car=factory.getCar("BENZ");
    car.startEngine();
  }
}
