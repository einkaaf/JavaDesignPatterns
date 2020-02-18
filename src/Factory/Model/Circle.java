package Factory.Model;

import Factory.Shape;

public class Circle implements Shape {
  private String color;

  public Circle(String color) {
    this.color = color;
  }

  @Override
  public void draw() {
    System.out.println("i am Circle shape with color:" + color);
  }
}
