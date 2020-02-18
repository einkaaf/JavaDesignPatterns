package Factory.Model;

import Factory.Shape;

public class Rectangle implements Shape {
  private String color;

  public Rectangle(String color) {
    this.color = color;
  }

  @Override
  public void draw() {
    System.out.println("i am Rectangle shape with color:" + color);
  }
}
