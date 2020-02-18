package Builder;

import Builder.Model.Car;

class Main {
  public static void main(String[] args) {
    Car car=CarBuilder.buildCar("BMW ENGINE","18-INCH");
    System.out.println(car.getEngine().getModel());
    System.out.println(car.getWheel().getSize());
  }
}
