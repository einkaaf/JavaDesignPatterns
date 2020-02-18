package Factory;


import Factory.Model.Circle;
import Factory.Model.Rectangle;
import Factory.Model.Square;

;

class ShapeFactory {
  public Shape getShape(String shapeType,String color) {
    switch (shapeType) {
      case "SQUARE":
        return new Square(color);
      case "RECTANGLE":
        return new Rectangle(color);
      default:
        return new Circle(color);
    }
  }
}
