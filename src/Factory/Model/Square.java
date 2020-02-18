package Factory.Model;

import Factory.Shape;

public class Square implements Shape {
  private String color;

  public Square(String color) {
    this.color = color;
  }

  @Override
  public void draw() {
    System.out.println("i am suare shape with color:" + color);
  }
}
