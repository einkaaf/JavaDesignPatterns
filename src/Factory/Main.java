package Factory;

class Main {
  public static void main(String[] args) {
    ShapeFactory shapeFactory=new ShapeFactory();
    Shape shape=shapeFactory.getShape("RECTANGLE","RED");
    shape.draw();
  }
}
